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
  private final int maxBaris = 100;
  private final int maxKolom = 100;
  private int baris;
  private int kolom;
  private Cell[][] cell;
  private final int maxJumlahCage = 100;
  private int jumlahCage;
  private Cage[] cage;
  /**
    * Constructor tanpa parameter.
    */
  public Zoo() {
    baris = 0;
    kolom = 0;
    cell = new Cell[maxBaris][maxKolom];
    jumlahCage = 0;
    cage = new Cage[maxJumlahCage];
  }
  /**
    * Constructor dengan parameter.
    * @param brs nilai ukuran baris kebun binatang.
    * @param kol nilai ukuran kolom kebun binatang.
    */
  public Zoo(int brs, int kol) {
    baris = brs;
    kolom = kol;
    cell = new Cell[maxBaris][maxKolom];
    jumlahCage = 0;
    cage = new Cage[maxJumlahCage];
  }
  /**
    * Getter elemen pada cell.
    * Mengembalikan cell zoo pada posisi p.
    * @param p Objek point yang akan dikembalikan.
    * @return elemen cell pada matriks dengan koordinat p.
    */
  public Cell GetElement(Point p) {
    int brs = p.GetAbsis();
    int kol = p.GetOrdinat();
    return (cell[brs][kol]);
  }
  /**
    * Getter elemen pada cell.
    * Mengembalikan cell zoo pada baris brs dan kolom kol.
    * @param brs nilai baris matriks yang akan dikembalikan.
    * @param kol nilai kolom matriks yang akan dikembalikan.
    * @return elemen cell pada matriks dengan baris brs dan kolom kol.
    */
  public Cell GetElement(int brs, int kol) {
    return (cell[brs][kol]);
  }
  /**
    * Getter ukuran baris pada kebun binatang.
    * @return ukuran baris pada kebun binatang.
    */
  public int GetBaris() {
    return baris;
  }
  /**
    * Getter ukuran kolom pada kebun binatang.
    * @return ukuran kolom pada kebun binatang.
    */
  public int GetKolom() {
    return kolom;
  }
  /**
    * Getter jumlah cage pada kebun binatang.
    * @return jumlah cage pada kebun binatang.
    */
  public int GetJumlahCage() {
    return jumlahCage;
  }
  /**
    * Getter cage.
    * Mengembalikan cage sesuai indeks pada kebun binatang.
    * @param indeks nilai indeks yang akan di kembalikan.
    * @return Objek cage sesuai indeks pada kebun binatang.
    */
  public Cage GetCage(int indeks) {
    return cage[indeks];
  }
  /**
    * Mencari point p berada pada cage mana.
    * @param abs nilai absis yang akan dicari.
    * @param ord nilai ordinat yang akan dicari.
    * @return Objek cage yang mengandung point yang dicari.
    */
  public Cage SearchPoint(int abs, int ord) {
    boolean found = false;
    int i = 0;
    Point p = new Point(abs, ord);
    while (!found && (i < jumlahCage)) {
      if (cage[i].IsInCage(p)) {
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
  public Cage SearchPoint(Point p) {
    boolean found = false;
    int i = 0;
    while (!found && (i < jumlahCage)) {
      if (cage[i].IsInCage(p)) {
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
  public void AddCage(Cage c) {
    cage[jumlahCage] = new Cage(c);
    ++jumlahCage;
  }
  public void ReadMap() {
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
              SearchPoint(i-1,j).AddPoint(P);
            } else if ((j!=0)&&(cell[i][j-1] instanceof Land_Habitat)) {
              SearchPoint(i,j-1).AddPoint(P);
            } else {
              Cage c(i,j);
              AddCage(c);
            }
          } else if (c=='^') {
            cell[i][j] = new AirHabitat();
            if ((i!=0)&&(cell[i-1][j] instanceof Air_Habitat)) {
              SearchPoint(i-1,j).AddPoint(P);
            } else if ((j!=0)&&(cell[i][j-1] instanceof Air_Habitat)) {
              SearchPoint(i,j-1).AddPoint(P);
            } else {
              Cage c(i,j);
              AddCage(c);
            }
          } else if (c=='~') {
            cell[i][j] = new WaterHabitat();
            if ((i!=0)&&(cell[i-1][j] instanceof Water_Habitat)) {
              SearchPoint(i-1,j).AddPoint(P);
            } else if ((j!=0)&&(cell[i][j-1] instanceof Water_Habitat)) {
              SearchPoint(i,j-1).AddPoint(P);
            } else {
              Cage c(i,j);
              AddCage(c);
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
  public void ReadAnimal() {
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
          if ((GetElement(abs-1,ord-1) instanceof Land_Habitat)||(GetElement(abs-1,ord-1) instanceof Water_Habitat))
            SearchPoint(abs-1, ord-1).AdoptAnimal(A);
        } else if (c == 'C') {
          Cobra C;
          if (GetElement(abs-1,ord-1) instanceof Land_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(C);
        } else if (c == 'M') {
          Cormorant M;
          if ((GetElement(abs-1,ord-1) instanceof Air_Habitat)||(GetElement(abs-1,ord-1) instanceof Water_Habitat))
            SearchPoint(abs-1, ord-1).AdoptAnimal(M);
        } else if (c == 'N') {
          Dolphin N;
          if (GetElement(abs-1,ord-1) instanceof Water_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(N);
        } else if (c == 'D') {
          Duck D;
          if (GetElement(abs-1,ord-1) instanceof Water_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(D);
        } else if (c == 'U') {
          Dugong U;
          if (GetElement(abs-1,ord-1) instanceof Water_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(U);
        } else if (c == 'E') {
          Eagle E;
          if (GetElement(abs-1,ord-1) instanceof Air_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(E);
        } else if (c == 'H') {
          Elephant H;
          if (GetElement(abs-1,ord-1) instanceof Land_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(H);
        } else if (c == 'F') {
          Giraffe F;
          if (GetElement(abs-1,ord-1) instanceof Land_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(F);
        } else if (c == 'G') {
          Goat G;
          if (GetElement(abs-1,ord-1) instanceof Land_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(G);
        } else if (c == 'I') {
          Iguana I;
          if (GetElement(abs-1,ord-1) instanceof Land_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(I);
        } else if (c == 'J') {
          Jalak J;
          if (GetElement(abs-1,ord-1) instanceof Air_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(J);
        } else if (c == 'K') {
          Komodo K;
          if (GetElement(abs-1,ord-1) instanceof Land_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(K);
        } else if (c == 'L') {
          Lion L;
          if (GetElement(abs-1,ord-1) instanceof Land_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(L);
        } else if (c == 'R') {
          Orca R;
          if (GetElement(abs-1,ord-1) instanceof Water_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(R);
        } else if (c == 'O') {
          Owl O;
          if (GetElement(abs-1,ord-1) instanceof Air_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(O);
        } else if (c == 'P') {
          Parrot P;
          if (GetElement(abs-1,ord-1) instanceof Air_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(P);
        } else if (c == 'B') {
          PolarBear B;
          if ((GetElement(abs-1,ord-1) instanceof Land_Habitat)||(GetElement(abs-1,ord-1) instanceof Water_Habitat))
            SearchPoint(abs-1, ord-1).AdoptAnimal(B);
        } else if (c == 'T') {
          Tiger T;
          if (GetElement(abs-1,ord-1) instanceof Land_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(T);
        } else if (c == 'W') {
          Walrus W;
          if (GetElement(abs-1,ord-1) instanceof Water_Habitat)
            SearchPoint(abs-1, ord-1).AdoptAnimal(W);
        }
      }
      sc.close();
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
}