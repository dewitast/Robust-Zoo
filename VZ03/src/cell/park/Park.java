package cell.park;
import cell.*;

/**
 * File : Park.java
 * Kelas Park merepresentasikan taman.
 * @author Sylvia Juliana - 13515070
 */
public class Park extends Cell {
  /**
   * Mengecek apakah cell berisi habitat
   * @return Mengembalikan true apabila cell adalah habitat.
   */
  public boolean isHabitat() {
    return false;
  }
  /**
   * Render dari Park.
   * @return Mengembalikan char yang merupakan representasi kode Park.
   */
  public char render() {
  	return '#';
  }  
}