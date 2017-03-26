package cage;
import animal.*;
import point.*;
import java.util.Random;

/**
 * File : Cage.java
 * Kelas cage merupakan kumpulan dari beberapa titik beserta
 * kumpulan binatang yang terdapat di dalamnya.
 * @author Catherine Almira - 13515111
 */
public class Cage {
	  private final int maxSize = 100;
	  private Point[] loc;
	  private int size;
	  private Animal[] animal;
	  private int totalAnimal;
	  
	  /**
	    * Constructor tanpa parameter.
	    */
	  public Cage() {
	    size = 0;
	    loc = new Point[maxSize];
	    totalAnimal = 0;
	    animal = new Animal[3*maxSize/10];
	  }
	  /**
	    * Constructor dengan parameter.
	    * @param size nilai ukuran cage.
	    */
	  public Cage(int size) {
	    this.size = size;
	    loc = new Point[maxSize];
	    totalAnimal = 0;
	    animal = new Animal[3*maxSize/10];
	  }
	  /**
	    * Constructor dengan parameter.
	    * @param possOrd posisi ordinat.
	    * @param possAbs posisi absis.
	    */
	  public Cage(int posOrd, int posAbs) {
	    size = 1;
	    loc = new Point[maxSize];
	    loc[0] = new Point(posAbs, posOrd);
	    totalAnimal = 0;
	    animal = new Animal[3*maxSize/10];
	  }
	  /**
	    * Constructor dengan parameter.
	    * @param c cage yang akan di-copy.
	    */
	  public Cage(Cage c) {
	    this.size = c.size;
	    loc = new Point[maxSize];
	    for (int i = 0; i< size; ++i) {
	      loc[i] = new Point(c.loc[i]);
	    }
	    totalAnimal = c.totalAnimal;
	    animal = new Animal[3*maxSize/10];
	    for (int i = 0; i< totalAnimal; ++i) {
	      animal[i] = new Animal (c.animal[i]);
	    }
	  }
	  /**
	    * Getter ukuran cage.
	    * Mengembalikan ukuran cage.
	    * @return nilai ukuran cage.
	    */
	  public int GetSize() {
	    return size;
	  }
	  /**
	    * Getter jumlah binatang pada cage.
	    * Mengembalikan jumlah binatang pada cage.
	    * @return nilai jumlah binatang pada cage.
	    */
	  public int GetTotalAnimal() {
	    return totalAnimal;
	  }
	  /**
	    * Getter binatang pada cage.
	    * Mengembalikan binatang pada array ke-indeks.
	    * @return indeks nilai indeks pada array animal.
	    */
	  public Animal GetAnimal(int indeks) {
	    return animal[indeks];
	  }
	  /**
	    * I.S. sembarang.
	    * F.S. Binatang A terdapat didalam cage jika cage belum penuh
	    * serta binatang sesuai dengan jenis cage.
	    * @param a Objek binatang yang akan dimasukkan.
	    */
	  public void AdoptAnimal(Animal a) {
	    if (IsFull()) {
	      System.out.println("Kandang penuh.");
	    }
	    else if (!IsInCage(a)) {
	      if (CanPut(a)) {
	        Random rand = new Random();
	        int random = rand.nextInt(size);
	        while (IsOccupied(random)) {
	          rand = new Random();
	          random = rand.nextInt(size);
	        }
	        a.SetPoint(loc[random]);
	        animal[totalAnimal] = new Animal(a);
	        ++totalAnimal;
	      }
	    }
	  }
	  /**
	    * Memeriksa apakah posisi pada indeks ke-i sudah terdapat binatang.
	    * @return true jika cage penuh.
	    */
	  public boolean IsFull() {
	    return (totalAnimal == 3*size/10);
	  }
	  /**
	    * Memeriksa apakah posisi pada indeks ke-i sudah terdapat binatang.
	    * @param index nilai indeks penunjuk posisi pada cage.
	    * @return true jika cage ke-i sudah terisi.
	    */
	  public boolean IsOccupied(int index) {
	    boolean found = false;
	    int i = 0;
	    while (!found && i < totalAnimal) {
	      if ((loc[i]).equals(animal[i].GetPos())) {
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
	  public boolean IsOccupied(Point p) {
	    boolean found = false;
	    int i = 0;
	    while (!found && i < totalAnimal) {
	      if (p.equals(animal[i].GetPos())) {
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
	  public boolean IsInCage(Animal a) {
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
	  public boolean IsInCage(Point p) {
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
	    * I.S. sembarang.
	    * F.S. semua binatang yang terdapat pada cage berinteraksi.
	    */
	  public void Interact() {
	    for (int i = 0; i < totalAnimal; ++i) {
	      System.out.println(animal[i].Interact());
	    }
	  }
	  /**
	    * I.S. size belum melebihi maxSize.
	    * F.S. Point p sudah berada dalam cage.
	    * @param posAbs nilai absis point yang akan dimasukkan.
	    * @param posOrd nilai ordinat point yang akan dimasukkan.
	    */
	  public void AddPoint(int posAbs, int posOrd) {
	    loc[size] = new Point(posAbs, posOrd);
	    ++size;
	  }
	  /**
	    * Memeriksa apakah animal a dapat dimasukkan ke cage.
	    * @param a Objek binatang yang akan diperiksa.
	    * @return true jika animal a dapat dimasukkan ke cage.
	    */
	  public boolean CanPut(Animal a) {
	    if (totalAnimal == 0) {
	      return true;
	    }
	    else {
	      return (animal[0].GetTame()==a.GetTame());
	    }
	  }
	  /**
	    * I.S. sembarang.
	    * F.S. Binatang di cage bergerak, walau mungkin diam.
	    */
	  public void Move() {
	    Random rand = new Random();
	    int random;
	    Point p2,p;
	    for (int i = 0; i < totalAnimal; ++i) {
	      p2 = animal[i].GetPos();
	      random = rand.nextInt(4) + 1;
	      if (random == 1) {
	        p = p2.PrevX();
	      } else if (random == 2) {
	        p = p2.NextX();
	      } else if (random == 3) {
	        p = p2.PrevY();
	      } else if (random == 4) {
	        p = p2.NextY();
	      }
	      else {
	    	p = new Point(-1,-1);
	      }
	      if ((IsInCage(p)) && (!IsOccupied(p)))
	          animal[i].SetPoint(p);
	    }
	  }
}