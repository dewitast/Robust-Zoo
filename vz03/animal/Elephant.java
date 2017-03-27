/**
  * File : Elephant.java
  * Kelas Elephant merupakan kelas untuk real object Elephant.
  * @author Kezia Suhendra - 13515063
  */
public class Elephant extends Mammal {
  /**
    * Constructor.
    * Menciptakan objek Elephant.
    */
  public Elephant() {
    super(5000, 250, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Elephant dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Elephant.
    * @param f Jumlah makanan Elephant.
    * @param t Status jinak Elephant.
    */
  public Elephant(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Elephant.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Elephant.
    */
  public String GetFoodType() {
    return "Herbivore";
  }
  /**
    * Memeriksa apakah Elephant adalah hewan darat.
    * @return Mengembalikan true jika Elephant adalah hewan darat dan false jika Elephant bukan hewan darat.
    */
  public boolean IsLand() {
    return true;
  }
  /**
    * Memeriksa apakah Elephant adalah hewan air.
    * @return Mengembalikan true jika Elephant adalah hewan air dan false jika Elephant bukan hewan air.
    */
  public boolean IsWater() {
    return false;
  }
  /**
    * Memeriksa apakah Elephant adalah hewan udara.
    * @return Mengembalikan true jika Elephant adalah hewan udara dan false jika Elephant bukan hewan udara.
    */
  public boolean IsFlying() {
    return false;
  }
  /**
    * Interaksi yang dilakukan Elephant.
    * @return Mengembalikan string yang merepresentasikan suara Elephant.
    */
  public String Interact() {
    return ("Prett!");
  }
  /**
    * Render dari Elephant.
    * @return Mengembalikan char yang merupakan representasi kode Elephant.
    */
  public char Render() {
    return 'H';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Elephant baru.
    * @return Mengembalikan objek Elephant baru.
    */
  public Elephant Clone() {
    return new Elephant(this);
  }
}