/**
  * File : Duck.java
  * Kelas Duck merupakan kelas untuk real object Duck.
  * @author Kezia Suhendra - 13515063
  */
public class Duck extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Duck.
    */
  public Duck() {
    super(12, 0.6, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Duck dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Duck.
    * @param k Jumlah makanan Duck.
    * @param t Status jinak Duck.
    */
  public Duck(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Duck.
    * @return Mengembalikan string yang merepresentasikan suara Duck.
    */
  public String Interact() {
    return ("Quaackk!");
  }
  /**
    * Render dari Duck.
    * @return Mengembalikan char yang merupakan representasi kode Duck.
    */
  public char Render() {
    return 'D';
  }
}