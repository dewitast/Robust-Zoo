package cell.restaurant;
import cell.*;

/**
 * File : Restaurant.java
 * Kelas Restaurant merepresentasikan restaurant.
 * @author Sylvia Juliana - 13515070
 */
public class Restaurant extends Cell {
  /**
   * Mengecek apakah cell berisi habitat
   * @return Mengembalikan true apabila cell adalah habitat.
   */
  public boolean isHabitat() {
    return false;
  }
  /**
   * Render dari Restaurant.
   * @return Mengembalikan char yang merupakan representasi kode Restaurant.
   */
  public char render() {
  	return 'S';
  }
}