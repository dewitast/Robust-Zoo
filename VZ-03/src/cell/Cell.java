package cell;

import renderable.Renderable;

/**
 * File : Cell.java
 * Kelas abstrak Cell merupakan simulasi dari petak-petak yang terdapat dalam kebun binatang.
 * @author Catherine Almira - 13515111
 */

public abstract class Cell implements Renderable {
  /**
   * Constructor.
   */

  public Cell() {
  }
  /**
   * Mengecek apakah Cell pada Zoo merupakan Habitat.
   * @return Menghasilkan true jika kode pada layar merupakan kode Land, Air, atau Water Habitat.
   */

  public abstract boolean isHabitat();
  /**
   * Constructor dengan parameter.
   * @param c Cell yang akan disalin.
   */
  
  public Cell(Cell c) {
  }
}