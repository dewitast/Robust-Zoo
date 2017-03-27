/**
  * File : Tiger.java
  * Kelas Tiger merupakan kelas untuk real object Tiger.
  * @author Catherine Almira - 13515111
  */
public class Tiger extends Mammal {
  /**
    * Constructor.
    * Menciptakan objek Tiger.
    */
  public Tiger() {
    super(200, 10, false);
  }
  /**
    * Constructor dengan parameter.
    * Menciptakan objek Tiger dengan berat w, jumlah makanan f, dan status jinak t.
    * @param w Berat Tiger.
    * @param f Jumlah makanan Tiger.
    * @param t Status jinak Tiger.
    */
  public Tiger(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Tiger hasil salinan t.
   * @param t Tiger yang akan disalin.
   */
  public Tiger(Tiger t) {
    super(t.weight, t.food, t.tame);
  }
  /**
    * Jenis makanan yang dimakan Tiger.
    * @return Mengembalikan string yang merepresentasikan jenis makanan Tiger.
    */
  public String GetFoodType() {
    return "Carnivore";
  }
  /**
    * Memeriksa apakah Tiger adalah hewan darat.
    * @return Mengembalikan true jika Tiger adalah hewan darat dan false jika Tiger bukan hewan darat.
    */
  public boolean IsLand() {
    return true;
  }
  /**
    * Memeriksa apakah Tiger adalah hewan air.
    * @return Mengembalikan true jika Tiger adalah hewan air dan false jika Tiger bukan hewan air.
    */
  public boolean IsWater() {
    return false;
  }
  /**
    * Memeriksa apakah Tiger adalah hewan udara.
    * @return Mengembalikan true jika Tiger adalah hewan udara dan false jika Tiger bukan hewan udara.
    */
  public boolean IsFlying() {
    return false;
  }
  /**
    * Interaksi yang dilakukan Tiger.
    * @return Mengembalikan string yang merepresentasikan suara Tiger.
    */
  public String Interact() {
    return "Growl";
  }
  /**
    * Render dari Tiger.
    * @return Mengembalikan char yang merupakan representasi kode Tiger.
    */
  public char Render() {
    return 'T';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Tiger baru.
    * @return Mengembalikan objek Tiger baru.
    */
  public Tiger Clone() {
    return new Tiger(this);
  }
}