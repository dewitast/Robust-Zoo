/**
  * File : Park.java
  * Kelas Park merepresentasikan taman.
  * @author Sylvia Juliana - 13515070
  */
public class Park extends Cell {
  /**
    * Render dari Park.
    * @return Mengembalikan char yang merupakan representasi kode Park.
    */
  public char Render() {
  	return '#';
  }
  /**
    * Melakukan cloning untuk menciptakan objek Park baru.
    * @return Mengembalikan Park.
    */
  public Park Clone() {
    return new Park(this);
  }
}