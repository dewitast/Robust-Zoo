/** 
  * File : Parrot.java
  * Kelas Parrot merupakan kelas untuk real object Parrot.
  * @author Catherine Almira - 13515111
  */
public class Parrot extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Parrot.
    */
  public Parrot() {
    super(1.2, 0.06, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Parrot dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Parrot.
    * @param f Jumlah makanan Parrot.
    * @param t Status jinak Parrot.
    */
  public Parrot(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Parrot.
    * @return Mengembalikan string yang merepresentasikan suara Parrot.
    */
  public String Interact() {
    return "Cuiitt";
  }
  /**
    * Render dari Parrot.
    * @return Mengembalikan char yang merupakan representasi kode Parrot.
    */
  public char Render() {
    return 'P';
  }
}