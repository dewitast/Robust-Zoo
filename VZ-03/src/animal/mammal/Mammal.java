package animal.mammal;

import animal.Animal;

/**
 * File : Mammal.java
 * Kelas Mammal merupakan kelas untuk Mammal.
 * @author Kezia Suhendra - 13515063
 */

public abstract class Mammal extends Animal {
  /**
   * Constructor.
   * Menciptakan objek Mammal.
   */

  public Mammal() {
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Mammal dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Mammal.
   * @param f Jumlah makanan Mammal.
   * @param t Status jinak Mammal.
   */

  public Mammal(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Jenis makanan yang dimakan Mammal.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Mammal.
   */

  public String getFoodType() {
  	return " ";
  }
  /**
   * Memeriksa apakah Mammal adalah hewan darat.
   * @return Mengembalikan true jika Mammal adalah hewan darat dan false jika Mammal bukan hewan darat.
   */

  public boolean isLandAnimal() {
  	return true;
  }
  /**
   * Memeriksa apakah Mammal adalah hewan air.
   * @return Mengembalikan true jika Mammal adalah hewan air dan false jika Mammal bukan hewan air.
   */

  public boolean isWaterAnimal() {
  	return false;
  }
  /**
   * Memeriksa apakah Mammal adalah hewan udara.
   * @return Mengembalikan true jika Mammal adalah hewan udara dan false jika Mammal bukan hewan udara.
   */
  
  public boolean isFlyingAnimal() {
  	return false;
  }
}