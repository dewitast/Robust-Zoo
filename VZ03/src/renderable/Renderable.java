package renderable;

/**
 * File : Renderable.java
 * Kelas abstrak Renderable merepresentasikan kode objek yang dapat dicetak
 * @author Catherine Almira - 13515111
 */
public interface Renderable {
  /**
   * Fungsi render akan menghasilkan karakter yang dipakai untuk representasi
   * objek pada Zoo.
   * @return Mengembalikan char yang merupakan representasi kode objek.
   */
  public char render();
}