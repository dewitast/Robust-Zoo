package cell.landhabitat;

import cell.Cell;

/**
 * File : LandHabitat.java
 * Kelas LandHabitat merupakan simulasi dari habitat darat.
 * @author Sylvia Juliana - 13515070
 */
public class LandHabitat extends Cell {
  /**
   * Mengecek apakah cell berisi habitat
   * @return Mengembalikan true apabila cell adalah habitat.
   */

  public boolean isHabitat() {
    return true;
  }
  /**
   * Render dari LandHabitat.
   * @return Mengembalikan char yang merupakan representasi kode LandHabitat.
   */
  
  public char render() {
    return '@';
  }
}