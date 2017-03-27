/**
  * File : Lion.java
  * Kelas Lion merupakan kelas untuk real object Lion.
  * @author Kezia Suhendra - 13515063
  */
public class Lion extends Mammal {
  /**
    * Constructor.
    * Menciptakan objek Lion.
    */
  public Lion() {
    super(150, 7.5, false);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Lion dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Lion.
    * @param k Jumlah makanan Lion.
    * @param t Status jinak Lion.
    */
  public Lion(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Lion.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Lion.
    */
  public String GetFoodType() {
    return "Carnivore";
  }
  /**
    * Memeriksa apakah Lion adalah hewan darat.
    * @return Mengembalikan true jika Lion adalah hewan darat dan false jika Lion bukan hewan darat.
    */
  public boolean IsLand() {
    return true;
  }
  /**
    * Memeriksa apakah Lion adalah hewan air.
    * @return Mengembalikan true jika Lion adalah hewan air dan false jika Lion bukan hewan air.
    */
  public boolean IsWater() {
    return false;
  }
  /**
    * Memeriksa apakah Lion adalah hewan udara.
    * @return Mengembalikan true jika Lion adalah hewan udara dan false jika Lion bukan hewan udara.
    */
  public boolean IsFlying() {
    return false;
  }
  /**
    * Interaksi yang dilakukan Lion.
    * @return Mengembalikan string yang merepresentasikan suara Lion.
    */
  public String Interact() {
    return ("Roaarr!");
  }
  /**
    * Render dari Lion.
    * @return Mengembalikan char yang merupakan representasi kode Lion.
    */
  public char Render() {
    return 'L';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Lion baru.
    * @return Mengembalikan objek Lion baru.
    */
  public Lion Clone() {
    return new Lion(this);
  }
}