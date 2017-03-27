/** 
  * File : Dolphin.java
  * Kelas Dolphin merupakan kelas untuk real object Dolphin.
  * @author Catherine Almira - 13515111
  */
public class Dolphin extends Mammal {
  /**
    * Constructor.
    * Menciptakan objek Dolphin.
    */
  public Dolphin() {
    super(75, 3.75, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Dolphin dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Dolphin.
    * @param f Jumlah makanan Dolphin.
    * @param t Status jinak Dolphin.
    */
  public Dolphin(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Dolphin.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Dolphin.
    */
  public String GetFoodType() {
    return "Carnivore";
  }
  /**
    * Memeriksa apakah Dolphin adalah hewan darat.
    * @return Mengembalikan true jika Dolphin adalah hewan darat dan false jika Dolphin bukan hewan darat.
    */
  public boolean IsLand() {
    return false;
  }
  /**
    * Memeriksa apakah Dolphin adalah hewan air.
    * @return Mengembalikan true jika Dolphin adalah hewan air dan false jika Dolphin bukan hewan air.
    */
  public boolean IsWater() {
    return true;
  }
  /**
    * Memeriksa apakah Dolphin adalah hewan udara.
    * @return Mengembalikan true jika Dolphin adalah hewan udara dan false jika Dolphin bukan hewan udara.
    */
  public boolean IsFlying() {
    return false;
  }
  /**
    * Interaksi yang dilakukan Dolphin.
    * @return Mengembalikan string yang merepresentasikan suara Dolphin.
    */
  public String Interact() {
    return "A a a a a";
  }
  /**
    * Render dari Dolphin.
    * @return Mengembalikan char yang merupakan representasi kode Dolphin.
    */
  public char Render() {
    return 'N';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Dolphin baru.
    * @return Mengembalikan objek Dolphin baru.
    */
  public Dolphin Clone() {
    return new Dolphin(this);
  }
}