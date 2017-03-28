package animal.dugong;
import animal.mammal.*;
import animal.*;

/**
 * File : Dugong.java
 * Kelas Dugong merupakan kelas untuk real object Dugong.
 * @author Kezia Suhendra - 13515063
 */
public class Dugong extends Mammal {
  /**
   * Constructor.
   * Menciptakan objek Dugong.
   */
  public Dugong() {
    super(500, 25, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Dugong dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Dugong.
   * @param f Jumlah makanan Dugong.
   * @param t Status jinak Dugong.
   */
  public Dugong(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Dugong hasil salinan d.
   * @param d Dugong yang akan disalin.
   */
  public Dugong(Dugong d) {
    super(d.weight, d.food, d.tame);
    setPoint(d.pos);
  }
  /**
   * Jenis makanan yang dimakan Dugong.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Dugong.
   */
  public String getFoodType() {
    return "Herbivore";
  }
  /**
   * Memeriksa apakah Dugong adalah hewan darat.
   * @return Mengembalikan true jika Dugong adalah hewan darat dan false jika Dugong bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Dugong adalah hewan air.
   * @return Mengembalikan true jika Dugong adalah hewan air dan false jika Dugong bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Dugong adalah hewan udara.
   * @return Mengembalikan true jika Dugong adalah hewan udara dan false jika Dugong bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Dugong.
   * @return Mengembalikan string yang merepresentasikan suara Dugong.
   */
  public String interact() {
    return ("Splashh!");
  }
  /**
   * Render dari Dugong.
   * @return Mengembalikan char yang merupakan representasi kode Dugong.
   */
  public char render() {
    return 'U';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Dugong baru.
   * @return Mengembalikan objek Dugong baru.
   */
  public Animal deepCopy() {
    return new Dugong(this);
  }
}