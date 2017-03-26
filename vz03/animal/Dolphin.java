/** 
  * File : Dolphin.java
  * Kelas Dolphin merupakan kelas untuk real object Dolphin.
  * @author Catherine Almira - 13515111
  */
public class Dolphin extends Animal {
  /** Constructor.
    * Menciptakan objek Dolphin.
    */
  public Dolphin() {
    super(75, 3.75, true);
  }
  /** Constructor dengan parameter.
    * Menciptakan objek Dolphin dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Dolphin.
    * @param f Jumlah makanan Dolphin.
    * @param t Status jinak Dolphin.
    */
  public Dolphin(float w, float f, boolean t) {
    super(w, f, t);
  }
  /** Interaksi yang dilakukan Dolphin.
    * @return Mengembalikan string yang merepresentasikan suara Dolphin.
    */
  public string Interact() {
    return "A a a a a";
  }
  /** Render dari Dolphin.
    * @return Mengembalikan char yang merupakan representasi kode Dolphin.
    */
  public char Render() {
    return 'N';
  }
}