/** File : Point.java
  * Penanggung jawab : Dewita Sonya Tarabunga - 13515021
  */

package point;

/** Kelas point merepresentasikan suatu titik dengan absis dan ordinat nya.
  */
public class Point {
  private int absis;
  private int ordinat;

  /**
    * Constructor tanpa parameter.
    */
  public Point() {
    absis = 0;
    ordinat = 0;
  }
  /**
    * Constructor dengan parameter.
    * @param abs nilai absis.
    * @param ord nilai ordinat.
    */
  public Point(int abs, int ord) {
    absis = abs;
    ordinat = ord;
  }
  /**
    * Constructor dengan parameter.
    * @param p objek point yang mengisi objek yang baru dibuat.
    */
  public Point(Point p) {
    absis = p.absis;
    ordinat = p.ordinat;
  }
  /**
    * Mengembalikan nilai absis point.
    * @return nilai absis objek.
    */
  public int GetAbsis() {
    return absis;
  }
  /**
    * Mengembalikan nilai ordinat point.
    * @return nilai ordinat objek.
    */
  public int GetOrdinat() {
    return ordinat;
  }
  /**
    * Mengubah nilai absis point.
    * @param abs nilai absis yang akan dimasukkan.
    */
  public void SetAbsis(int abs) {
    absis = abs;
  }
  /**
    * Mengubah nilai ordinat point.
    * @param ord nilai ordinat yang akan dimasukkan.
    */
  public void SetOrdinat(int ord) {
    ordinat = ord;
  }
  /**
    * Mengembalikan point di sebelah kanan point.
    * @return Objek point dengan absis bertambah 1.
    */
  public Point NextX() {
    return new Point(absis+1,ordinat);
  }
  /**
    * Mengembalikan point di sebelah kiri point.
    * @return Objek point dengan absis berkurang 1.
    */
  public Point PrevX() {
    return new Point(absis-1,ordinat);
  }
  /**
    * Mengembalikan point di sebelah atas point.
    * @return Objek point dengan ordinat berkurang 1.
    */
  public Point PrevY() {
    return new Point(absis,ordinat-1);
  }
  /**
    * Mengembalikan point di sebelah bawah point.
    * @return Objek point dengan ordinat bertambah 1.
    */
  public Point NextY() {
    return new Point(absis,ordinat+1);
  }
}