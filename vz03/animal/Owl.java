/**
  * File : Owl.java
  * Kelas Owl merupakan kelas untuk real object Owl.
  * @author Sylvia Juliana - 13515070
  */
public class Owl extends Aves {
  /**
    * Constructor.
    * Menciptakan objek Owl.
    */
  public Owl() {
  	super(1.5, 0.075, true);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Owl dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Owl.
    * @param f Jumlah makanan Owl.
    * @param t Status jinak Owl.
    */
  public Owl(double w, double f, boolean t) {
  	super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Owl.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Owl.
    */
  public String GetFoodType() {
    return "Carnivore";
  }
  /**
    * Memeriksa apakah Owl adalah hewan darat.
    * @return Mengembalikan true jika Owl adalah hewan darat dan false jika Owl bukan hewan darat.
    */
  public boolean IsLand() {
    return false;
  }
  /**
    * Memeriksa apakah Owl adalah hewan air.
    * @return Mengembalikan true jika Owl adalah hewan air dan false jika Owl bukan hewan air.
    */
  public boolean IsWater() {
    return false;
  }
  /**
    * Memeriksa apakah Owl adalah hewan udara.
    * @return Mengembalikan true jika Owl adalah hewan udara dan false jika Owl bukan hewan udara.
    */
  public boolean IsFlying() {
    return true;
  }
  /**
    * Interaksi yang dilakukan Owl.
    * @return Mengembalikan string yang merepresentasikan suara Owl.
    */
  public String Interact() {
  	return "Hoot!";
  }
  /**
    * Render dari Owl.
    * @return Mengembalikan char yang merupakan representasi kode Owl.
    */
  public char Render() {
  	return 'O';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Owl baru.
    * @return Mengembalikan objek Owl baru.
    */
  public Owl Clone() {
    return new Owl(this);
  }
}