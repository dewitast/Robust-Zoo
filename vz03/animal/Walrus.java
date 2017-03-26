/**
  * File : Walrus.java
  * Kelas Walrus merupakan kelas untuk real object Walrus.
  * @author Catherine Almira - 13515111
  */
public class Walrus extends Animal {
  /** Constructor.
    * Menciptakan objek Walrus.
    */
  public Walrus() {
    super(1000, 50, false);
  }
  /** Constructor dengan parameter.
    * Menciptakan objek Walrus dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Walrus.
    * @param f Jumlah makanan Walrus.
    * @param t Status jinak Walrus.
    */
  public Walrus(float w, float f, boolean t) {
    super(w, f, t);
  }
  /** Interaksi yang dilakukan Walrus.
    * @return Mengembalikan string yang merepresentasikan suara Walrus.
    */
  public string Interact() {
    return "Aaarhhh";
  }
  /** Render dari Walrus.
    * @return Mengembalikan char yang merupakan representasi kode Walrus.
    */
  public char Render() {
    return 'W';
  }
}