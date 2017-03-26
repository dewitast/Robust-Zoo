/**
  * File : Entrance.java
  * Kelas Entrance merepresentasikan pintu masuk.
  * @author Sylvia Juliana - 13515070
  */
public class Entrance extends Road {
  /**
    * Render dari Entrance.
    * @return Mengembalikan char yang merupakan representasi kode Entrance.
    */
  public char Render() {
  	return 'Z';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Entrance baru.
    * @return Mengembalikan Entrance.
    */
  public Entrance Clone() {
    return new Entrance(this);
  }
}