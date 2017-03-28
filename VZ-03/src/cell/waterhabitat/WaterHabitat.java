package cell.waterhabitat;

import cell.Cell;

/**
 * File : WaterHabitat.java
 * Kelas WaterHabitat merupakan simulasi dari habitat air.
 * @author Sylvia Juliana - 13515070
 */

public class WaterHabitat extends Cell {
  /**
   * Mengecek apakah cell berisi habitat
   * @return Mengembalikan true apabila cell adalah habitat.
   */

  public boolean isHabitat() {
    return true;
  }
  /**
   * Render dari WaterHabitat.
   * @return Mengembalikan char yang merupakan representasi kode WaterHabitat.
   */
  
  public char render() {
  	return '~';
  }
}