package animal.alligator;
import animal.reptile.*;
import animal.*;

/**
 * File : Alligator.java
 * Kelas Alligator merupakan kelas untuk real object Alligator.
 * @author Kezia Suhendra - 13515063
 */
public class Alligator extends Reptile {
  /**
   * Constructor.
   * Menciptakan objek Alligator.
   */
  public Alligator() {
    super(125, 6.25, false);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Alligator dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Alligator.
   * @param f Jumlah makanan Alligator.
   * @param t Status jinak Alligator.
   */
  public Alligator(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Alligator hasil salinan a.
   * @param a Alligator yang akan disalin.
   */
  public Alligator(Alligator a) {
    super(a.weight, a.food, a.tame);
    setPoint(a.pos);
  }
  /**
   * Jenis makanan yang dimakan Alligator.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Alligator.
   */
  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Alligator adalah hewan darat.
   * @return Mengembalikan true jika Alligator adalah hewan darat dan false jika Alligator bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Alligator adalah hewan air.
   * @return Mengembalikan true jika Alligator adalah hewan air dan false jika Alligator bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Alligator adalah hewan udara.
   * @return Mengembalikan true jika Alligator adalah hewan udara dan false jika Alligator bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Alligator.
   * @return Mengembalikan string yang merepresentasikan suara Alligator.
   */
  public String interact() {
    return ("Grrrrrr");
  }
  /**
   * Render dari Alligator.
   * @return Mengembalikan char yang merupakan representasi kode Alligator.
   */
  public char render() {
    return 'A';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Alligator baru.
   * @return Mengembalikan objek Alligator baru.
   */
  public Animal deepCopy() {
    return new Alligator(this);
  }
}