/** File : Eagle.java
  * Penanggung jawab : Sylvia Juliana - 13515070
  */

/** Kelas Eagle merupakan kelas untuk real object Eagle.
  */
public class Eagle extends Animal {
  /** Constructor.
    * Menciptakan objek Eagle.
    */
  public Eagle() {
  	super(5.8, 0.29, false);
  }
  /** Constructor dengan parameter.
    * Menciptakan objek Eagle dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Eagle.
    * @param f Jumlah makanan Eagle.
    * @param t Status jinak Eagle.
    */
  public Eagle(float w, float f, boolean t) {
  	super(w, f, t);
  }
  /** Interaksi yang dilakukan Eagle.
    * @return Mengembalikan string yang merepresentasikan suara Eagle.
    */
  public string Interact() {
  	return "Nguiikk!";
  }
  /** Render dari Eagle.
    * @return Mengembalikan char yang merupakan representasi kode Eagle.
    */
  public char Render() {
  	return 'E';
  }
}