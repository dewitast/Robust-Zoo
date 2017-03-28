package animal.aves.owl;

import animal.Animal;

import animal.aves.Aves;
/**
 * File : Owl.java
 * Kelas Owl merupakan kelas untuk real object Owl.
 * @author Sylvia Juliana - 13515070
 */

public class Owl extends Aves {
  /**
   * Constructor.
   * Menciptakan objek Owl.
   */

  public Owl() {
    super(1.5, 0.075, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Owl dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Owl.
   * @param f Jumlah makanan Owl.
   * @param t Status jinak Owl.
   */

  public Owl(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Owl hasil salinan o.
   * @param o Owl yang akan disalin.
   */

  public Owl(Owl o) {
    super(o.weight, o.food, o.tame);
    setPoint(o.pos);
  }
  /**
   * Jenis makanan yang dimakan Owl.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Owl.
   */

  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Owl adalah hewan darat.
   * @return Mengembalikan true jika Owl adalah hewan darat.
   */

  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Owl adalah hewan air.
   * @return Mengembalikan true jika Owl adalah hewan airr.
   */

  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Owl adalah hewan udara.
   * @return Mengembalikan true jika Owl adalah hewan udara.
   */

  public boolean isFlyingAnimal() {
    return true;
  }
  /**
   * Interaksi yang dilakukan Owl.
   * @return Mengembalikan string yang merepresentasikan suara Owl.
   */

  public String interact() {
    return "Hoot!";
  }
  /**
   * Render dari Owl.
   * @return Mengembalikan char yang merupakan representasi kode Owl.
   */

  public char render() {
    return 'O';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Owl baru.
   * @return Mengembalikan objek Owl baru.
   */

  public Animal deepCopy() {
    return new Owl(this);
  }
}