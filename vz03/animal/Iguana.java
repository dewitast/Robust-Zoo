/** 
  * File : Iguana.java
  * Kelas Iguana merupakan kelas untuk real object Iguana.
  * @author Catherine Almira - 13515111
  */
public class Iguana extends Iguana {
  /**
    * Constructor.
    * Menciptakan objek Iguana.
    */
  public Iguana() {
    super(6, 0.3, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Iguana dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Iguana.
    * @param f Jumlah makanan Iguana.
    * @param t Status jinak Iguana.
    */
  public Iguana(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Iguana hasil salinan i.
   * @param i Iguana yang akan disalin.
   */
  public Iguana(Iguana i) {
    super(i.weight, i.food, i.tame);
  }
  /**
    * Jenis makanan yang dimakan Iguana.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Iguana.
    */
  public String GetFoodType() {
    return "Herbivore";
  }
  /**
    * Memeriksa apakah Iguana adalah hewan darat.
    * @return Mengembalikan true jika Iguana adalah hewan darat dan false jika Iguana bukan hewan darat.
    */
  public boolean IsLand() {
    return true;
  }
  /**
    * Memeriksa apakah Iguana adalah hewan air.
    * @return Mengembalikan true jika Iguana adalah hewan air dan false jika Iguana bukan hewan air.
    */
  public boolean IsWater() {
    return false;
  }
  /**
    * Memeriksa apakah Iguana adalah hewan udara.
    * @return Mengembalikan true jika Iguana adalah hewan udara dan false jika Iguana bukan hewan udara.
    */
  public boolean IsFlying() {
    return false;
  }
  /**
    * Interaksi yang dilakukan Iguana.
    * @return Mengembalikan string yang merepresentasikan suara Iguana.
    */
  public String Interact() {
    return "Purrrr";
  }
  /**
    * Render dari Iguana.
    * @return Mengembalikan char yang merupakan representasi kode Iguana.
    */
  public char Render() {
    return 'I';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Iguana baru.
    * @return Mengembalikan objek Iguana baru.
    */
  public Iguana Clone() {
    return new Iguana(this);
  }
}