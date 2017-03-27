package zoo;
import cage.*;
import cell.*;
import animal.*;
import System.*;

/**
 * File : Zoo.java
 * Kelas zoo merepresentasikan kebun binatang dengan matriks cell,
 * kumpulan cage.
 * @author Dewita Sonya Tarabunga - 13515021
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
      }
      else {
        ++i;
      }
    }
    if (found) {
      return cage[i];
    }
    else {
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
      }
      else {
        ++i;
      }
    }
    if (found) {
      return cage[i];
    }
    else {
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
   * I.S. Animal sembarang.
   * F.S. Animal terdefinisi sesuai dengan pada file "animal.txt"
   * @throws IOException jika file tidak ditemukan.
   */
  public void readAnimal() {
    File filename = new File("animal.txt");
    try {
      Scanner sc = new Scanner(filename);
      char c;
      int abs;
      int ord;
      while (sc.hasNextLine()) {
        c = sc.next().charAt(0);
        abs = sc.nextInt();
        ord = sc.nextInt();
        Point p;
        p.setAbsis(abs);
        p.setOrdinat(ord);
        if (c == 'A') {
          String[] h;
          jh = 2;
          h = new String[jh];
          h[0] = "Land";
          h[1] = "Water";
          Animal a(p, "Alligator", "Grrrrrr", "Carnivore", h, 125, 6.25, 0, jh, false, c);
          if ((getElement(abs-1,ord-1) instanceof LandHabitat)||(getElement(abs-1,ord-1) instanceof WaterHabitat))
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'C') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Land";
          Animal a(p, "Cobra", "Ssshh!", "Carnivore", h, 20, 1, 0, jh, false, c);
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'M') {
          String[] h;
          jh = 2;
          h = new String[jh];
          h[0] = "Air";
          h[1] = "Water";
          Animal a(p, "Cormorant", "Ooookkk!", "Carnivore", h, 3.6, 0.18, 0, jh, true, c);
          if ((getElement(abs-1,ord-1) instanceof AirHabitat)||(getElement(abs-1,ord-1) instanceof WaterHabitat))
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'N') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Water";
          Animal a(p, "Dolphin", "A a a a a", "Carnivore", h, 75, 3.75, 0, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'D') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Water";
          Animal a(p, "Duck", "Quaackk!", "Omnivore", h, 12, 0.6, 0.6, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'U') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Water";
          Animal a(p, "Dugong", "Splashh!", "Herbivore", h, 500, 0, 25, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'E') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Air";
          Animal a(p, "Eagle", "Nguiikk!", "Carnivore", h, 5.8, 0.29, 0, jh, false, c);
          if (getElement(abs-1,ord-1) instanceof AirHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'H') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Land";
          Animal A(p, "Elephant", "Prett!", "Herbivore", h, 5000, 0, 250, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'F') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Land";
          Animal a(p, "Giraffe", "Hmm!", "Herbivore", h, 1100, 0, 55, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'G') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Land";
          Animal a(p, "Goat", "Mbeeeee", "Herbivore", h, 90, 0, 4.5, jh, false, c);
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'I') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Land";
          Animal a(p, "Iguana", "Purrrr", "Herbivore", h, 6, 0, 0.3, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'J') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Air";
          Animal a(p, "Jalak", "Tweet!", "Herbivore", h, 0.1, 0, 0.005, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof AirHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'K') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Land";
          Animal a(p, "Komodo", "Slpp!", "Carnivore", h, 120, 6, 0, jh, false, c);
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'L') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Land";
          Animal a(p, "Lion", "Roaarr!", "Carnivore", h, 150, 7.5, 0, jh, false, c);
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'R') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Water";
          Animal a(p, "Orca", "Ngiak!", "Carnivore", h, 4000, 200, 0, jh, false, c);
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'O') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Air";
          Animal a(p, "Owl", "Hoot!", "Carnivore", h, 1.5, 0.075, 0, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof AirHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'P') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Air";
          Animal a(p, "Parrot", "Cuiitt", "Omnivore", h, 1.2, 0.06, 0.06, jh, true, c);
          if (getElement(abs-1,ord-1) instanceof AirHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'B') {
          String[] h;
          jh = 2;
          h = new String[jh];
          h[0] = "Land";
          h[1] = "Water";
          Animal a(p, "PolarBear", "Auuummm", "Carnivore", h, 300, 15, 0, jh, false, c);
          if ((getElement(abs-1,ord-1) instanceof LandHabitat)||(getElement(abs-1,ord-1) instanceof WaterHabitat))
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'T') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Land";
          Animal a(p, "Tiger", "Growl", "Carnivore", h, 200, 10, 0, jh, false, c);
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'W') {
          String[] h;
          jh = 1;
          h = new String[jh];
          h[0] = "Water";
          Animal a(p, "Walrus", "Aaarhhh", "Carnivore", h, 1000, 50, 0, jh, false, c);
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        }
      }
      sc.close();
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
}