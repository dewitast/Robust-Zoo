package animal.elephant;
import animal.mammal.*;

/**
 * File : Elephant.java
 * Kelas Elephant merupakan kelas untuk real object Elephant.
 * @author Kezia Suhendra - 13515063
 */
public class Elephant extends Mammal {
  /**
   * Constructor.
   * Menciptakan objek Elephant.
   */
  public Elephant() {
    super(5000, 250, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Elephant dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Elephant.
   * @param f Jumlah makanan Elephant.
   * @param t Status jinak Elephant.
   */
  public Elephant(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Elephant hasil salinan e.
   * @param e Elephant yang akan disalin.
   */
  public Elephant(Elephant e) {
    super(e.weight, e.food, e.tame);
  }
  /**
   * Jenis makanan yang dimakan Elephant.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Elephant.
   */
  public String getFoodType() {
    return "Herbivore";
  }
  /**
   * Memeriksa apakah Elephant adalah hewan darat.
   * @return Mengembalikan true jika Elephant adalah hewan darat dan false jika Elephant bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Elephant adalah hewan air.
   * @return Mengembalikan true jika Elephant adalah hewan air dan false jika Elephant bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Elephant adalah hewan udara.
   * @return Mengembalikan true jika Elephant adalah hewan udara dan false jika Elephant bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Elephant.
   * @return Mengembalikan string yang merepresentasikan suara Elephant.
   */
  public String interact() {
    return ("Prett!");
  }
  /**
   * Render dari Elephant.
   * @return Mengembalikan char yang merupakan representasi kode Elephant.
   */
  public char render() {
    return 'H';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Elephant baru.
   * @return Mengembalikan objek Elephant baru.
   */
  public Elephant clone() {
    return new Elephant(this);
  }
}