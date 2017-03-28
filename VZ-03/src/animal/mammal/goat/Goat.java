package animal.mammal.goat;

import animal.Animal;

import animal.mammal.Mammal;

/**
 * File : Goat.java
 * Kelas Goat merupakan kelas untuk real object Goat.
 * @author Catherine Almira - 13515111
 */
public class Goat extends Mammal {
  /**
   * Constructor.
   * Menciptakan objek Goat.
   */

  public Goat() {
    super(90, 4.5, false);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Goat dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Goat.
   * @param f Jumlah makanan Goat.
   * @param t Status jinak Goat.
   */

  public Goat(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Goat hasil salinan g.
   * @param g Goat yang akan disalin.
   */

  public Goat(Goat g) {
    super(g.weight, g.food, g.tame);
    setPoint(g.pos);
  }
  /**
   * Jenis makanan yang dimakan Goat.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Goat.
   */

  public String getFoodType() {
    return "Herbivore";
  }
  /**
   * Memeriksa apakah Goat adalah hewan darat.
   * @return Mengembalikan true jika Goat adalah hewan darat.
   */

  public boolean isLandAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Goat adalah hewan air.
   * @return Mengembalikan true jika Goat adalah hewan air.
   */

  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Goat adalah hewan udara.
   * @return Mengembalikan true jika Goat adalah hewan udara.
   */

  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Goat.
   * @return Mengembalikan string yang merepresentasikan suara Goat.
   */

  public String interact() {
    return "Mbeeeee!";
  }
  /**
   * Render dari Goat.
   * @return Mengembalikan char yang merupakan representasi kode Goat.
   */

  public char render() {
    return 'G';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Goat baru.
   * @return Mengembalikan objek Goat baru.
   */

  public Animal deepCopy() {
    return new Goat(this);
  }
}