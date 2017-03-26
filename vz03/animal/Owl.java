/** File : Owl.java
  * Penanggung jawab : Sylvia Juliana - 13515070
  */

/** Kelas Owl merupakan kelas untuk real object Owl.
  */
public class Owl extends Animal {
  /** Constructor.
    * Menciptakan objek Owl.
    */
  public Owl() {
  	super(1.5, 0.075, true);
  }
  /** Constructor dengan parameter.
    * Menciptakan objek Owl dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Owl.
    * @param f Jumlah makanan Owl.
    * @param t Status jinak Owl.
    */
  public Owl(float w, float f, boolean t) {
  	super(w, f, t);
  }
  /** Interaksi yang dilakukan Owl.
    * @return Mengembalikan string yang merepresentasikan suara Owl.
    */
  public string Interact() {
  	return "Hoot!";
  }
  /** Render dari Owl.
    * @return Mengembalikan char yang merupakan representasi kode Owl.
    */
  public char Render() {
  	return 'O';
  }
}