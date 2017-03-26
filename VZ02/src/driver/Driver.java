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
	  public Zoo z;
	  public boolean visited[][];
	  public Point p;

	  /**
	    * Constructor Driver.
	    * Menciptakan Zoo dengan konfigurasi dari file eksternal.
	    */
	  public Driver() {
	    /*p(-1,-1);
	    BELOM KELAR
	    BACA FILE BELOM*/
	  }
	  /**
	    * I.S. Zoo sudah ada.
	    * F.S. Zoo sudah tercetak pada layar dengan ukuran sesuai input pengunjung.
	    */
	  public void DisplayZoo() {
	    for (int i = 0; i < z.GetJumlahCage(); ++i) {
	      z.GetCage(i).Move();
	    }
	    System.out.println(z);
	  }
	  /**
	    * I.S. Pengunjung sudah memasuki zoo dan melakukan tour.
	    * F.S. Experience berupa interaksi dari seluruh binatang di cage
	    * sekitar tercetak pada layar.
	    */
	  public void GetExperience() {
	    if (p.GetAbsis()>0) {
	      if (z.GetElement(p.PrevX()).IsHabitat()) {
	        (z.SearchPoint(p.PrevX())).Interact();
	      }
	    }
	    if (p.GetAbsis()<z.GetBaris()-1) {
	      if ((z.GetElement(p.NextX())).IsHabitat()) {
	        (z.SearchPoint(p.NextX())).Interact();
	      }
	    }
	    if (p.GetOrdinat()>0)
	    {
	      if ((z.GetElement(p.PrevY())).IsHabitat()) {
	        (z.SearchPoint(p.PrevY())).Interact();
	      }
	    }
	    if (p.GetAbsis()<z.GetKolom()-1)
	    {
	      if ((z.GetElement(p.NextY())).IsHabitat()) {
	        (z.SearchPoint(p.NextY())).Interact();
	      }
	    }
	  }
	  /**
	    * I.S. Zoo sudah ada.
	    * F.S. Pengunjung melakukan tour sampai selesai,
	    * antara mencapai exit atau tidak ada pilihan jalan lain.
	    * Selagi perjalanan, semua experience tercetak di layar.
	    */
	  public void TourZoo() {
	    for (int i = 0; i < z.GetJumlahCage(); ++i) {
	      z.GetCage(i).Move();
	    }
	    Random rand = new Random();
	    int random;
	    boolean found = false;
	    if ((p.GetAbsis()==-1)&&(p.GetOrdinat()==-1)) {
	      System.out.println("Welcome to the zoo.");
	      while (!found) {
	        for (int i = 0; i < z.GetBaris(); ++i) {
	          for (int j = 0; j < z.GetKolom(); ++j) {
	            visited[i][j] = false;
	          }
	        }
	        rand = new Random();
	        random = rand.nextInt(z.GetBaris());
	        if ((z.GetElement(0,random)).IsEntrance()) {
	          found = true;
	          p.SetAbsis(0);
	          p.SetOrdinat(random);
	        }
	        else if ((z.GetElement(z.GetBaris()-1,random)).IsEntrance()) {
	          found = true;
	          p.SetAbsis(z.GetBaris()-1);
	          p.SetOrdinat(random);
	        }   
	        if (!found) {
	          rand = new Random();
	          random = rand.nextInt(z.GetKolom());
	          if ((z.GetElement(random,0)).IsEntrance()) {
	            found = true;
	            p.SetAbsis(random);
	            p.SetOrdinat(0);
	          }
	          else if ((z.GetElement(random,z.GetKolom()-1)).IsEntrance()) {
	            found = true;
	            p.SetAbsis(random);
	            p.SetOrdinat(z.GetKolom()-1);
	          }
	        }
	      }
	    }
	    else {
	      visited[p.GetAbsis()][p.GetOrdinat()] = true;
	      boolean b1 = ((p.GetAbsis()>0)&&(!visited[p.GetAbsis()-1][p.GetOrdinat()])&&((z.GetElement(p.GetAbsis()-1,p.GetOrdinat()))).IsRoad());
	      boolean b2 = ((p.GetOrdinat()<z.GetKolom()-1)&&(!visited[p.GetAbsis()][p.GetOrdinat()+1])&&((z.GetElement(p.GetAbsis(),p.GetOrdinat()+1))).IsRoad());
	      boolean b3 = ((p.GetAbsis()<z.GetBaris()-1)&&(!visited[p.GetAbsis()+1][p.GetOrdinat()])&&((z.GetElement(p.GetAbsis()+1,p.GetOrdinat()))).IsRoad());
	      boolean b4 = ((p.GetOrdinat()>0)&&(!visited[p.GetAbsis()][p.GetOrdinat()-1])&&((z.GetElement(p.GetAbsis(),p.GetOrdinat()-1))).IsRoad());
	      if ((!b1)&&(!b2)&&(!b3)&&(!b4)) {
	        p.SetAbsis(-1);
	        p.SetOrdinat(-1);
	        return;
	      }
	      while (!found) {
	        rand = new Random();
	        random = rand.nextInt(4);
	        if (random == 0) {
	          if (b1) {
	            found = true;
	            p.SetAbsis(p.GetAbsis()-1);
	          } 
	        }
	        else if (random == 1) {
	          if (b2) {
	            found = true;
	            p.SetOrdinat(p.GetOrdinat()+1);
	          }
	        }
	        else if (random == 2) {
	          if (b3) {
	            found = true;
	            p.SetAbsis(p.GetAbsis()+1);
	          }
	        }
	        else if (random == 3) {
	          if (b4) {
	            found = true;
	            p.SetOrdinat(p.GetOrdinat()-1);
	          } 
	        }
	      }
	      GetExperience();
	      if ((z.GetElement(p)).IsExit()) {
	        System.out.println("Posisi : (" + p.GetAbsis() + "," + p.GetOrdinat() + ")");
	        System.out.println("You've reached the end of this journey.");
	        p.SetAbsis(-1);
	        p.SetOrdinat(-1);
	      }
	    }
	    if (p.GetAbsis()!=-1)
	      System.out.println("Posisi : (" + p.GetAbsis() + "," + p.GetOrdinat() + ")");
	  }
	  /**
	    * Melakukan perhitungan makanan (sayuran) yang harus disiapkan.
	    * @return Mengembalikan jumlah makanan (sayuran) yang harus disiapkan.
	    */
	  public float FoodCalcVeggie() {
	    float sum = 0;
	    for(int i = 0; i < z.GetJumlahCage(); i++) {
	      for(int j = 0; j < (z.GetCage(i)).GetTotalAnimal(); j++) {
	        sum += ((z.GetCage(i)).GetAnimal(j)).GetFoodVeggie();
	      }
	    }
	    return sum;
	  }
	  /**
	    * Melakukan perhitungan makanan (daging) yang harus disiapkan.
	    * @return Mengembalikan jumlah makanan (daging) yang harus disiapkan.
	    */
	  public float FoodCalcMeat() {
	    float sum = 0;
	    for(int i = 0; i < z.GetJumlahCage(); i++) {
	      for(int j = 0; j < (z.GetCage(i)).GetTotalAnimal(); j++) {
	        sum += ((z.GetCage(i)).GetAnimal(j)).GetFoodMeat();
	      }
	    }
	    return sum;
	  }
	  /**
	    * I.S. sembarang.
	    * F.S. Menu telah tercetak ke layar.
	    */
	  public void DisplayMenu() {
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
	  public Zoo GetZoo() {
	    return z;
	  }
	  /**
	    * Getter Point.
	    * @return Mengembalikan point.
	    */
	  public Point GetPoint() {
	    return p;
	  }
}