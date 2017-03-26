package animal;
import point.*;

/** 
  * File : Animal.java
  * Kelas animal merepresentasikan binatang beserta perilakunya.
  * @author Dewita Sonya Tarabunga - 13515021
  */
public abstract class Animal {
  protected float weight;
  protected float food;
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
    * @param abs nilai absis dari lokasi binatang.
    * @param ord nilai ordinat dari lokasi binatang.
    */
  public Animal(int w, int f, boolean t, int abs, int ord) {
    weight = w;
    food = f;
    tame = t;
    pos = new Point(abs, ord);
  }
  /**
    * Mengembalikan nilai berat binatang.
    * @return nilai berat binatang.
    */
  public float GetWeight() {
    return weight;
  }
  /**
    * Mengembalikan nilai jumlah makanan binatang.
    * @return nilai jumlah makanan binatang.
    */
  public float GetFood() {
    return food;
  }
  /**
    * Mengembalikan jinak tidaknya binatang.
    * @return jinak tidaknya binatang.
    */
  public boolean GetTame() {
    return tame;
  }
  /**
    * Mengembalikan point posisi binatang.
    * @return point posisi binatang.
    */
  public Point GetPos() {
    return pos;
  }
  /**
    * Mengubah nilai berat binatang.
    * @param w nilai berat yang akan dimasukkan.
    */
  public void SetWeight(float w) {
    weight = w;
  }
  /**
    * Mengubah nilai jumlah makanan binatang.
    * @param f nilai jumlah makanan yang akan dimasukkan.
    */
  public void SetFood(float f) {
    food = f;
  }
  /**
    * Mengubah kejinakan binatang.
    * @param t kejinakan yang akan dimasukkan.
    */
  public void SetTame(boolean t) {
    tame = t;
  }
  /**
    * Mengubah lokasi binatang.
    * @param p lokasi yang akan dimasukkan.
    */
  public void SetPoint(Point p) {
    pos.SetAbsis(p.GetAbsis());
    pos.SetOrdinat(p.GetOrdinat());
  }
  /**
    * Mengubah lokasi binatang.
    * @param abs nilai absis lokasi yang akan dimasukkan.
    * @param ord nilai ordinat lokasi yang akan dimasukkan.
    */
  public void SetPoint(int abs, int ord) {
    pos.SetAbsis(abs);
    pos.SetOrdinat(ord);
  }
  /** 
    * Mengeluarkan string yang merupakan bentuk interaksi dari binatang.
    * @return String yang merupakan suara binatang.
    */
  public abstract String Interact();
}