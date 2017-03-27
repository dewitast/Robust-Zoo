/**
 * File : Exit.java
 * Kelas Exit merepresentasikan pintu keluar.
 * @author Sylvia Juliana - 13515070
 */
public class Exit extends Road {
  /**
   * Render dari Exit.
   * @return Mengembalikan char yang merupakan representasi kode Exit.
   */
  public char render() {
  	return 'X';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Exit baru.
   * @return Mengembalikan Exit.
   */
  public Exit clone() {
    return new Exit(this);
  }
}