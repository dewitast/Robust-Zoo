/**
  * File : Orca.java
  * Kelas Orca merupakan kelas untuk real object Orca.
  * @author Sylvia Juliana - 13515070
  */
public class Orca extends Mammal {
  /**
    * Constructor.
    * Menciptakan objek Orca.
    */
  public Orca() {
  	super(4000, 200, false);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Orca dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Orca.
    * @param f Jumlah makanan Orca.
    * @param t Status jinak Orca.
    */
  public Orca(double w, double f, boolean t) {
  	super(w, f, t);
  }
  /**
    * Jenis makanan yang dimakan Orca.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Orca.
    */
  public String GetFoodType() {
    return "Carnivore";
  }
  /**
    * Memeriksa apakah Orca adalah hewan darat.
    * @return Mengembalikan true jika Orca adalah hewan darat dan false jika Orca bukan hewan darat.
    */
  public boolean IsLand() {
    return false;
  }
  /**
    * Memeriksa apakah Orca adalah hewan air.
    * @return Mengembalikan true jika Orca adalah hewan air dan false jika Orca bukan hewan air.
    */
  public boolean IsWater() {
    return true;
  }
  /**
    * Memeriksa apakah Orca adalah hewan udara.
    * @return Mengembalikan true jika Orca adalah hewan udara dan false jika Orca bukan hewan udara.
    */
  public boolean IsFlying() {
    return false;
  }
  /**
    * Interaksi yang dilakukan Orca.
    * @return Mengembalikan string yang merepresentasikan suara Orca.
    */
  public String Interact() {
  	return "Ngiak!";
  }
  /**
    * Render dari Orca.
    * @return Mengembalikan char yang merupakan representasi kode Orca.
    */
  public char Render() {
  	return 'R';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Orca baru.
    * @return Mengembalikan objek Orca baru.
    */
  public Orca Clone() {
    return new Orca(this);
  }
}