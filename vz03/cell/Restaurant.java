/**
 * File : Restaurant.java
 * Kelas Restaurant merepresentasikan restaurant.
 * @author Sylvia Juliana - 13515070
 */
public class Restaurant extends Cell {
  /**
   * Render dari Restaurant.
   * @return Mengembalikan char yang merupakan representasi kode Restaurant.
   */
  public char render() {
  	return 'S';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Restaurant baru.
   * @return Mengembalikan Restaurant.
   */
  public Restaurant clone() {
    return new Restaurant(this);
  }
}