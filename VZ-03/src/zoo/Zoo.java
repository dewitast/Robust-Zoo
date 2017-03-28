package zoo;
import cage.*;
import cell.*;
import cell.airhabitat.*;
import cell.landhabitat.*;
import cell.waterhabitat.*;
import cell.restaurant.*;
import cell.park.*;
import cell.road.*;
import cell.road.entrance.*;
import cell.road.exit.*;
import point.*;

import java.io.*;
import java.util.Scanner;
import animal.reptile.alligator.*;
import animal.reptile.cobra.*;
import animal.aves.cormorant.*;
import animal.mammal.dolphin.*;
import animal.aves.duck.*;
import animal.mammal.dugong.*;
import animal.aves.eagle.*;
import animal.mammal.elephant.*;
import animal.mammal.giraffe.*;
import animal.mammal.goat.*;
import animal.reptile.iguana.*;
import animal.aves.jalak.*;
import animal.reptile.komodo.*;
import animal.mammal.lion.*;
import animal.mammal.orca.*;
import animal.aves.owl.*;
import animal.aves.parrot.*;
import animal.mammal.polarbear.*;
import animal.mammal.tiger.*;
import animal.mammal.walrus.*;

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
   * I.S. Cell sembarang.
   * F.S. Cell terdefinisi sesuai dengan file eksternal "map.txt".
   */
  public void readMap() {
	  File filename = new File("map.txt");
	  try {
	    Scanner sc = new Scanner(filename);
		baris = sc.nextInt();
		kolom = sc.nextInt();
		Cage cg;
		char c;
		for (int i = 0; i < baris; i++) {
		    for (int j = 0; j < kolom; j++) {
		      c = sc.next().charAt(0);
		      if (c == '@') {
                cell[i][j] = new LandHabitat();
                if ((i != 0)&&(cell[i-1][j] instanceof LandHabitat)) {
                    searchPoint(i-1, j).addPoint(i, j);
                } else if ((j != 0)&&(cell[i][j-1] instanceof LandHabitat)) {
                    searchPoint(i, j-1).addPoint(i, j);
                } else {
                	cg = new Cage(i, j);
  		            addCage(cg);
                }
              } else if (c == '^') {
            	  cell[i][j] = new AirHabitat();
                  if ((i != 0)&&(cell[i-1][j] instanceof AirHabitat)) {
                      searchPoint(i-1, j).addPoint(i, j);
                  } else if ((j != 0)&&(cell[i][j-1] instanceof AirHabitat)) {
                      searchPoint(i, j-1).addPoint(i, j);
                  } else {
                  	cg = new Cage(i,j);
    		            addCage(cg);
                  }
              } else if (c == '~') {
            	  cell[i][j] = new WaterHabitat();
                  if ((i != 0)&&(cell[i-1][j] instanceof WaterHabitat)) {
                      searchPoint(i-1, j).addPoint(i, j);
                  } else if ((j != 0)&&(cell[i][j-1] instanceof WaterHabitat)) {
                      searchPoint(i, j-1).addPoint(i, j);
                  } else {
                  	cg = new Cage(i, j);
    		            addCage(cg);
                  }
          } else if (c == 'S') {
            cell[i][j] = new Restaurant();
          } else if (c == '#') {
            cell[i][j] = new Park();
          } else if (c == '+') {
            cell[i][j] = new Road();
          } else if (c == 'X') {
            cell[i][j] = new Exit();
          } else if (c == 'Z') {
            cell[i][j] = new Entrance();
          }
        }
      }
      sc.close();
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
  /**
   * I.S. Animal sembarang.
   * F.S. Animal terdefinisi sesuai dengan file eksternal "animal.txt".
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
        if (c == 'A') {
          Alligator a = new Alligator();
          if ((getElement(abs-1,ord-1) instanceof LandHabitat)||(getElement(abs-1,ord-1) instanceof WaterHabitat))
            searchPoint(abs-1, ord-1).adoptAnimal(a);
        } else if (c == 'C') {
          Cobra co = new Cobra();
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(co);
        } else if (c == 'M') {
          Cormorant m = new Cormorant();
          if ((getElement(abs-1,ord-1) instanceof AirHabitat)||(getElement(abs-1,ord-1) instanceof WaterHabitat))
            searchPoint(abs-1, ord-1).adoptAnimal(m);
        } else if (c == 'N') {
          Dolphin n = new Dolphin() ;
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(n);
        } else if (c == 'D') {
          Duck d = new Duck();
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(d);
        } else if (c == 'U') {
          Dugong u = new Dugong();
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(u);
        } else if (c == 'E') {
          Eagle e = new Eagle();
          if (getElement(abs-1,ord-1) instanceof AirHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(e);
        } else if (c == 'H') {
          Elephant h = new Elephant();
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(h);
        } else if (c == 'F') {
          Giraffe f = new Giraffe();
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(f);
        } else if (c == 'G') {
          Goat g = new Goat();
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(g);
        } else if (c == 'I') {
          Iguana i = new Iguana();
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(i);
        } else if (c == 'J') {
          Jalak j = new Jalak();
          if (getElement(abs-1,ord-1) instanceof AirHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(j);
        } else if (c == 'K') {
          Komodo k = new Komodo();
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(k);
        } else if (c == 'L') {
          Lion l = new Lion();
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(l);
        } else if (c == 'R') {
          Orca r = new Orca();
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(r);
        } else if (c == 'O') {
          Owl o = new Owl();
          if (getElement(abs-1,ord-1) instanceof AirHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(o);
        } else if (c == 'P') {
          Parrot p = new Parrot();
          if (getElement(abs-1,ord-1) instanceof AirHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(p);
        } else if (c == 'B') {
          PolarBear b = new PolarBear();
          if ((getElement(abs-1,ord-1) instanceof LandHabitat)||(getElement(abs-1,ord-1) instanceof WaterHabitat))
            searchPoint(abs-1, ord-1).adoptAnimal(b);
        } else if (c == 'T') {
          Tiger t = new Tiger();
          if (getElement(abs-1,ord-1) instanceof LandHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(t);
        } else if (c == 'W') {
          Walrus w = new Walrus();
          if (getElement(abs-1,ord-1) instanceof WaterHabitat)
            searchPoint(abs-1, ord-1).adoptAnimal(w);
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
    * @return String yang merupakan hasil konversi zoo dimulai dari (absAwal, ordAwal) sampai (ordAwal, ordAkhir).
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
			  s[p.getAbsis()].setCharAt(2*p.getOrdinat(),cage[i].getAnimal(j).render()); 
		  }
	  }
	  String out = new String();
	  for (int i = absAwal; i <= absAkhir; ++i) {
		  out = out + s[i].substring(2*ordAwal, 2*ordAkhir+1) + "\n";
	  }
	  return out;
  }
}