/**
 * File : Road.java
 * Kelas Road merepresentasikan jalan.
 * @author Sylvia Juliana - 13515070
 */
public class Road extends Cell {
  /**
   * Render dari Road.
   * @return Mengembalikan char yang merupakan representasi kode Road.
   */
  public char render() {
  	return '+';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Road baru.
   * @return Mengembalikan Road.
   */
  public Road clone() {
    return new Road(this);
  }
}