/**
  * File : Mammal.java
  * Kelas Mammal merupakan kelas untuk Mammal.
  * @author Kezia Suhendra - 13515063
  */
public class Mammal extends Animal {
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
    * @param k Jumlah makanan Mammal.
    * @param t Status jinak Mammal.
    */
  public Mammal(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Mammal.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Mammal.
    */
  public String GetFoodType() {
  	return " ";
  }
  /**
    * Memeriksa apakah Mammal adalah hewan darat.
    * @return Mengembalikan true jika Mammal adalah hewan darat dan false jika Mammal bukan hewan darat.
    */
  public boolean IsLand() {
  	return true;
  }
  /**
    * Memeriksa apakah Mammal adalah hewan air.
    * @return Mengembalikan true jika Mammal adalah hewan air dan false jika Mammal bukan hewan air.
    */
  public boolean IsWater() {
  	return false;
  }
  /**
    * Memeriksa apakah Mammal adalah hewan udara.
    * @return Mengembalikan true jika Mammal adalah hewan udara dan false jika Mammal bukan hewan udara.
    */
  public boolean IsFlying() {
  	return false;
  }
}