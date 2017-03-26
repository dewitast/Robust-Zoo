/**
  * File : Tiger.java
  * Kelas Tiger merupakan kelas untuk real object Tiger.
  * @author Catherine Almira - 13515111
  */
public class Tiger extends Animal {
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
  public Tiger(float w, float f, boolean t) {
    super(w, f, t);
  }
  /**
    * Interaksi yang dilakukan Tiger.
    * @return Mengembalikan string yang merepresentasikan suara Tiger.
    */
  public string Interact() {
    return "Growl";
  }
  /**
    * Render dari Tiger.
    * @return Mengembalikan char yang merupakan representasi kode Tiger.
    */
  public char Render() {
    return 'T';
  }
}