package zoo;

import animal.Animal;

import cage.Cage;

import cell.Cell;

import java.io.*;

import java.util.Scanner;

import point.Point;

/**
 * File : Zoo.java
 * Kelas zoo merepresentasikan kebun binatang dengan matriks cell,
 * kumpulan cage.
 * @author Dewita Sonya Tarabunga  -  13515021
 */
public class Zoo {
  private final int MAXBARIS = 100;
  private final int MAXKOLOM = 100;
  private int baris;
  private int kolom;
  private Cell[][] cell;
  private final int MAXJUMLAHCAGE = 100;
  private int jumlahCage;
  private Cage[] cage;

  /**
    * Constructor tanpa parameter.
    */

  public Zoo() {
    baris = 0;
    kolom = 0;
    cell = new Cell[MAXBARIS][MAXKOLOM];
    jumlahCage = 0;
    cage = new Cage[MAXJUMLAHCAGE];
  }
  /**
    * Constructor dengan parameter.
    * @param brs nilai ukuran baris kebun binatang.
    * @param kol nilai ukuran kolom kebun binatang.
    */

  public Zoo(int brs, int kol) {
    baris = brs;
    kolom = kol;
    cell = new Cell[MAXBARIS][MAXKOLOM];
    jumlahCage = 0;
    cage = new Cage[MAXJUMLAHCAGE];
  }
  /**
    * Getter elemen pada cell.
    * Mengembalikan cell zoo pada posisi p.
    * @param p Objek point yang akan dikembalikan.
    * @return elemen cell pada matriks dengan koordinat p.
    */
    
  public Cell getElement(Point p) {
    int brs = p.getAbsis();
    int kol = p.getOrdinat();
    return (cell[brs][kol]);
  }
  /**
    * Getter elemen pada cell.
    * Mengembalikan cell zoo pada baris brs dan kolom kol.
    * @param brs nilai baris matriks yang akan dikembalikan.
    * @param kol nilai kolom matriks yang akan dikembalikan.
    * @return elemen cell pada matriks dengan baris brs dan kolom kol.
    */

  public Cell getElement(int brs, int kol) {
    return (cell[brs][kol]);
  }
  /**
    * Getter ukuran baris pada kebun binatang.
    * @return ukuran baris pada kebun binatang.
    */

  public int getBaris() {
    return baris;
  }
  /**
    * Getter ukuran kolom pada kebun binatang.
    * @return ukuran kolom pada kebun binatang.
    */

  public int getKolom() {
    return kolom;
  }
  /**
    * Getter jumlah cage pada kebun binatang.
    * @return jumlah cage pada kebun binatang.
    */

  public int getJumlahCage() {
    return jumlahCage;
  }
  /**
    * Getter cage.
    * Mengembalikan cage sesuai indeks pada kebun binatang.
    * @param indeks nilai indeks yang akan di kembalikan.
    * @return Objek cage sesuai indeks pada kebun binatang.
    */

  public Cage getCage(int indeks) {
    return cage[indeks];
  }
  /**
    * Mencari point p berada pada cage mana.
    * @param abs nilai absis yang akan dicari.
    * @param ord nilai ordinat yang akan dicari.
    * @return Objek cage yang mengandung point yang dicari.
    */

  public Cage searchPoint(int abs, int ord) {
    boolean found = false;
    int i = 0;
    Point p = new Point(abs, ord);
    while (!found && (i < jumlahCage)) {
      if (cage[i].isInCage(p)) {
        found = true;
      } else {
        ++i;
      }
    }
    if (found) {
      return cage[i];
    } else {
      return cage[0];
    }
  }
  /**
    * Mencari point p berada pada cage mana.
    * @param p Objek point yang akan dicari.
    * @return Objek cage yang mengandung point yang dicari.
    */

  public Cage searchPoint(Point p) {
    boolean found = false;
    int i = 0;
    while (!found && (i < jumlahCage)) {
      if (cage[i].isInCage(p)) {
        found = true;
      } else {
        ++i;
      }
    }
    if (found) {
      return cage[i];
    } else {
      return cage[0];
    }
  }
  /**
    * I.S. Zoo sembarang dan c terdefinisi.
    * F.S. Zoo baru dengan tambahan cage c.
    * @param c Cage yang akan ditambahkan pada zoo.
    */

  public void addCage(Cage c) {
    cage[jumlahCage] = new Cage(c);
    ++jumlahCage;
  }
  /**
    * I.S. File eksternal "map.txt" sudah tersedia.
    * F.S. Zoo terkonfigurasi dari file eksternal.
    */

  public void readMap() {
    File fileName = new File("map.txt");
    try {
      Scanner sc = new Scanner(fileName);
      baris = sc.nextInt();
      kolom = sc.nextInt();
      Cage cg;
      char c;
      for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
          c = sc.next().charAt(0);
          if (c == '@') {
            cell[i][j] = new Cell("LandHabitat");
            if ((i != 0) && (cell[i - 1][j].isLandHabitat())) {
              searchPoint(i - 1, j).addPoint(i, j);
            } else if ((j != 0) && (cell[i][j - 1].isLandHabitat())) {
              searchPoint(i, j - 1).addPoint(i, j);
            } else {
              cg = new Cage(i, j);
              addCage(cg);
            }
          } else if (c == '^') {
            cell[i][j] = new Cell("AirHabitat");
            if ((i != 0) && (cell[i - 1][j].isAirHabitat())) {
              searchPoint(i - 1, j).addPoint(i, j);
            } else if ((j != 0) && (cell[i][j - 1].isAirHabitat())) {
              searchPoint(i, j - 1).addPoint(i, j);
            } else {
              cg = new Cage(i, j);
              addCage(cg);
            }
          } else if (c == '~') {
            cell[i][j] = new Cell("WaterHabitat");
            if ((i != 0) && (cell[i - 1][j].isWaterHabitat())) {
              searchPoint(i - 1, j).addPoint(i, j);
            } else if ((j != 0) && (cell[i][j - 1].isWaterHabitat())) {
              searchPoint(i, j - 1).addPoint(i, j);
            } else {
              cg = new Cage(i, j);
              addCage(cg);
            }
          } else if (c == 'S') {
            cell[i][j] = new Cell("Restaurant");
          } else if (c == '#') {
            cell[i][j] = new Cell("Park");
          } else if (c == '+') {
            cell[i][j] = new Cell("Road");
          } else if (c == 'X') {
            cell[i][j] = new Cell("Exit");
          } else if (c == 'Z') {
            cell[i][j] = new Cell("Entrance");
          }
        }
      }
      sc.close();
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
  /**
    * I.S. File eksternal "animal.txt" sudah tersedia, peta zoo sudah ada.
    * F.S. Zoo sudah terisi binatang dari file eksternal.
    */

  public void readAnimal() {
    File fileName = new File("animal.txt");
    try {
      Scanner sc = new Scanner(fileName);
      char c;
      int abs;
      int ord;
      int jh;
      Point p;
      String[] h;
      Animal a;
      while (sc.hasNextLine()) {
        c = sc.next().charAt(0);
        abs = sc.nextInt();
        ord = sc.nextInt();
        p = new Point(abs, ord);
        if (c == 'A') {
          h = new String[2];
          jh = 2;
          h[0] = "Land";
          h[1] = "Water";
          a = new Animal(p, "Alligator", "Grrrrrr", "Carnivore", h, 125, 6.25, 0, jh, false, c);
          if ((getElement(abs - 1, ord - 1).isLandHabitat())
              || (getElement(abs - 1, ord - 1).isWaterHabitat())) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'C') {
          h = new String[1];
          jh = 1;
          h[0] = "Land";
          a = new Animal(p, "Cobra", "Ssshh!", "Carnivore", h, 20, 1, 0, jh, false, c);
          if (getElement(abs - 1, ord - 1).isLandHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'M') {
          h = new String[2];
          jh = 2;
          h[0] = "Air";
          h[1] = "Water";
          a = new Animal(p, "Cormorant", "Ooookkk!", "Carnivore", h, 3.6, 0.18, 0, jh, true, c);
          if ((getElement(abs - 1,ord - 1).isAirHabitat())
              || (getElement(abs - 1, ord - 1).isWaterHabitat())) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'N') {
          h = new String[1];
          jh = 1;
          h[0] = "Water";
          a = new Animal(p, "Dolphin", "A a a a a", "Carnivore", h, 75, 3.75, 0, jh, true, c);
          if (getElement(abs - 1, ord - 1).isWaterHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'D') {
          h = new String[1];
          jh = 1;
          h[0] = "Water";
          a = new Animal(p, "Duck", "Quaackk!", "Omnivore", h, 12, 0.6, 0.6, jh, true, c);
          if (getElement(abs - 1, ord - 1).isWaterHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'U') {
          h = new String[1];
          jh = 1;
          h[0] = "Water";
          a = new Animal(p, "Dugong", "Splashh!", "Herbivore", h, 500, 0, 25, jh, true, c);
          if (getElement(abs - 1, ord - 1).isWaterHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'E') {
          h = new String[1];
          jh = 1;
          h[0] = "Air";
          a = new Animal(p, "Eagle", "Nguiikk!", "Carnivore", h, 5.8, 0.29, 0, jh, false, c);
          if (getElement(abs - 1, ord - 1).isAirHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'H') {
          h = new String[1];
          jh = 1;
          h[0] = "Land";
          a = new Animal(p, "Elephant", "Prett!", "Herbivore", h, 5000, 0, 250, jh, true, c);
          if (getElement(abs - 1, ord - 1).isLandHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'F') {
          h = new String[1];
          jh = 1;
          h[0] = "Land";
          a = new Animal(p, "Giraffe", "Hmm!", "Herbivore", h, 1100, 0, 55, jh, true, c);
          if (getElement(abs - 1, ord - 1).isLandHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'G') {
          h = new String[1];
          jh = 1;
          h[0] = "Land";
          a = new Animal(p, "Goat", "Mbeeeee", "Herbivore", h, 90, 0, 4.5, jh, false, c);
          if (getElement(abs - 1, ord - 1).isLandHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'I') {
          h = new String[1];
          jh = 1;
          h[0] = "Land";
          a = new Animal(p, "Iguana", "Purrrr", "Herbivore", h, 6, 0, 0.3, jh, true, c);
          if (getElement(abs - 1, ord - 1).isLandHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'J') {
          h = new String[1];
          jh = 1;
          h[0] = "Air";
          a = new Animal(p, "Jalak", "Tweet!", "Herbivore", h, 0.1, 0, 0.005, jh, true, c);
          if (getElement(abs - 1, ord - 1).isAirHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'K') {
          h = new String[1];
          jh = 1;
          h[0] = "Land";
          a = new Animal(p, "Komodo", "Slpp!", "Carnivore", h, 120, 6, 0, jh, false, c);
          if (getElement(abs - 1, ord - 1).isLandHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'L') {
          h = new String[1];
          jh = 1;
          h[0] = "Land";
          a = new Animal(p, "Lion", "Roaarr!", "Carnivore", h, 150, 7.5, 0, jh, false, c);
          if (getElement(abs - 1, ord - 1).isLandHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'R') {
          h = new String[1];
          jh = 1;
          h[0] = "Water";
          a = new Animal(p, "Orca", "Ngiak!", "Carnivore", h, 4000, 200, 0, jh, false, c);
          if (getElement(abs - 1, ord - 1).isWaterHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'O') {
          h = new String[1];
          jh = 1;
          h[0] = "Air";
          a = new Animal(p, "Owl", "Hoot!", "Carnivore", h, 1.5, 0.075, 0, jh, true, c);
          if (getElement(abs - 1,ord - 1).isAirHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'P') {
          h = new String[1];
          jh = 1;
          h[0] = "Air";
          a = new Animal(p, "Parrot", "Cuiitt", "Omnivore", h, 1.2, 0.06, 0.06, jh, true, c);
          if (getElement(abs - 1,ord - 1).isAirHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'B') {
          h = new String[2];
          jh = 2;
          h[0] = "Land";
          h[1] = "Water";
          a = new Animal(p, "PolarBear", "Auuummm", "Carnivore", h, 300, 15, 0, jh, false, c);
          if ((getElement(abs - 1,ord - 1).isLandHabitat())
              || (getElement(abs - 1,ord - 1).isWaterHabitat())) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'T') {
          h = new String[1];
          jh = 1;
          h[0] = "Land";
          a = new Animal(p, "Tiger", "Growl", "Carnivore", h, 200, 10, 0, jh, false, c);
          if (getElement(abs - 1,ord - 1).isLandHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        } else if (c == 'W') {
          h = new String[1];
          jh = 1;
          h[0] = "Water";
          a = new Animal(p, "Walrus", "Aaarhhh", "Carnivore", h, 1000, 50, 0, jh, false, c);
          if (getElement(abs - 1,ord - 1).isWaterHabitat()) {
            searchPoint(abs - 1, ord - 1).adoptAnimal(a);
          }
        }
      }
      sc.close();
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
  /**
    * Mengkonversi kelas Zoo menjadi sebuah string untuk dicetak.
    * @param absAwal absis titik yang menjadi titik awal pencetakan.
    * @param ordAwal ordinat titik yang menjadi titik awal pencetakan.
    * @param absAkhir absis titik yang menjadi titik akhir pencetakan.
    * @param ordAkhir ordinat titik yang menjadi titik akhir pencetakan.
    * @return konversi Zoo dari (absAwal, ordAwal) sampai (ordAwal, ordAkhir).
    */

  public String toString(int absAwal, int ordAwal, int absAkhir, int ordAkhir) {
    StringBuffer[] s = new StringBuffer[baris];
    for (int i = 0; i < baris; ++i) {
      s[i] = new StringBuffer();
      for (int j = 0; j < kolom; ++j) {
        s[i] = s[i].append(getElement(i,j).render());
        s[i] = s[i].append(' ');
      }
    }
    Point p;
    for (int i = 0; i < jumlahCage; ++i) {
      Cage cg = cage[i];
      for (int j = 0; j < cg.getTotalAnimal(); ++j) {
        p = cage[i].getAnimal(j).getPos();
        s[p.getAbsis()].setCharAt(2 * p.getOrdinat(),cage[i].getAnimal(j).render()); 
      }
    }
    String out = new String();
    for (int i = absAwal; i <= absAkhir; ++i) {
      out = out + s[i].substring(2 * ordAwal, 2 * ordAkhir + 1) + "\n";
    }
    return out;
  }
}
