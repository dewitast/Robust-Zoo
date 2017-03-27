/** 
  * File : Iguana.java
  * Kelas Iguana merupakan kelas untuk real object Iguana.
  * @author Catherine Almira - 13515111
  */
public class Iguana extends Reptile {
  /**
    * Constructor.
    * Menciptakan objek Iguana.
    */
  public Iguana() {
    super(6, 0.3, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Iguana dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Iguana.
    * @param f Jumlah makanan Iguana.
    * @param t Status jinak Iguana.
    */
  public Iguana(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Iguana.
    * @return Mengembalikan string yang merepresentasikan suara Iguana.
    */
  public String Interact() {
    return "Purrrr";
  }
  /**
    * Render dari Iguana.
    * @return Mengembalikan char yang merupakan representasi kode Iguana.
    */
  public char Render() {
    return 'I';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Iguana baru.
    * @return Mengembalikan objek Iguana baru.
    */
  public Iguana Clone() {
    return new Iguana(this);
  }
}