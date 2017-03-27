package zoo;
import cage.*;
import cell.*;
import animal.*;
import System.*;
import java.io.*;
import java.util.Scanner;

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
      int baris = sc.nextInt();
      int kolom = sc.nextInt();
      char c;
      for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
          c = sc.next().charAt(0);
          if (c=='@') {
            cell[i][j] = new LandHabitat();
            if ((i!=0)&&(cell[i-1][j] instanceof Land_Habitat)) {
              searchPoint(i-1,j).addPoint(P);
            } else if ((j!=0)&&(cell[i][j-1] instanceof Land_Habitat)) {
              searchPoint(i,j-1).addPoint(P);
            } else {
              Cage c(i,j);
              addCage(c);
            }
          } else if (c=='^') {
            cell[i][j] = new AirHabitat();
            if ((i!=0)&&(cell[i-1][j] instanceof Air_Habitat)) {
              searchPoint(i-1,j).addPoint(P);
            } else if ((j!=0)&&(cell[i][j-1] instanceof Air_Habitat)) {
              searchPoint(i,j-1).addPoint(P);
            } else {
              Cage c(i,j);
              addCage(c);
            }
          } else if (c=='~') {
            cell[i][j] = new WaterHabitat();
            if ((i!=0)&&(cell[i-1][j] instanceof Water_Habitat)) {
              searchPoint(i-1,j).addPoint(P);
            } else if ((j!=0)&&(cell[i][j-1] instanceof Water_Habitat)) {
              searchPoint(i,j-1).addPoint(P);
            } else {
              Cage c(i,j);
              addCage(c);
            }
          } else if (c=='S') {
            cell[i][j] = new Restaurant();
          } else if (c=='#') {
            cell[i][j] = new Park();
          } else if (c=='+') {
            cell[i][j] = new Road();
          } else if (c=='X') {
            cell[i][j] = new Exit();
          } else if (c=='Z') {
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
          Alligator A;
          if ((getElement(abs-1,ord-1) instanceof Land_Habitat)||(getElement(abs-1,ord-1) instanceof Water_Habitat))
            searchPoint(abs-1, ord-1).adoptAnimal(A);
        } else if (c == 'C') {
          Cobra C;
          if (getElement(abs-1,ord-1) instanceof Land_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(C);
        } else if (c == 'M') {
          Cormorant M;
          if ((getElement(abs-1,ord-1) instanceof Air_Habitat)||(getElement(abs-1,ord-1) instanceof Water_Habitat))
            searchPoint(abs-1, ord-1).adoptAnimal(M);
        } else if (c == 'N') {
          Dolphin N;
          if (getElement(abs-1,ord-1) instanceof Water_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(N);
        } else if (c == 'D') {
          Duck D;
          if (getElement(abs-1,ord-1) instanceof Water_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(D);
        } else if (c == 'U') {
          Dugong U;
          if (getElement(abs-1,ord-1) instanceof Water_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(U);
        } else if (c == 'E') {
          Eagle E;
          if (getElement(abs-1,ord-1) instanceof Air_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(E);
        } else if (c == 'H') {
          Elephant H;
          if (getElement(abs-1,ord-1) instanceof Land_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(H);
        } else if (c == 'F') {
          Giraffe F;
          if (getElement(abs-1,ord-1) instanceof Land_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(F);
        } else if (c == 'G') {
          Goat G;
          if (getElement(abs-1,ord-1) instanceof Land_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(G);
        } else if (c == 'I') {
          Iguana I;
          if (getElement(abs-1,ord-1) instanceof Land_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(I);
        } else if (c == 'J') {
          Jalak J;
          if (getElement(abs-1,ord-1) instanceof Air_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(J);
        } else if (c == 'K') {
          Komodo K;
          if (getElement(abs-1,ord-1) instanceof Land_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(K);
        } else if (c == 'L') {
          Lion L;
          if (getElement(abs-1,ord-1) instanceof Land_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(L);
        } else if (c == 'R') {
          Orca R;
          if (getElement(abs-1,ord-1) instanceof Water_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(R);
        } else if (c == 'O') {
          Owl O;
          if (getElement(abs-1,ord-1) instanceof Air_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(O);
        } else if (c == 'P') {
          Parrot P;
          if (getElement(abs-1,ord-1) instanceof Air_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(P);
        } else if (c == 'B') {
          PolarBear B;
          if ((getElement(abs-1,ord-1) instanceof Land_Habitat)||(GetElement(abs-1,ord-1) instanceof Water_Habitat))
            searchPoint(abs-1, ord-1).adoptAnimal(B);
        } else if (c == 'T') {
          Tiger T;
          if (getElement(abs-1,ord-1) instanceof Land_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(T);
        } else if (c == 'W') {
          Walrus W;
          if (getElement(abs-1,ord-1) instanceof Water_Habitat)
            searchPoint(abs-1, ord-1).adoptAnimal(W);
        }
      }
      sc.close();
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
}