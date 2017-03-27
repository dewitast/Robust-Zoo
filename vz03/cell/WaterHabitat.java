/**
  * File : WaterHabitat.java
  * Kelas WaterHabitat merupakan simulasi dari habitat air.
  * @author Sylvia Juliana - 13515070
  */
public class WaterHabitat extends Cell {
  /**
    * Render dari WaterHabitat.
    * @return Mengembalikan char yang merupakan representasi kode WaterHabitat.
    */
  public char Render() {
  	return '~';
  }
  /**
    * Melakukan cloning untuk menciptakan objek WaterHabitat baru.
    * @return Mengembalikan WaterHabitat.
    */
  public WaterHabitat Clone() {
    return new WaterHabitat(this);
  }
}