package animal.aves.jalak;
import animal.aves.*;
import animal.*;

/**
 * File : Jalak.java
 * Kelas Jalak merupakan kelas untuk real object Jalak.
 * @author Sylvia Juliana - 13515070
 */
public class Jalak extends Aves {
  /**
   * Constructor.
   * Menciptakan objek Jalak.
   */
  public Jalak() {
  	super(0.1, 0.005, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Jalak dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Jalak.
   * @param f Jumlah makanan Jalak.
   * @param t Status jinak Jalak.
   */
  public Jalak(double w, double f, boolean t) {
  	super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Jalak hasil salinan j.
   * @param j Jalak yang akan disalin.
   */
  public Jalak(Jalak j) {
    super(j.weight, j.food, j.tame);
    setPoint(j.pos);
  }
  /**
   * Jenis makanan yang dimakan Jalak.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Jalak.
   */
  public String getFoodType() {
    return "Herbivore";
  }
  /**
   * Memeriksa apakah Jalak adalah hewan darat.
   * @return Mengembalikan true jika Jalak adalah hewan darat dan false jika Jalak bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Jalak adalah hewan air.
   * @return Mengembalikan true jika Jalak adalah hewan air dan false jika Jalak bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Jalak adalah hewan udara.
   * @return Mengembalikan true jika Jalak adalah hewan udara dan false jika Jalak bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return true;
  }
  /**
   * Interaksi yang dilakukan Jalak.
   * @return Mengembalikan string yang merepresentasikan suara Jalak.
   */
  public String interact() {
  	return "Tweet!";
  }
  /**
   * Render dari Jalak.
   * @return Mengembalikan char yang merupakan representasi kode Jalak.
   */
  public char render() {
  	return 'J';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Jalak baru.
   * @return Mengembalikan objek Jalak baru.
   */
  public Animal deepCopy() {
    return new Jalak(this);
  }
}