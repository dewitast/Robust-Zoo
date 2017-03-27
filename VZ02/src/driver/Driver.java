package driver;
import zoo.*;
import point.*;
import java.util.Random;

/**
 * File : Driver.java
 * Kelas Driver merupakan kelas sebagai pilihan menu aplikasi.
 * @author Catherine Almira - 13515111
 */
public class Driver {
	  private Zoo z;
	  private boolean[][] visited;
	  private Point p;

	  /**
	    * Constructor Driver.
	    * Menciptakan Zoo dengan konfigurasi dari file eksternal.
	    */
	  public Driver() {
		z = new Zoo();
	    z.readMap();
	    visited = new boolean[z.getBaris()][z.getKolom()];
	    z.readAnimal();
	    p = new Point(-1,-1);
	  }
	  /**
	    * I.S. Zoo sudah ada.
	    * F.S. Zoo sudah tercetak pada layar dengan ukuran sesuai input pengunjung.
	    */
	  public void displayZoo() {
	    for (int i = 0; i < z.getJumlahCage(); ++i) {
	      z.getCage(i).move();
	    }
	    System.out.println(z);
	  }
	  /**
	    * I.S. Pengunjung sudah memasuki zoo dan melakukan tour.
	    * F.S. Experience berupa interaksi dari seluruh binatang di cage
	    * sekitar tercetak pada layar.
	    */
	  public void getExperience() {
	    if (p.getAbsis()>0) {
	      if (z.getElement(p.prevX()).isHabitat()) {
	        (z.searchPoint(p.prevX())).interact();
	      }
	    }
	    if (p.getAbsis()<z.getBaris()-1) {
	      if ((z.getElement(p.nextX())).isHabitat()) {
	        (z.searchPoint(p.nextX())).interact();
	      }
	    }
	    if (p.GetOrdinat()>0)
	    {
	      if ((z.getElement(p.prevY())).isHabitat()) {
	        (z.searchPoint(p.prevY())).interact();
	      }
	    }
	    if (p.getAbsis()<z.getKolom()-1)
	    {
	      if ((z.getElement(p.nextY())).isHabitat()) {
	        (z.searchPoint(p.nextY())).interact();
	      }
	    }
	  }
	  /**
	    * I.S. Zoo sudah ada.
	    * F.S. Pengunjung melakukan tour sampai selesai,
	    * antara mencapai exit atau tidak ada pilihan jalan lain.
	    * Selagi perjalanan, semua experience tercetak di layar.
	    */
	  public void tourZoo() {
	    for (int i = 0; i < z.getJumlahCage(); ++i) {
	      z.getCage(i).move();
	    }
	    Random rand = new Random();
	    int random;
	    boolean found = false;
	    if ((p.getAbsis()==-1)&&(p.getOrdinat()==-1)) {
	      System.out.println("Welcome to the zoo.");
	      System.out.println(" ");
	      while (!found) {
	        for (int i = 0; i < z.getBaris(); ++i) {
	          for (int j = 0; j < z.getKolom(); ++j) {
	            visited[i][j] = false;
	          }
	        }
	        rand = new Random();
	        random = rand.nextInt(z.getBaris());
	        if ((z.getElement(0,random)).isEntrance()) {
	          found = true;
	          p.setAbsis(0);
	          p.setOrdinat(random);
	        }
	        else if ((z.getElement(z.getBaris()-1,random)).isEntrance()) {
	          found = true;
	          p.setAbsis(z.getBaris()-1);
	          p.setOrdinat(random);
	        }   
	        if (!found) {
	          rand = new Random();
	          random = rand.nextInt(z.getKolom());
	          if ((z.getElement(random,0)).isEntrance()) {
	            found = true;
	            p.setAbsis(random);
	            p.setOrdinat(0);
	          }
	          else if ((z.getElement(random,z.getKolom()-1)).isEntrance()) {
	            found = true;
	            p.setAbsis(random);
	            p.setOrdinat(z.GetKolom()-1);
	          }
	        }
	      }
	    }
	    else {
	      visited[p.getAbsis()][p.getOrdinat()] = true;
	      boolean b1 = ((p.getAbsis()>0)&&(!visited[p.getAbsis()-1][p.getOrdinat()])&&((z.getElement(p.getAbsis()-1,p.getOrdinat()))).isRoad());
	      boolean b2 = ((p.getOrdinat()<z.getKolom()-1)&&(!visited[p.getAbsis()][p.getOrdinat()+1])&&((z.getElement(p.getAbsis(),p.getOrdinat()+1))).IsRoad());
	      boolean b3 = ((p.getAbsis()<z.getBaris()-1)&&(!visited[p.getAbsis()+1][p.getOrdinat()])&&((z.getElement(p.getAbsis()+1,p.getOrdinat()))).IsRoad());
	      boolean b4 = ((p.getOrdinat()>0)&&(!visited[p.getAbsis()][p.getOrdinat()-1])&&((z.getElement(p.getAbsis(),p.getOrdinat()-1))).isRoad());
	      if ((!b1)&&(!b2)&&(!b3)&&(!b4)) {
	        p.setAbsis(-1);
	        p.setOrdinat(-1);
	        return;
	      }
	      while (!found) {
	        rand = new Random();
	        random = rand.nextInt(4);
	        if (random == 0) {
	          if (b1) {
	            found = true;
	            p.setAbsis(p.getAbsis()-1);
	          } 
	        }
	        else if (random == 1) {
	          if (b2) {
	            found = true;
	            p.setOrdinat(p.getOrdinat()+1);
	          }
	        }
	        else if (random == 2) {
	          if (b3) {
	            found = true;
	            p.setAbsis(p.getAbsis()+1);
	          }
	        }
	        else if (random == 3) {
	          if (b4) {
	            found = true;
	            p.setOrdinat(p.getOrdinat()-1);
	          } 
	        }
	      }
	      GetExperience();
	      if ((z.getElement(p)).isExit()) {
	        System.out.println("Posisi : (" + p.getAbsis() + "," + p.getOrdinat() + ")");
	        System.out.println("You've reached the end of this journey.");
	        p.setAbsis(-1);
	        p.setOrdinat(-1);
	      }
	    }
	    if (p.getAbsis()!=-1)
	      System.out.println("Posisi : (" + p.getAbsis() + "," + p.getOrdinat() + ")");
	      System.out.println();
	  }
	  /**
	    * Melakukan perhitungan makanan (sayuran) yang harus disiapkan.
	    * @return Mengembalikan jumlah makanan (sayuran) yang harus disiapkan.
	    */
	  public float foodCalcVeggie() {
	    float sum = 0;
	    for(int i = 0; i < z.getJumlahCage(); i++) {
	      for(int j = 0; j < (z.getCage(i)).getTotalAnimal(); j++) {
	        sum += ((z.getCage(i)).getAnimal(j)).getFoodVeggie();
	      }
	    }
	    return sum;
	  }
	  /**
	    * Melakukan perhitungan makanan (daging) yang harus disiapkan.
	    * @return Mengembalikan jumlah makanan (daging) yang harus disiapkan.
	    */
	  public float foodCalcMeat() {
	    float sum = 0;
	    for(int i = 0; i < z.getJumlahCage(); i++) {
	      for(int j = 0; j < (z.getCage(i)).getTotalAnimal(); j++) {
	        sum += ((z.getCage(i)).getAnimal(j)).getFoodMeat();
	      }
	    }
	    return sum;
	  }
	  /**
	    * I.S. sembarang.
	    * F.S. Menu telah tercetak ke layar.
	    */
	  public void displayMenu() {
	    System.out.println("Main Menu:");
	    System.out.println("1. Display Zoo");
	    System.out.println("2. Tour Around Zoo");
	    System.out.println("3. Animal's Food Calculation");
	    System.out.println("4. Exit");
	    System.out.print("Input your number of choice here: ");
	  }
	  /**
	    * Getter Zoo.
	    * @return Mengembalikan zoo.
	    */
	  public Zoo getZoo() {
	    return z;
	  }
	  /**
	    * Getter Point.
	    * @return Mengembalikan point.
	    */
	  public Point getPoint() {
	    return p;
	  }
}
