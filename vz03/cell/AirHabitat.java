/**
 * File : AirHabitat.java
 * Kelas AirHabitat merupakan simulasi dari habitat udara.
 * @author Sylvia Juliana - 13515070
 */
public class AirHabitat extends Cell {
  /**
   * Render dari AirHabitat.
   * @return Mengembalikan char yang merupakan representasi kode AirHabitat.
   */
  public char Render() {
  	return '^';
  }
  /**
   * Melakukan cloning untuk menciptakan objek AirHabitat baru.
   * @return Mengembalikan AirHabitat.
   */
  public AirHabitat clone() {
    return new AirHabitat(this);
  }
}