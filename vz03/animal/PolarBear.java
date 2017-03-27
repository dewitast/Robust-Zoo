/** 
  * File : PolarBear.java
  * Kelas PolarBear merupakan kelas untuk real object PolarBear.
  * @author Catherine Almira - 13515111
  */
public class PolarBear extends Mammal {
  /**
    * Constructor.
    * Menciptakan objek PolarBear.
    */
  public PolarBear() {
    super(300, 15, false);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek PolarBear dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat PolarBear.
    * @param f Jumlah makanan PolarBear.
    * @param t Status jinak PolarBear.
    */
  public PolarBear(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan PolarBear.
    * @return Mengembalikan string yang merepresentasikan jenis makanan PolarBear.
    */
  public String GetFoodType() {
    return "Carnivore";
  }
  /**
    * Memeriksa apakah PolarBear adalah hewan darat.
    * @return Mengembalikan true jika PolarBear adalah hewan darat dan false jika PolarBear bukan hewan darat.
    */
  public boolean IsLand() {
    return true;
  }
  /**
    * Memeriksa apakah PolarBear adalah hewan air.
    * @return Mengembalikan true jika PolarBear adalah hewan air dan false jika PolarBear bukan hewan air.
    */
  public boolean IsWater() {
    return true;
  }
  /**
    * Memeriksa apakah PolarBear adalah hewan udara.
    * @return Mengembalikan true jika PolarBear adalah hewan udara dan false jika PolarBear bukan hewan udara.
    */
  public boolean IsFlying() {
    return false;
  }
  /**
    * Interaksi yang dilakukan PolarBear.
    * @return Mengembalikan string yang merepresentasikan suara PolarBear.
    */
  public String Interact() {
    return "Auuummm";
  }
  /**
    * Render dari PolarBear.
    * @return Mengembalikan char yang merupakan representasi kode PolarBear.
    */
  public char Render() {
    return 'B';
  }
  /**
    * Melakukan cloning untuk menciptakan objek PolarBear baru.
    * @return Mengembalikan objek PolarBear baru.
    */
  public PolarBear Clone() {
    return new PolarBear(this);
  }
}