package animal.aves.eagle;
import animal.aves.*;
import animal.*;

/**
 * File : Eagle.java
 * Kelas Eagle merupakan kelas untuk real object Eagle.
 * @author Sylvia Juliana - 13515070
 */
public class Eagle extends Aves {
  /**
   * Constructor.
   * Menciptakan objek Eagle.
   */
  public Eagle() {
  	super(5.8, 0.29, false);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Eagle dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Eagle.
   * @param f Jumlah makanan Eagle.
   * @param t Status jinak Eagle.
   */
  public Eagle(double w, double f, boolean t) {
  	super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Eagle hasil salinan e.
   * @param e Eagle yang akan disalin.
   */
  public Eagle(Eagle e) {
    super(e.weight, e.food, e.tame);
    setPoint(e.pos);
  }
  /**
   * Jenis makanan yang dimakan Eagle.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Eagle.
   */
  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Eagle adalah hewan darat.
   * @return Mengembalikan true jika Eagle adalah hewan darat dan false jika Eagle bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Eagle adalah hewan air.
   * @return Mengembalikan true jika Eagle adalah hewan air dan false jika Eagle bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Eagle adalah hewan udara.
   * @return Mengembalikan true jika Eagle adalah hewan udara dan false jika Eagle bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return true;
  }
  /**
   * Interaksi yang dilakukan Eagle.
   * @return Mengembalikan string yang merepresentasikan suara Eagle.
   */
  public String interact() {
  	return "Nguiikk!";
  }
  /**
   * Render dari Eagle.
   * @return Mengembalikan char yang merupakan representasi kode Eagle.
   */
  public char render() {
  	return 'E';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Eagle baru.
   * @return Mengembalikan objek Eagle baru.
   */
  public Animal deepCopy() {
    return new Eagle(this);
  }
}
