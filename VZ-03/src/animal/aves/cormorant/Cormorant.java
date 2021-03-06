package animal.aves.cormorant;

import animal.Animal;

import animal.aves.Aves;
/**
 * File : Cormorant.java
 * Kelas Cormorant merupakan kelas untuk real object Cormorant.
 * @author Kezia Suhendra - 13515063
 */

public class Cormorant extends Aves {
  /**
   * Constructor.
   * Menciptakan objek Cormorant.
   */

  public Cormorant() {
    super(3.6, 0.18, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Cormorant dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Cormorant.
   * @param f Jumlah makanan Cormorant.
   * @param t Status jinak Cormorant.
   */

  public Cormorant(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Cormorant hasil salinan c.
   * @param c Cormorant yang akan disalin.
   */

  public Cormorant(Cormorant c) {
    super(c.weight, c.food, c.tame);
    setPoint(c.pos);
  }
  /**
   * Jenis makanan yang dimakan Cormorant.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Cormorant.
   */

  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Cormorant adalah hewan darat.
   * @return Mengembalikan true jika Cormorant adalah hewan darat.
   */

  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Cormorant adalah hewan air.
   * @return Mengembalikan true jika Cormorant adalah hewan air.
   */

  public boolean isWaterAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Cormorant adalah hewan udara.
   * @return Mengembalikan true jika Cormorant adalah hewan udara.
   */

  public boolean isFlyingAnimal() {
    return true;
  }
  /**
   * Interaksi yang dilakukan Cormorant.
   * @return Mengembalikan string yang merepresentasikan suara Cormorant.
   */

  public String interact() {
    return ("Ooookkk!");
  }
  /**
   * Render dari Cormorant.
   * @return Mengembalikan char yang merupakan representasi kode Cormorant.
 */

  public char render() {
    return 'M';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Cormorant baru.
   * @return Mengembalikan objek Cormorant baru.
   */

  public Animal deepCopy() {
    return new Cormorant(this);
  }
}