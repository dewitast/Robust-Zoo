/**
  * File : Dugong.java
  * Kelas Dugong merupakan kelas untuk real object Dugong.
  * @author Kezia Suhendra - 13515063
  */
public class Dugong extends Mammal {
  /**
    * Constructor.
    * Menciptakan objek Dugong.
    */
  public Dugong() {
    super(500, 25, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Dugong dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Dugong.
    * @param k Jumlah makanan Dugong.
    * @param t Status jinak Dugong.
    */
  public Dugong(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Dugong.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Dugong.
    */
  public String GetFoodType() {
    return "Herbivore";
  }
  /**
    * Memeriksa apakah Dugong adalah hewan darat.
    * @return Mengembalikan true jika Dugong adalah hewan darat dan false jika Dugong bukan hewan darat.
    */
  public boolean IsLand() {
    return false;
  }
  /**
    * Memeriksa apakah Dugong adalah hewan air.
    * @return Mengembalikan true jika Dugong adalah hewan air dan false jika Dugong bukan hewan air.
    */
  public boolean IsWater() {
    return true;
  }
  /**
    * Memeriksa apakah Dugong adalah hewan udara.
    * @return Mengembalikan true jika Dugong adalah hewan udara dan false jika Dugong bukan hewan udara.
    */
  public boolean IsFlying() {
    return false;
  }
  /**
    * Interaksi yang dilakukan Dugong.
    * @return Mengembalikan string yang merepresentasikan suara Dugong.
    */
  public String Interact() {
    return ("Splashh!");
  }
  /**
    * Melakukan cloning untuk menciptakan objek Dugong baru.
    * @return Mengembalikan objek Dugong baru.
    */
  public Dugong Clone() {
    return new Dugong(this);
  }
}