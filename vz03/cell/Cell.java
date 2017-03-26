package cell;

/**
  * File : Cell.java
  * Kelas abstrak Cell merupakan simulasi dari petak-petak yang terdapat dalam kebun binatang.
  * @author Catherine Almira - 13515111
  */
public abstract class Cell implements Renderable {
  /**
    * Mengecek apakah Cell pada Zoo merupakan Habitat.
    * @return Menghasilkan true jika kode pada layar merupakan kode Land, Air, atau Water Habitat.
    */
  public boolean IsHabitat() {
    return (this instanceof Land_Habitat || this instanceof Water_Habitat || this instanceof Air_Habitat);
  }
}