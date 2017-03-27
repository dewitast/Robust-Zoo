package animal.duck;
import animal.aves.*;
import animal.*;

/**
 * File : Duck.java
 * Kelas Duck merupakan kelas untuk real object Duck.
 * @author Kezia Suhendra - 13515063
 */
public class Duck extends Aves {
  /**
   * Constructor.
   * Menciptakan objek Duck.
   */
  public Duck() {
    super(12, 0.6, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Duck dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Duck.
   * @param k Jumlah makanan Duck.
   * @param t Status jinak Duck.
   */
  public Duck(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Duck hasil salinan d.
   * @param d Duck yang akan disalin.
   */
  public Duck(Duck d) {
    super(d.weight, d.food, d.tame);
    setPoint(d.pos);
  }
  /**
   * Jenis makanan yang dimakan Duck.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Duck.
   */
  public String getFoodType() {
    return "Omnivore";
  }
  /**
   * Memeriksa apakah Duck adalah hewan darat.
   * @return Mengembalikan true jika Duck adalah hewan darat dan false jika Duck bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Duck adalah hewan air.
   * @return Mengembalikan true jika Duck adalah hewan air dan false jika Duck bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Duck adalah hewan udara.
   * @return Mengembalikan true jika Duck adalah hewan udara dan false jika Duck bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Duck.
   * @return Mengembalikan string yang merepresentasikan suara Duck.
   */
  public String interact() {
    return ("Quaackk!");
  }
  /**
   * Render dari Duck.
   * @return Mengembalikan char yang merupakan representasi kode Duck.
   */
  public char render() {
    return 'D';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Duck baru.
   * @return Mengembalikan objek Duck baru.
   */
  public Animal deepCopy() {
    return new Duck(this);
  }
}