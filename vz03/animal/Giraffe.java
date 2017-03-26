/**
  * File : Giraffe.java
  * Kelas Giraffe merupakan kelas untuk real object Giraffe.
  * @author Kezia Suhendra - 13515063
  */
public class Giraffe extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Giraffe.
    */
  public Giraffe() {
    super(1100, 55, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Giraffe dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Giraffe.
    * @param k Jumlah makanan Giraffe.
    * @param t Status jinak Giraffe.
    */
  public Giraffe(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Giraffe.
    * @return Mengembalikan string yang merepresentasikan suara Giraffe.
    */
  public String Interact() {
    return ("Hmm!");
  }
  /**
    * Render dari Giraffe.
    * @return Mengembalikan char yang merupakan representasi kode Giraffe.
    */
  public char Render() {
    return 'F';
  }
}