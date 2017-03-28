package driver;

import java.util.Random;

import point.Point;

import zoo.Zoo;
/**
 * File : Driver.java
 * Kelas Driver merupakan kelas sebagai pilihan menu aplikasi.
 * @author Catherine Almira - 13515111
 */

public class Driver {
  private Zoo zoo;
  private boolean[][] visited;
  private Point point;
  /**
   * Constructor Driver.
   * Menciptakan Zoo dengan konfigurasi dari file eksternal.
   */

  public Driver() {
    zoo = new Zoo();
    zoo.readMap();
    visited = new boolean[zoo.getBaris()][zoo.getKolom()];
    zoo.readAnimal();
    point = new Point(-1,-1);
  }
  /**
   * I.S. Zoo sudah ada.
   * F.S. Zoo sudah tercetak pada layar dengan ukuran sesuai input pengunjung
   * @param absAwal absis titik yang menjadi titik awal pencetakan.
   * @param ordAwal ordinat titik yang menjadi titik awal pencetakan.
   * @param absAkhir absis titik yang menjadi titik akhir pencetakan.
   * @param ordAkhir ordinat titik yang menjadi titik akhir pencetakan..
   */

  public void displayZoo(int absAwal, int ordAwal, int absAkhir, int ordAkhir) {
    for (int i = 0; i < zoo.getJumlahCage(); ++i) {
      zoo.getCage(i).move();
    }
    System.out.println(zoo.toString(absAwal, ordAwal, absAkhir, ordAkhir));
  }
  /**
   * I.S. Pengunjung sudah memasuki zoo dan melakukan tour.
   * F.S. Experience berupa interaksi dari seluruh binatang di cage
   * sekitar tercetak pada layar.
   */

  public void getExperience() {
    if (point.getAbsis() > 0) {
      if (zoo.getElement(point.prevX()).isHabitat()) {
        (zoo.searchPoint(point.prevX())).interact();
      }
    }
    if (point.getAbsis() < zoo.getBaris() - 1) {
      if ((zoo.getElement(point.nextX())).isHabitat()) {
        (zoo.searchPoint(point.nextX())).interact();
      }
    }
    if (point.getOrdinat() > 0) {
      if ((zoo.getElement(point.prevY())).isHabitat()) {
        (zoo.searchPoint(point.prevY())).interact();
      }
    }
    if (point.getAbsis() < zoo.getKolom() - 1) {
      if ((zoo.getElement(point.nextY())).isHabitat()) {
        (zoo.searchPoint(point.nextY())).interact();
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
    for (int i = 0; i < zoo.getJumlahCage(); ++i) {
      zoo.getCage(i).move();
    }
    Random rand = new Random();
    int random;
    boolean found = false;
    if ((point.getAbsis() == -1) && (point.getOrdinat() == -1)) {
      System.out.println("Welcome to the zoo.");
      System.out.println(" ");
      while (!found) {
        for (int i = 0; i < zoo.getBaris(); ++i) {
          for (int j = 0; j < zoo.getKolom(); ++j) {
            visited[i][j] = false;
          }
        }
        rand = new Random();
        random = rand.nextInt(zoo.getBaris());
        if ((zoo.getElement(0, random)).isEntrance()) {
          found = true;
          point.setAbsis(0);
          point.setOrdinat(random);
        } else if ((zoo.getElement(zoo.getBaris() - 1,random)).isEntrance()) {
          found = true;
          point.setAbsis(zoo.getBaris() - 1);
          point.setOrdinat(random);
        }
        if (!found) {
          rand = new Random();
          random = rand.nextInt(zoo.getKolom());
          if ((zoo.getElement(random, 0)).isEntrance()) {
            found = true;
            point.setAbsis(random);
            point.setOrdinat(0);
          } else if ((zoo.getElement(random, zoo.getKolom() - 1)).isEntrance()) {
            found = true;
            point.setAbsis(random);
            point.setOrdinat(zoo.getKolom() - 1);
          }
        }
      }
    } else {
      visited[point.getAbsis()][point.getOrdinat()] = true;
      boolean b1 = ((point.getAbsis() > 0) && (!visited[point.getAbsis() - 1][point.getOrdinat()])
          && ((zoo.getElement(point.getAbsis() - 1, point.getOrdinat()))).isRoad());
      boolean b2 = ((point.getOrdinat() < zoo.getKolom() - 1)
          && (!visited[point.getAbsis()][point.getOrdinat() + 1])
          && ((zoo.getElement(point.getAbsis(), point.getOrdinat() + 1))).isRoad());
      boolean b3 = ((point.getAbsis() < zoo.getBaris() - 1)
          && (!visited[point.getAbsis() + 1][point.getOrdinat()])
          && ((zoo.getElement(point.getAbsis() + 1, point.getOrdinat()))).isRoad());
      boolean b4 = ((point.getOrdinat() > 0) && (!visited[point.getAbsis()][point.getOrdinat() - 1])
          && ((zoo.getElement(point.getAbsis(), point.getOrdinat() - 1))).isRoad());
      if ((!b1) && (!b2) && (!b3) && (!b4)) {
        point.setAbsis(-1);
        point.setOrdinat(-1);
        return;
      }
      while (!found) {
        rand = new Random();
        random = rand.nextInt(4);
        if (random == 0) {
          if (b1) {
            found = true;
            point.setAbsis(point.getAbsis() - 1);
          }
        } else if (random == 1) {
          if (b2) {
            found = true;
            point.setOrdinat(point.getOrdinat() + 1);
          }
        } else if (random == 2) {
          if (b3) {
            found = true;
            point.setAbsis(point.getAbsis() + 1);
          }
        } else if (random == 3) {
          if (b4) {
            found = true;
            point.setOrdinat(point.getOrdinat() - 1);
          }
        }
      }
      getExperience();
      if ((zoo.getElement(point)).isExit()) {
        System.out.println("Posisi : (" + point.getAbsis() + "," + point.getOrdinat() + ")");
        System.out.println("You've reached the end of this journey.");
        point.setAbsis(-1);
        point.setOrdinat(-1);
      }
    }
    if (point.getAbsis() != -1) {
      System.out.println("Posisi : (" + point.getAbsis() + "," + point.getOrdinat() + ")");
      System.out.println();
    }
  }
  /**
   * Melakukan perhitungan makanan (sayuran) yang harus disiapkan.
   * @return Mengembalikan jumlah makanan (sayuran) yang harus disiapkan.
   */

  public float foodCalcVeggie() {
    float sum = 0;
    for (int i = 0; i < zoo.getJumlahCage(); i++) {
      for (int j = 0; j < (zoo.getCage(i)).getTotalAnimal(); j++) {
        sum += ((zoo.getCage(i)).getAnimal(j)).getFoodVeggie();
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
    for (int i = 0; i < zoo.getJumlahCage(); i++) {
      for (int j = 0; j < (zoo.getCage(i)).getTotalAnimal(); j++) {
        sum += ((zoo.getCage(i)).getAnimal(j)).getFoodMeat();
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
    return zoo;
  }
  /**
   * Getter Point.
   * @return Mengembalikan point.
   */

  public Point getPoint() {
    return point;
  }
}