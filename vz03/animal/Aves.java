/**
  * File : Aves.java
  * Kelas Aves merupakan kelas untuk Aves.
  * @author Kezia Suhendra - 13515063
  */
public class Aves extends Animal {
  /**
    * Constructor.
    * Menciptakan objek Aves.
    */
  public Aves() {
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Aves dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Aves.
    * @param k Jumlah makanan Aves.
    * @param t Status jinak Aves.
    */
  public Aves(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Aves.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Aves.
    */
  public String GetFoodType() {
  	return " ";
  }
  /**
    * Memeriksa apakah Aves adalah hewan darat.
    * @return Mengembalikan true jika Aves adalah hewan darat dan false jika Aves bukan hewan darat.
    */
  public boolean IsLand() {
  	return false;
  }
  /**
    * Memeriksa apakah Aves adalah hewan air.
    * @return Mengembalikan true jika Aves adalah hewan air dan false jika Aves bukan hewan air.
    */
  public boolean IsWater() {
  	return false;
  }
  /**
    * Memeriksa apakah Aves adalah hewan udara.
    * @return Mengembalikan true jika Aves adalah hewan udara dan false jika Aves bukan hewan udara.
    */
  public boolean IsFlying() {
  	return true;
  }
}