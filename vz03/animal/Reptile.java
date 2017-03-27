/**
 * File : Reptile.java
 * Kelas Reptile merupakan kelas untuk Reptile.
 * @author Kezia Suhendra - 13515063
 */
public class Reptile extends Animal {
  /**
   * Constructor.
   * Menciptakan objek Reptile.
   */
  public Reptile() {
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Reptile dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Reptile.
   * @param k Jumlah makanan Reptile.
   * @param t Status jinak Reptile.
   */
  public Reptile(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Jenis makanan yang dimakan Reptile.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Reptile.
   */
  public String getFoodType() {
  	return " ";
  }
  /**
   * Memeriksa apakah Reptile adalah hewan darat.
   * @return Mengembalikan true jika Reptile adalah hewan darat dan false jika Reptile bukan hewan darat.
   */
  public boolean isLandAnimal() {
  	return true;
  }
  /**
   * Memeriksa apakah Reptile adalah hewan air.
   * @return Mengembalikan true jika Reptile adalah hewan air dan false jika Reptile bukan hewan air.
   */
  public boolean isWaterAnimal() {
  	return false;
  }
  /**
   * Memeriksa apakah Reptile adalah hewan udara.
   * @return Mengembalikan true jika Reptile adalah hewan udara dan false jika Reptile bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
  	return false;
  }
}