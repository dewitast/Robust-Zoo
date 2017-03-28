package cell.airhabitat;

import cell.Cell;

/**
 * File : AirHabitat.java
 * Kelas AirHabitat merupakan simulasi dari habitat udara.
 * @author Sylvia Juliana - 13515070
 */

public class AirHabitat extends Cell {
  /**
   * Mengecek apakah cell berisi habitat
   * @return Mengembalikan true apabila cell adalah habitat.
   */

  public boolean isHabitat() {
    return true;
  }
  /**
   * Render dari AirHabitat.
   * @return Mengembalikan char yang merupakan representasi kode AirHabitat.
   */
  
  public char render() {
    return '^';
  }
}