/** File : Zoo.java
  * Penanggung jawab : Dewita Sonya Tarabunga - 13515021
  */

package zoo;
import cage.*;
import cell.*;
import animal.*;
import System.*;

/** Kelas zoo merepresentasikan kebun binatang dengan matriks cell,
  * kumpulan cage.
  */
public class Zoo {
  private final int maxBaris = 100;
  private final int maxKolom = 100;
  private int baris;
  private int kolom;
  private Cell cell[][];
  private final int maxJumlahCage = 100;
  private int jumlahCage;
  private Cage cage[];

  /**
    * Constructor tanpa parameter.
    */
  public Zoo() {
    baris = 0;
    kolom = 0;
    cell[][] = new Cell[maxBaris][maxKolom];
    jumlahCage = 0;
    cage[] = new Cage[maxJumlahCage];
  }
  /**
    * Constructor dengan parameter.
    * @param brs nilai ukuran baris kebun binatang.
    * @param kol nilai ukuran kolom kebun binatang.
    */
  public Zoo(int brs, int kol) {
    baris = brs;
    kolom = kol;
    cell[][] = new Cell[maxBaris][maxKolom];
    for (int i = 0; i < brs; ++i) {
      for (int j = 0; j < kol; ++j) {
        cell[i][j] = new Cell();
      }
    }
    jumlahCage = 0;
    cage[] = new Cage[maxJumlahCage];
  }
  /**
    * Getter elemen pada cell.
    * Mengembalikan cell zoo pada posisi p.
    * @param p Objek point yang akan dikembalikan.
    * @return elemen cell pada matriks dengan koordinat p.
    */
  public Cell GetElement(Point p) {
    int brs = P.GetAbsis();
    int kol = P.GetOrdinat();
    return (cell[brs][kol])
  }
  /**
    * Getter elemen pada cell.
    * Mengembalikan cell zoo pada baris brs dan kolom kol.
    * @param brs nilai baris matriks yang akan dikembalikan.
    * @param kol nilai kolom matriks yang akan dikembalikan.
    * @return elemen cell pada matriks dengan baris brs dan kolom kol.
    */
  public Cell GetElement(int brs, int kol) {
    return (cell[brs][kol])
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
    return cage[i];
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
    while (!found && i<jumlahCage) {
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
    * @param abs nilai absis yang akan dicari.
    * @param ord nilai ordinat yang akan dicari.
    * @return Objek cage yang mengandung point yang dicari.
    */
  public void AddCage(Cage c) {
    cage[jumlahCage] = new Cage(c);
    ++jumlahCage;
  }
}