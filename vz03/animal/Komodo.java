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
   * Constructor dengan parameter.
   * Menciptakan objek Komodo hasil salinan k.
   * @param k Komodo yang akan disalin.
   */
  public Komodo(Komodo k) {
    super(k.weight, k.food, k.tame);
  }
  /**
   * Jenis makanan yang dimakan Komodo.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Komodo.
   */
  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Komodo adalah hewan darat.
   * @return Mengembalikan true jika Komodo adalah hewan darat dan false jika Komodo bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Komodo adalah hewan air.
   * @return Mengembalikan true jika Komodo adalah hewan air dan false jika Komodo bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Komodo adalah hewan udara.
   * @return Mengembalikan true jika Komodo adalah hewan udara dan false jika Komodo bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Komodo.
   * @return Mengembalikan string yang merepresentasikan suara Komodo.
   */
  public String interact() {
    return ("Slpp!");
  }
  /**
   * Render dari Komodo.
   * @return Mengembalikan char yang merupakan representasi kode Komodo.
   */
  public char render() {
    return 'K';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Komodo baru.
   * @return Mengembalikan objek Komodo baru.
   */
  public Komodo clone() {
    return new Komodo(this);
  }
}