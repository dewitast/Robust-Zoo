/**
  * File : Air_Habitat.java
  * Kelas Air_Habitat merupakan simulasi dari habitat udara.
  * @author Sylvia Juliana - 13515070
  */
public class Air_Habitat extends Cell {
  /**
    * Render dari Air_Habitat.
    * @return Mengembalikan char yang merupakan representasi kode Air_Habitat.
    */
  public char Render() {
  	return '^';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Air_Habitat baru.
    * @return Mengembalikan Air_Habitat.
    */
  public Air_Habitat Clone() {
    return new Air_Habitat(this);
  }
}