/** 
  * File : Cell.java
  * Kelas Cell merupakan simulasi dari petak-petak yang terdapat dalam kebun binatang.
  * @author Catherine Almira - 13515111
  */
package cell;
class Cell {
  private String objectType;
  private char render;
  /**
    * Constructor.
    * Menciptakan Cell kosong.
    */
  public Cell() {
    objectType = "Road";
    render = '+';
  }
  /** 
    * Constructor dengan parameter.
    * Menciptakan Cell kosong dengan tipe objek ot dan render r.
    * @param ot Object type dari Cell.
    */
  Cell(String ot) {
    objectType = ot;
    if (objectType == "LandHabitat")
      render = '@';
    else if (objectType == "AirHabitat")
      render = '^';
    else if (objectType == "WaterHabitat")
      render = '~';
    else if (objectType == "Restaurant")
      render = 'S';
    else if (objectType == "Park")
      render = '#';
    else if (objectType == "Road")
      render = '+';
    else if (objectType == "Exit")
      render = 'X';
    else if (objectType == "Entrance")
      render = 'Z';
  }
  /**
    * Getter untuk object type.
    * @return Mengembalikan object type dari Cell.
    */
  String getObjectType() {
    return objectType;
  }
  /**
    * Getter untuk render.
    * @return Mengembalikan render dari Cell.
    */
  char getRender() {
    return render;
  }
  /**
    * Setter untuk object type dari Cell.
    * @param ot Nilai object type yang akan di-set pada Cell.
    */
  void setObjectType(String ot) {
    objectType = ot;
    if (objectType == "LandHabitat")
      render = '@';
    else if (objectType == "AirHabitat")
      render = '^';
    else if (objectType == "WaterHabitat")
      render = '~';
    else if (objectType == "Restaurant")
      render = 'S';
    else if (objectType == "Park")
      render = '#';
    else if (objectType == "Road")
      render = '+';
    else if (objectType == "Exit")
      render = 'X';
    else if (objectType == "Entrance")
      render = 'Z';
  }
  /**
    * Mengecek apakah cell berisi Habitat.
	  * @return Menghasilkan true jika code pada layar merupakan kode Land, Air, atau Water Habitat.
	  */
  boolean isHabitat() {
    return ((render == '@') || (render == '^') || (render == '~'));
  }
  /**
    * Mengecek apakah cell berisi LandHabitat.
    * @return Menghasilkan true jika code pada layar merupakan kode Land Habitat.
    */
  boolean isLandHabitat() {
    return (render == '@');
  }
  /**
    * Mengecek apakah cell berisi AirHabitat.
    * @return Menghasilkan true jika code pada layar merupakan kode Air Habitat.
    */
  boolean isAirHabitat() {
    return (render == '^');
  }
  /**
    * Mengecek apakah cell berisi WaterHabitat.
    * @return Menghasilkan true jika code pada layar merupakan kode Water Habitat.
    */
  boolean isWaterHabitat() {
    return (render == '~');
  }
  /** 
    * Mengecek apakah cell berisi Exit.
    * @return Menghasilkan true jika code pada layar merupakan kode Exit.
    */
  boolean isExit() {
    return (render == 'X');
  }
  /**
    * Mengecek apakah cell berisi Road.
    * @return Menghasilkan true jika code pada layar merupakan kode Road.
    */
  boolean isRoad() {
    return ((render == '+') || (render == 'X') || (render == 'Z'));
  }
  /**
    * Mengecek apakah cell berisi Entrance.
    * @return Menghasilkan true jika code pada layar merupakan kode Entrance.
    */
  boolean isEntrance() {
    return (render == 'Z');
  }
}