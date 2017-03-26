/** File : Cell.java */
/** Penanggung jawab : Catherine Almira - 13515111
  */

package cell;
/** Kelas abstrak Cell merupakan simulasi dari petak-petak yang terdapat dalam kebun binatang.
  */
public abstract class Cell implements Renderable {
  /** Mengecek apakah Cell pada Zoo merupakan Habitat.
    * @return Menghasilkan true jika kode pada layar merupakan kode Land, Air, atau Water Habitat.
    */
  boolean IsHabitat() {
    return (this instanceof LandHabitat || this instanceof WaterHabitat || this instanceof AirHabitat);
  }
};