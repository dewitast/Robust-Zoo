/**
  * File : Cormorant.java
  * Kelas Cormorant merupakan kelas untuk real object Cormorant.
  * @author Kezia Suhendra - 13515063
  */
public class Cormorant extends Aves {
  /**
    * Constructor.
    * Menciptakan objek Cormorant.
    */
  public Cormorant() {
    super(3.6, 0.18, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Cormorant dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Cormorant.
    * @param k Jumlah makanan Cormorant.
    * @param t Status jinak Cormorant.
  */
  public Cormorant(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Cormorant.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Cormorant.
    */
  public String GetFoodType() {
    return "Carnivore";
  }
  /**
    * Memeriksa apakah Cormorant adalah hewan darat.
    * @return Mengembalikan true jika Cormorant adalah hewan darat dan false jika Cormorant bukan hewan darat.
    */
  public boolean IsLand() {
    return false;
  }
  /**
    * Memeriksa apakah Cormorant adalah hewan air.
    * @return Mengembalikan true jika Cormorant adalah hewan air dan false jika Cormorant bukan hewan air.
    */
  public boolean IsWater() {
    return true;
  }
  /**
    * Memeriksa apakah Cormorant adalah hewan udara.
    * @return Mengembalikan true jika Cormorant adalah hewan udara dan false jika Cormorant bukan hewan udara.
    */
  public boolean IsFlying() {
    return true;
  }
  /**
    * Interaksi yang dilakukan Cormorant.
    * @return Mengembalikan string yang merepresentasikan suara Cormorant.
    */
  public String Interact() {
    return ("Ooookkk!");
  }
  /**
    * Render dari Cormorant.
    * @return Mengembalikan char yang merupakan representasi kode Cormorant.
  */
  public char Render() {
    return 'M';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Cormorant baru.
    * @return Mengembalikan objek Cormorant baru.
    */
  public Cormorant Clone() {
    return new Cormorant(this);
  }
}