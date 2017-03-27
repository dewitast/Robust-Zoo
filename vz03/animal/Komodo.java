/**
  * File : Komodo.java
  * Kelas Komodo merupakan kelas untuk real object Komodo.
  * @author Kezia Suhendra - 13515063
  */
public class Komodo extends Reptile {
  /**
    * Constructor.
    * Menciptakan objek Komodo.
    */
  public Komodo() {
    super(120, 6, false);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Komodo dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Komodo.
    * @param k Jumlah makanan Komodo.
    * @param t Status jinak Komodo.
    */
  public Komodo(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Komodo.
    * @return Mengembalikan string yang merepresentasikan suara Komodo.
    */
  public String Interact() {
    return ("Slpp!");
  }
  /**
    * Render dari Komodo.
    * @return Mengembalikan char yang merupakan representasi kode Komodo.
    */
  public char Render() {
    return 'K';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Komodo baru.
    * @return Mengembalikan objek Komodo baru.
    */
  public Komodo Clone() {
    return new Komodo(this);
  }
}