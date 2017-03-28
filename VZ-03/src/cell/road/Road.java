package cell.road;
import cell.*;

/**
 * File : Road.java
 * Kelas Road merepresentasikan jalan.
 * @author Sylvia Juliana - 13515070
 */
public class Road extends Cell {
  /**
   * Mengecek apakah cell berisi habitat
   * @return Mengembalikan true apabila cell adalah habitat.
   */
  public boolean isHabitat() {
    return false;
  }
  /**
   * Render dari Road.
   * @return Mengembalikan char yang merupakan representasi kode Road.
   */
  public char render() {
  	return '+';
  }
}