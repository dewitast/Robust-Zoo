/** 
 * File : Parrot.java
 * Kelas Parrot merupakan kelas untuk real object Parrot.
 * @author Catherine Almira - 13515111
 */
public class Parrot extends Aves {
  /**
   * Constructor.
   * Menciptakan objek Parrot.
   */
  public Parrot() {
    super(1.2, 0.06, true);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Parrot dengan berat w, jumlah makanan f, dan status jinak t.
   * @param w Berat Parrot.
   * @param f Jumlah makanan Parrot.
   * @param t Status jinak Parrot.
   */
  public Parrot(double w, double f, boolean t) {
    super(w, f, t);
  }
  /**
   * Constructor dengan parameter.
   * Menciptakan objek Parrot hasil salinan p.
   * @param p Parrot yang akan disalin.
   */
  public Parrot(Parrot p) {
    super(p.weight, p.food, p.tame);
  }
  /**
   * Jenis makanan yang dimakan Parrot.
   * @return Mengembalikan string yang merepresentasikan jenis makanan Parrot.
   */
  public String getFoodType() {
    return "Omnivore";
  }
  /**
   * Memeriksa apakah Parrot adalah hewan darat.
   * @return Mengembalikan true jika Parrot adalah hewan darat dan false jika Parrot bukan hewan darat.
   */
  public boolean isLandAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Parrot adalah hewan air.
   * @return Mengembalikan true jika Parrot adalah hewan air dan false jika Parrot bukan hewan air.
   */
  public boolean isWaterAnimal() {
    return false;
  }
  /**
   * Memeriksa apakah Parrot adalah hewan udara.
   * @return Mengembalikan true jika Parrot adalah hewan udara dan false jika Parrot bukan hewan udara.
   */
  public boolean isFlyingAnimal() {
    return true;
  }
  /**
   * Interaksi yang dilakukan Parrot.
   * @return Mengembalikan string yang merepresentasikan suara Parrot.
   */
  public String interact() {
    return "Cuiitt";
  }
  /**
   * Render dari Parrot.
   * @return Mengembalikan char yang merupakan representasi kode Parrot.
   */
  public char render() {
    return 'P';
  }
  /**
   * Melakukan cloning untuk menciptakan objek Parrot baru.
   * @return Mengembalikan objek Parrot baru.
   */
  public Parrot clone() {
    return new Parrot(this);
  }
}