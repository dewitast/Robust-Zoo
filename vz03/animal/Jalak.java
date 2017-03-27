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
    * Jenis makanan yang dimakan Jalak.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Jalak.
    */
  public String GetFoodType() {
    return "Herbivore";
  }
  /**
    * Memeriksa apakah Jalak adalah hewan darat.
    * @return Mengembalikan true jika Jalak adalah hewan darat dan false jika Jalak bukan hewan darat.
    */
  public boolean IsLand() {
    return false;
  }
  /**
    * Memeriksa apakah Jalak adalah hewan air.
    * @return Mengembalikan true jika Jalak adalah hewan air dan false jika Jalak bukan hewan air.
    */
  public boolean IsWater() {
    return false;
  }
  /**
    * Memeriksa apakah Jalak adalah hewan udara.
    * @return Mengembalikan true jika Jalak adalah hewan udara dan false jika Jalak bukan hewan udara.
    */
  public boolean IsFlying() {
    return true;
  }
  /**
    * Interaksi yang dilakukan Jalak.
    * @return Mengembalikan string yang merepresentasikan suara Jalak.
    */
  public String Interact() {
  	return "Tweet!";
  }
  /**
    * Render dari Jalak.
    * @return Mengembalikan char yang merupakan representasi kode Jalak.
    */
  public char Render() {
  	return 'J';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Jalak baru.
    * @return Mengembalikan objek Jalak baru.
    */
  public Jalak Clone() {
    return new Jalak(this);
  }
}