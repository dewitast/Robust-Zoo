package cage;
import animal.*;
import point.*;
import java.util.Random;

/**
 * File : Cage.java
 * Kelas cage merupakan kumpulan dari beberapa titik beserta
 * kumpulan binatang yang terdapat di dalamnya.
 * @author Dewita Sonya Tarabunga - 13515021
 */
public class Cage {
  private final int MAXSIZE = 100;
  private Point[] loc;
  private int size;
  private Animal[] animal;
  private int totalAnimal;

  /**
   * Constructor tanpa parameter.
   */
  public Cage() {
    size = 0;
    loc = new Point[MAXSIZE];
    totalAnimal = 0;
    animal = new Animal[3*MAXSIZE/10];
  }
  /**
   * Constructor dengan parameter.
   * @param size nilai ukuran cage.
   */
  public Cage(int size) {
    this.size = size;
    loc = new Point[MAXSIZE];
    totalAnimal = 0;
    animal = new Animal[3*MAXSIZE/10];
  }
  /**
   * Constructor dengan parameter.
   * @param possOrd posisi ordinat.
   * @param possAbs posisi absis.
   */
  public Cage(int posOrd, int posAbs) {
    size = 1;
    loc = new Point[MAXSIZE];
    loc[0] = new Point(posAbs, posOrd);
    totalAnimal = 0;
    animal = new Animal[3*MAXSIZE/10];
  }
  /**
   * Constructor dengan parameter.
   * @param c cage yang akan di-copy.
   */
  public Cage(Cage c) {
    this.size = c.size;
    loc = new Point[MAXSIZE];
    for (int i = 0; i < size; ++i) {
      loc[i] = new Point(c.loc[i]);
    }
    totalAnimal = c.totalAnimal;
    animal = new Animal[3*MAXSIZE/10];
    for (int i = 0; i < totalAnimal; ++i) {
      animal[i] = (c.animal[i]).clone();
    }
  }
  /**
   * Getter ukuran cage.
   * Mengembalikan ukuran cage.
   * @return nilai ukuran cage.
   */
  public int getSize() {
    return size;
  }
  /**
   * Getter jumlah binatang pada cage.
   * Mengembalikan jumlah binatang pada cage.
   * @return nilai jumlah binatang pada cage.
   */
  public int getTotalAnimal() {
    return totalAnimal;
  }
  /**
   * Getter binatang pada cage.
   * Mengembalikan binatang pada array ke-indeks.
   * @return indeks nilai indeks pada array animal.
   */
  public Animal getAnimal(int indeks) {
    return animal[indeks];
  }
  /**
   * I.S. sembarang.
   * F.S. Binatang A terdapat didalam cage jika cage belum penuh
   * serta binatang sesuai dengan jenis cage.
   * @param a Objek binatang yang akan dimasukkan.
   */
  public void adoptAnimal(Animal a) {
    if (isFull()) {
      System.out.println("Kandang penuh.");
    }
    else if (!isInCage(a)) {
      if (canPut(a)) {
        Random rand = new Random();
        int random = rand.nextInt(size);
        while (isOccupied(random)) {
          rand = new Random();
          random = rand.nextInt(size);
        }
        a.setPoint(loc[random]);
        animal[totalAnimal] = a.clone();
        ++totalAnimal;
      }
    }
  }
  /**
   * Memeriksa apakah posisi pada indeks ke-i sudah terdapat binatang.
   * @param index nilai indeks penunjuk posisi pada cage.
   * @return true jika cage ke-i sudah terisi.
   */
  public boolean isOccupied(int index) {
    boolean found = false;
    int i = 0;
    while (!found && i < totalAnimal) {
      if ((loc[i]).equals(animal[i].getPos())) {
        found = true;
      }
      ++i;
    }
    return found;
  }
  /**
   * Memeriksa apakah posisi point p sudah terdapat binatang.
   * p merupakan point yang terdapat pada cage.
   * @param p Objek point yang terdapat pada cage.
   * @return true jika point p sudah terisi.
   */
  public boolean isOccupied(Point p) {
    boolean found = false;
    int i = 0;
    while (!found && i < totalAnimal) {
      if (p.equals(animal[i].getPos())) {
        found = true;
      }
      ++i;
    }
    return found;
  }
  /**
   * Memeriksa apakah binatang a terdapat pada cage.
   * @param a Objek binatang yang akan diperiksa.
   * @return true jika binatang a terdapat pada cage.
   */
  public boolean isInCage(Animal a) {
    boolean found = false;
    int i = 0;
    while (!found && i < totalAnimal) {
      if (a.equals(animal[i])) {
        found = true;
      }
      ++i;
    }
    return found;
  }
  /**
   * Memeriksa apakah point p terdapat pada cage.
   * @param p Objek point yang akan diperiksa.
   * @return true jika point p terdapat pada cage.
   */
  public boolean isInCage(Point p) {
    boolean found = false;
    int i = 0;
    while (!found && i < totalAnimal) {
      if (p.equals(loc[i])) {
        found = true;
      }
      ++i;
    }
    return found;
  }
  /**
   * Memeriksa apakah cage penuh.
   * @return true jika binatang a terdapat pada cage.
   */
  public boolean isFull() {
    return (totalAnimal == 3*size/100);
  }
  /**
   * I.S. sembarang.
   * F.S. semua binatang yang terdapat pada cage berinteraksi.
   */
  public void interact() {
    for (int i = 0; i < totalAnimal; ++i) {
      System.out.println(animal[i].interact());
    }
  }
  /**
   * I.S. size belum melebihi MAXSIZE.
   * F.S. Point p sudah berada dalam cage.
   * @param posAbs nilai absis point yang akan dimasukkan.
   * @param posOrd nilai ordinat point yang akan dimasukkan.
   */
  public void addPoint(int posAbs, int posOrd) {
    loc[size] = new Point(posAbs, posOrd);
    ++size;
  }
  /**
   * Memeriksa apakah animal a dapat dimasukkan ke cage.
   * @param a Objek binatang yang akan diperiksa.
   * @return true jika animal a dapat dimasukkan ke cage.
   */
  public boolean canPut(Animal a) {
    if (totalAnimal == 0) {
      return true;
    }
    else {
      return (animal[0].getTame()==a.getTame());
    }
  }
  /**
   * I.S. sembarang.
   * F.S. Binatang di cage bergerak, walau mungkin diam.
   */
  public void move() {
    Random rand = new Random();
    int random;
    Point p2, p;
    for (int i = 0; i < totalAnimal; ++i) {
      p2 = animal[i].getPos();
      random = rand.nextInt(4) + 1;
      if (random == 1) {
        p = p2.prevX();
      } else if (random == 2) {
        p = p2.nextX();
      } else if (random == 3) {
        p = p2.prevY();
      } else if (random == 4) {
        p = p2.nextY();
      } else {
    	p = new Point();
      }
      if ((isInCage(p)) && (!isOccupied(p)))
        animal[i].setPoint(p);
    }
  }
}