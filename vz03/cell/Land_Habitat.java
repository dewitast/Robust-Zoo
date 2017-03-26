/**
  * File : Land_Habitat.java
  * Kelas Land_Habitat merupakan simulasi dari habitat darat.
  * @author Sylvia Juliana - 13515070
  */
public class Land_Habitat extends Cell {
  /**
    * Render dari Land_Habitat.
    * @return Mengembalikan char yang merupakan representasi kode Land_Habitat.
    */
  public char Render() {
  	return '@';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Land_Habitat baru.
    * @return Mengembalikan Land_Habitat.
    */
  public Land_Habitat Clone() {
    return new Land_Habitat(this);
  }
}