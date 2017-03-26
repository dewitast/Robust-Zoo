/** 
  * File : Polar_Bear.java
  * Kelas Polar_Bear merupakan kelas untuk real object Polar_Bear.
  * @author Catherine Almira - 13515111
  */
public class Polar_Bear extends Animal {
  /** Constructor.
    * Menciptakan objek Polar_Bear.
    */
  public Polar_Bear() {
    super(300, 15, false);
  }
  /** Constructor dengan parameter.
    * Menciptakan objek Polar_Bear dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Polar_Bear.
    * @param f Jumlah makanan Polar_Bear.
    * @param t Status jinak Polar_Bear.
    */
  public Polar_Bear(float w, float f, boolean t) {
    super(w, f, t);
  }
  /** Interaksi yang dilakukan Polar_Bear.
    * @return Mengembalikan string yang merepresentasikan suara Polar_Bear.
    */
  public string Interact() {
    return "Auuummm";
  }
  /** Render dari Polar_Bear.
    * @return Mengembalikan char yang merupakan representasi kode Polar_Bear.
    */
  public char Render() {
    return 'B';
  }
}