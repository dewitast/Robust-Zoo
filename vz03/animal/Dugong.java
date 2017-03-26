/**
  * File : Dugong.java
  * Kelas Dugong merupakan kelas untuk real object Dugong.
  * @author Kezia Suhendra - 13515063
  */
public class Dugong extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Dugong.
    */
  public Dugong() {
    super(500, 25, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Dugong dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Dugong.
    * @param k Jumlah makanan Dugong.
    * @param t Status jinak Dugong.
    */
  public Dugong(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Dugong.
    * @return Mengembalikan string yang merepresentasikan suara Dugong.
    */
  public String Interact() {
    return ("Splashh!");
  }
  /**
    * Render dari Dugong.
    * @return Mengembalikan char yang merupakan representasi kode Dugong.
    */
  public char Render() {
    return 'U';
  }
}