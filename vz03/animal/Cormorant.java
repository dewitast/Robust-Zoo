/**
  * File : Cormorant.java
  * Kelas Cormorant merupakan kelas untuk real object Cormorant.
  * @author Kezia Suhendra - 13515063
  */
public class Elephant extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Cormorant.
    */
  public Cormorant() {
    super(3.6, 0.18, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Cormorant dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Cormorant.
    * @param k Jumlah makanan Cormorant.
    * @param t Status jinak Cormorant.
  */
  public Cormorant(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Cormorant.
    * @return Mengembalikan string yang merepresentasikan suara Cormorant.
    */
  public String Interact() {
    return ("Ooookkk!");
  }
  /**
    * Render dari Cormorant.
    * @return Mengembalikan char yang merupakan representasi kode Cormorant.
  */
  public char Render() {
    return 'M';
  }
}