/**
 * File : Entrance.java
 * Kelas Entrance merepresentasikan pintu masuk.
 * @author Sylvia Juliana - 13515070
 */
public class Entrance extends Road {
  /**
   * Render dari Entrance.
   * @return Mengembalikan char yang merupakan representasi kode Entrance.
   */
  public char render() {
  	return 'Z';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Entrance baru.
   * @return Mengembalikan Entrance.
   */
  public Entrance clone() {
    return new Entrance(this);
  }
}