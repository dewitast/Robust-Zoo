/**
  * File : Cobra.java
  * Kelas Cobra merupakan kelas untuk real object Cobra.
  * @author Sylvia Juliana - 13515070
  */
public class Cobra extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Cobra.
    */
  public Cobra() {
  	super(20, 1, false);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Cobra dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Cobra.
    * @param f Jumlah makanan Cobra.
    * @param t Status jinak Cobra.
    */
  public Cobra(float w, float f, boolean t) {
  	super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Cobra.
    * @return Mengembalikan string yang merepresentasikan suara Cobra.
    */
  public string Interact() {
  	return "Ssshh!";
  }
  /**
    * Render dari Cobra.
    * @return Mengembalikan char yang merupakan representasi kode Cobra.
    */
  public char Render() {
  	return 'C';
  }
}