/**
  * File : Alligator.java
  * Kelas Alligator merupakan kelas untuk real object Alligator.
  * @author Kezia Suhendra - 13515063
  */
public class Alligator extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Alligator.
    */
  public Alligator() {
    super(125, 6.25, false);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Alligator dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Alligator.
    * @param f Jumlah makanan Alligator.
    * @param t Status jinak Alligator.
    */
  public Alligator(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Alligator.
    * @return Mengembalikan string yang merepresentasikan suara Alligator.
    */
  public String Interact() {
    return ("Grrrrrr");
  }
  /**
    * Render dari Alligator.
    * @return Mengembalikan char yang merupakan representasi kode Alligator.
    */
  public char Render() {
    return 'A';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Alligator baru.
    * @return Mengembalikan objek Alligator baru.
    */
  public Alligator Clone() {
    return new Alligator(this);
  }
}