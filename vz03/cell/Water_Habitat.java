/**
  * File : Water_Habitat.java
  * Kelas Water_Habitat merupakan simulasi dari habitat air.
  * @author Sylvia Juliana - 13515070
  */
public class Water_Habitat extends Cell {
  /**
    * Render dari Water_Habitat.
    * @return Mengembalikan char yang merupakan representasi kode Water_Habitat.
    */
  public char Render() {
  	return '~';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Water_Habitat baru.
    * @return Mengembalikan Water_Habitat.
    */
  public Water_Habitat Clone() {
    return new Water_Habitat(this);
  }
}