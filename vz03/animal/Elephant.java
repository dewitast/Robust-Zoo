/**
  * File : Elephant.java
  * Kelas Elephant merupakan kelas untuk real object Elephant.
  * @author Kezia Suhendra - 13515063
  */
public class Elephant extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Elephant.
    */
  public Elephant() {
    super(5000, 250, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Elephant dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Elephant.
    * @param f Jumlah makanan Elephant.
    * @param t Status jinak Elephant.
    */
  public Elephant(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Elephant.
    * @return Mengembalikan string yang merepresentasikan suara Elephant.
    */
  public String Interact() {
    return ("Prett!");
  }
  /**
    * Render dari Elephant.
    * @return Mengembalikan char yang merupakan representasi kode Elephant.
    */
  public char Render() {
    return 'H';
  } 
}