package zoo;
import cage.*;
import cell.*;
import point.*;
import animal.*;
import java.util.Scanner;
import java.io.*;

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
	  /**
	    * I.S. File eksternal "map.txt" sudah tersedia.
	    * F.S. Zoo terkonfigurasi dari file eksternal.
	    */
	  public void ReadMap() {
		File filename = new File("map.txt");
		try {
		  Scanner sc = new Scanner(filename);
		  int baris = sc.nextInt();
		  int kolom = sc.nextInt();
		  Cage cg;
		  char c;
		  for (int i = 0; i < baris; i++) {
		    for (int j = 0; j < kolom; j++) {
		      c = sc.next().charAt(0);
		      if (c=='@') {
		        cell[i][j] = new Cell("LandHabitat");
		        if ((i!=0)&&(cell[i-1][j].IsLandHabitat())) {
		          SearchPoint(i-1,j).AddPoint(i-1,j);
		        } else if ((j!=0)&&(cell[i][j-1].IsLandHabitat())) {
		          SearchPoint(i,j-1).AddPoint(i,j-1);
		        } else {
		          cg = new Cage(i,j);
		          AddCage(cg);
		        }
		      } else if (c=='^') {
		        cell[i][j] = new Cell("AirHabitat");
		        if ((i!=0)&&(cell[i-1][j].IsAirHabitat())) {
		          SearchPoint(i-1,j).AddPoint(i-1,j);
		        } else if ((j!=0)&&(cell[i][j-1].IsAirHabitat())) {
		          SearchPoint(i,j-1).AddPoint(i,j-1);
		        } else {
		          cg = new Cage(i,j);
		          AddCage(cg);
		        }
		      } else if (c=='~') {
		        cell[i][j] = new Cell("AirHabitat");
		        if ((i!=0)&&(cell[i-1][j].IsWaterHabitat())) {
		          SearchPoint(i-1,j).AddPoint(i-1,j);
		        } else if ((j!=0)&&(cell[i][j-1].IsWaterHabitat())) {
		          SearchPoint(i,j-1).AddPoint(i,j-1);
		        } else {
		          cg = new Cage(i,j);
		          AddCage(cg);
		        }
		      } else if (c=='S') {
		        cell[i][j] = new Cell("Restaurant");
		      } else if (c=='#') {
		        cell[i][j] = new Cell("Park");
		      } else if (c=='+') {
		        cell[i][j] = new Cell("Road");
		      } else if (c=='X') {
		        cell[i][j] = new Cell("Exit");
		      } else if (c=='Z') {
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
		    Animal a;
		    if (c == 'A') {
		      a = new Animal();
		      if ((GetElement(abs-1,ord-1).IsLandHabitat())||(GetElement(abs-1,ord-1).IsWaterHabitat()))
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'C') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsLandHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'M') {
		      a = new Animal();
		      if ((GetElement(abs-1,ord-1).IsAirHabitat())||(GetElement(abs-1,ord-1).IsWaterHabitat()))
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'N') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsWaterHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'D') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsWaterHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'U') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsWaterHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'E') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsAirHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'H') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsLandHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'F') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsLandHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'G') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsLandHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'I') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsLandHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'J') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsAirHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'K') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsLandHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'L') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsLandHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'R') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsWaterHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'O') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsAirHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'P') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsAirHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'B') {
		      a = new Animal();
		      if ((GetElement(abs-1,ord-1).IsLandHabitat())||(GetElement(abs-1,ord-1).IsWaterHabitat()))
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'T') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsLandHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    } else if (c == 'W') {
		      a = new Animal();
		      if (GetElement(abs-1,ord-1).IsWaterHabitat())
		        SearchPoint(abs-1, ord-1).AdoptAnimal(a);
		    }
		  }
	      sc.close();
	 } catch (IOException e) {
		  System.out.println("File not found!");
		}
	  }
}
