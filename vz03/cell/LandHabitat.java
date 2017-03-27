/**
  * File : LandHabitat.java
  * Kelas LandHabitat merupakan simulasi dari habitat darat.
  * @author Sylvia Juliana - 13515070
  */
public class LandHabitat extends Cell {
  /**
    * Render dari LandHabitat.
    * @return Mengembalikan char yang merupakan representasi kode LandHabitat.
    */
  public char Render() {
  	return '@';
  }
  /**
    * Melakukan cloning untuk menciptakan objek LandHabitat baru.
    * @return Mengembalikan LandHabitat.
    */
  public LandHabitat Clone() {
    return new LandHabitat(this);
  }
}