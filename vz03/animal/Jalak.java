/**
  * File : Jalak.java
  * Kelas Jalak merupakan kelas untuk real object Jalak.
  * @author Sylvia Juliana - 13515070
  */
public class Jalak extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Jalak.
    */
  public Jalak() {
  	super(0.1, 0.005, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Jalak dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Jalak.
    * @param f Jumlah makanan Jalak.
    * @param t Status jinak Jalak.
    */
  public Jalak(float w, float f, boolean t) {
  	super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Jalak.
    * @return Mengembalikan string yang merepresentasikan suara Jalak.
    */
  public string Interact() {
  	return "Tweet!";
  }
  /**
    * Render dari Jalak.
    * @return Mengembalikan char yang merupakan representasi kode Jalak.
    */
  public char Render() {
  	return 'J';
  }
}