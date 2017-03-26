/**
  * File : Lion.java
  * Kelas Lion merupakan kelas untuk real object Lion.
  * @author Kezia Suhendra - 13515063
  */
public class Lion extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Lion.
    */
  public Lion() {
    super(150, 7.5, false);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Lion dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Lion.
    * @param k Jumlah makanan Lion.
    * @param t Status jinak Lion.
    */
  public Lion(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Lion.
    * @return Mengembalikan string yang merepresentasikan suara Lion.
    */
  public String Interact() {
    return ("Roaarr!");
  }
  /**
    * Render dari Lion.
    * @return Mengembalikan char yang merupakan representasi kode Lion.
    */
  public char Render() {
    return 'L';
  } 
}