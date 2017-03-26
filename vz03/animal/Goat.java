/** File : Goat.java
  * Penanggung jawab : Catherine Almira - 13515111
  */
  
/** Kelas Goat merupakan kelas untuk real object Goat.
  */
public class Goat extends Animal {
  /** Constructor.
    * Menciptakan objek Goat.
    */
  public Goat() {
	super(90, 4.5, false);
  }
  /** Constructor dengan parameter.
    * Menciptakan objek Goat dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Goat.
    * @param f Jumlah makanan Goat.
    * @param t Status jinak Goat.
    */
  public Goat(float w, float f, boolean t) {
	super(w, f, t);
  }
  /** Interaksi yang dilakukan Goat.
    * @return Mengembalikan string yang merepresentasikan suara Goat.
    */
  public string Interact() {
	return "Mbeeeee!";
  }
  /** Render dari Goat.
    * @return Mengembalikan char yang merupakan representasi kode Goat.
    */
  public char Render() {
	return 'G';
  }
}