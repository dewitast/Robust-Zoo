package animal;
import point.*;

/**
 * File : Animal.java
 * Kelas animal merepresentasikan binatang beserta perilakunya.
 * @author Dewita Sonya Tarabunga - 13515021
 */
public abstract class Animal {
  protected double weight;
  protected double food;
  protected boolean tame;
  protected Point pos;
  /**
   * Constructor tanpa parameter.
   */
  public Animal() {
    weight = 0;
    food = 0;
    tame = false;
    pos = new Point();
  }
  /**
   * Constructor dengan parameter.
   * @param w nilai berat binatang.
   * @param f nilai jumlah makanan binatang.
   * @param t jinak atau tidaknya binatang.
   */
  public Animal(double w, double f, boolean t) {
    weight = w;
    food = f;
    tame = t;
    pos = new Point(-1, -1);
  }
  /**
   * Mengembalikan nilai berat binatang.
   * @return nilai berat binatang.
   */
  public double getWeight() {
    return weight;
  }
  /**
   * Mengembalikan nilai jumlah makanan binatang.
   * @return nilai jumlah makanan binatang.
   */
  public double getFood() {
    return food;
  }
  /**
   * Mengembalikan nilai jumlah makanan (daging) binatang.
   * @return nilai jumlah makanan (daging) binatang.
   */
  public double getFoodMeat() {
    if (this.getFoodType() == "Carnivore" || this.getFoodType == "Omnivore")
      return (weight * 0.05);
    else
      return 0;
  }
  /**
   * Mengembalikan nilai jumlah makanan (sayur) binatang.
   * @return nilai jumlah makanan (sayur) binatang.
   */
  public double getFoodVeggie() {
    if (this.getFoodType == "Herbivore" || this.getFoodType() == "Omnivore")
      return (weight * 0.05);
    else
      return 0;
  }
  /**
   * Mengembalikan jinak tidaknya binatang.
   * @return jinak tidaknya binatang.
   */
  public boolean getTame() {
    return tame;
  }
  /**
   * Mengembalikan point posisi binatang.
   * @return point posisi binatang.
   */
  public Point getPos() {
    return pos;
  }
  /**
   * I.S. Berat binatang sembarang dan w terdefinisi.
   * F.S. Berat binatang bernilai w.
   * @param w nilai berat yang akan dimasukkan.
   */
  public void setWeight(double w) {
    weight = w;
  }
  /**
   * I.S. Jumlah makanan binatang sembarang dan f terdefinisi.
   * F.S. Jumlah makanan binatang bernilai f.
   * @param f nilai jumlah makanan yang akan dimasukkan.
   */
  public void setFood(double f) {
    food = f;
  }
  /**
   * I.S. Status jinak binatang sembarang dan t terdefinisi.
   * F.S. Status jinak binatang bernilai t.
   * @param t kejinakan yang akan dimasukkan.
   */
  public void setTame(boolean t) {
    tame = t;
  }
  /**
   * I.S. Lokasi binatang sembarang dan p terdefinisi.
   * F.S. Lokasi binatang bernilai p.
   * @param p lokasi yang akan dimasukkan.
   */
  public void setPoint(Point p) {
    pos.setAbsis(p.getAbsis());
    pos.setOrdinat(p.getOrdinat());
  }
  /**
   * I.S. Lokasi binatang sembarang dan abs serta ord terdefinisi.
   * F.S. Lokasi binatang bernilai abs, ord.
   * @param abs nilai absis lokasi yang akan dimasukkan.
   * @param ord nilai ordinat lokasi yang akan dimasukkan.
   */
  public void setPoint(int abs, int ord) {
    pos.setAbsis(abs);
    pos.setOrdinat(ord);
  }
  /**
   * Mengeluarkan string yang merupakan bentuk interaksi dari binatang.
   * @return String yang merupakan suara binatang.
   */
  public abstract String interact();
}