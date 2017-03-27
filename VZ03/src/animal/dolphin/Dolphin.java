package animal.dolphin;
import animal.mammal.*;

/** 
 * File : Dolphin.java
 * Kelas Dolphin merupakan kelas untuk real object Dolphin.
 * @author Catherine Almira - 13515111
 */
public class Dolphin extends Mammal {
  /**
   * Constructor.
   * Menciptakan objek Dolphin.
   */
  public Dolphin() {
    super(75, 3.75, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Dolphin dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Dolphin.
   * @param f Jumlah makanan Dolphin.
   * @param t Status jinak Dolphin.
   */
  public Dolphin(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Dolphin hasil salinan d.
   * @param d Dolphin yang akan disalin.
   */
  public Dolphin(Dolphin d) {
    super(d.weight, d.food, d.tame);
  }
  /**
   * Jenis makanan yang dimakan Dolphin.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Dolphin.
   */
  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Dolphin adalah hewan darat.
   * @return Mengembalikan true jika Dolphin adalah hewan darat dan false jika Dolphin bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Dolphin adalah hewan air.
   * @return Mengembalikan true jika Dolphin adalah hewan air dan false jika Dolphin bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Dolphin adalah hewan udara.
   * @return Mengembalikan true jika Dolphin adalah hewan udara dan false jika Dolphin bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Dolphin.
   * @return Mengembalikan string yang merepresentasikan suara Dolphin.
   */
  public String interact() {
    return "A a a a a";
  }
  /**
   * Render dari Dolphin.
   * @return Mengembalikan char yang merupakan representasi kode Dolphin.
   */
  public char render() {
    return 'N';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Dolphin baru.
   * @return Mengembalikan objek Dolphin baru.
   */
  public Dolphin clone() {
    return new Dolphin(this);
  }
}