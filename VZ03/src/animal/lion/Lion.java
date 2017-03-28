package animal.lion;
import animal.mammal.*;
import animal.*;

/**
 * File : Lion.java
 * Kelas Lion merupakan kelas untuk real object Lion.
 * @author Kezia Suhendra - 13515063
 */
public class Lion extends Mammal {
  /**
   * Constructor.
   * Menciptakan objek Lion.
   */
  public Lion() {
    super(150, 7.5, false);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Lion dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Lion.
   * @param k Jumlah makanan Lion.
   * @param t Status jinak Lion.
   */
  public Lion(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Lion hasil salinan l.
   * @param l Lion yang akan disalin.
   */
  public Lion(Lion l) {
    super(l.weight, l.food, l.tame);
    setPoint(l.pos);
  }
  /**
   * Jenis makanan yang dimakan Lion.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Lion.
   */
  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Lion adalah hewan darat.
   * @return Mengembalikan true jika Lion adalah hewan darat dan false jika Lion bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Lion adalah hewan air.
   * @return Mengembalikan true jika Lion adalah hewan air dan false jika Lion bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Lion adalah hewan udara.
   * @return Mengembalikan true jika Lion adalah hewan udara dan false jika Lion bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Lion.
   * @return Mengembalikan string yang merepresentasikan suara Lion.
   */
  public String interact() {
    return ("Roaarr!");
  }
  /**
   * Render dari Lion.
   * @return Mengembalikan char yang merupakan representasi kode Lion.
   */
  public char render() {
    return 'L';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Lion baru.
   * @return Mengembalikan objek Lion baru.
   */
  public Animal deepCopy() {
    return new Lion(this);
  }
}