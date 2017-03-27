package animal.giraffe;
import animal.mammal.*;

/**
 * File : Giraffe.java
 * Kelas Giraffe merupakan kelas untuk real object Giraffe.
 * @author Kezia Suhendra - 13515063
 */
public class Giraffe extends Mammal {
  /**
   * Constructor.
   * Menciptakan objek Giraffe.
   */
  public Giraffe() {
    super(1100, 55, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Giraffe dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Giraffe.
   * @param k Jumlah makanan Giraffe.
   * @param t Status jinak Giraffe.
   */
  public Giraffe(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Giraffe hasil salinan g.
   * @param g Giraffe yang akan disalin.
   */
  public Giraffe(Giraffe g) {
    super(g.weight, g.food, g.tame);
  }
  /**
   * Jenis makanan yang dimakan Giraffe.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Giraffe.
   */
  public String getFoodType() {
    return "Herbivore";
  }
  /**
   * Memeriksa apakah Giraffe adalah hewan darat.
   * @return Mengembalikan true jika Giraffe adalah hewan darat dan false jika Giraffe bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Giraffe adalah hewan air.
   * @return Mengembalikan true jika Giraffe adalah hewan air dan false jika Giraffe bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Giraffe adalah hewan udara.
   * @return Mengembalikan true jika Giraffe adalah hewan udara dan false jika Giraffe bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Giraffe.
   * @return Mengembalikan string yang merepresentasikan suara Giraffe.
   */
  public String interact() {
    return ("Hmm!");
  }
  /**
   * Render dari Giraffe.
   * @return Mengembalikan char yang merupakan representasi kode Giraffe.
   */
  public char render() {
    return 'F';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Girrafe baru.
   * @return Mengembalikan objek Girrafe baru.
   */
  public Giraffe clone() {
    return new Giraffe(this);
  }
}