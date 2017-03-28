package animal.mammal.walrus;
import animal.mammal.*;
import animal.*;

/**
 * File : Walrus.java
 * Kelas Walrus merupakan kelas untuk real object Walrus.
 * @author Catherine Almira - 13515111
 */
public class Walrus extends Mammal {
  /**
   * Constructor.
   * Menciptakan objek Walrus.
   */
  public Walrus() {
    super(1000, 50, false);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Walrus dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Walrus.
   * @param f Jumlah makanan Walrus.
   * @param t Status jinak Walrus.
   */
  public Walrus(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Walrus hasil salinan w.
   * @param w Walrus yang akan disalin.
   */
  public Walrus(Walrus w) {
    super(w.weight, w.food, w.tame);
    setPoint(w.pos);
  }
  /**
   * Jenis makanan yang dimakan Walrus.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Walrus.
   */
  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Walrus adalah hewan darat.
   * @return Mengembalikan true jika Walrus adalah hewan darat dan false jika Walrus bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Walrus adalah hewan air.
   * @return Mengembalikan true jika Walrus adalah hewan air dan false jika Walrus bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Walrus adalah hewan udara.
   * @return Mengembalikan true jika Walrus adalah hewan udara dan false jika Walrus bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Walrus.
   * @return Mengembalikan string yang merepresentasikan suara Walrus.
   */
  public String interact() {
    return "Aaarhhh";
  }
  /**
   * Render dari Walrus.
   * @return Mengembalikan char yang merupakan representasi kode Walrus.
   */
  public char render() {
    return 'W';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Walrus baru.
   * @return Mengembalikan objek Walrus baru.
   */
  public Animal deepCopy() {
    return new Walrus(this);
  }
}