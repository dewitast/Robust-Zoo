/**
 * File : Cobra.java
 * Kelas Cobra merupakan kelas untuk real object Cobra.
 * @author Sylvia Juliana - 13515070
 */
public class Cobra extends Reptile {
  /**
   * Constructor.
   * Menciptakan objek Cobra.
   */
  public Cobra() {
  	super(20, 1, false);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Cobra dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Cobra.
   * @param f Jumlah makanan Cobra.
   * @param t Status jinak Cobra.
   */
  public Cobra(double w, double f, boolean t) {
  	super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Cobra hasil salinan c.
   * @param c Cobra yang akan disalin.
   */
  public Cobra(Cobra c) {
    super(c.weight, c.food, c.tame);
  }
  /**
   * Jenis makanan yang dimakan Cobra.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Cobra.
   */
  public String getFoodType() {
    return "Carnivore";
  }
  /**
   * Memeriksa apakah Cobra adalah hewan darat.
   * @return Mengembalikan true jika Cobra adalah hewan darat dan false jika Cobra bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return true;
  }
  /**
   * Memeriksa apakah Cobra adalah hewan air.
   * @return Mengembalikan true jika Cobra adalah hewan air dan false jika Cobra bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Cobra adalah hewan udara.
   * @return Mengembalikan true jika Cobra adalah hewan udara dan false jika Cobra bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return false;
  }
  /**
   * Interaksi yang dilakukan Cobra.
   * @return Mengembalikan string yang merepresentasikan suara Cobra.
   */
  public String interact() {
  	return "Ssshh!";
  }
  /**
   * Render dari Cobra.
   * @return Mengembalikan char yang merupakan representasi kode Cobra.
   */
  public char render() {
  	return 'C';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Cobra baru.
   * @return Mengembalikan objek Cobra baru.
   */
  public Cobra clone() {
    return new Cobra(this);
  }
}