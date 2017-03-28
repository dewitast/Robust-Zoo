package cell;

/** 
 * File : Cell.java
 * Kelas Cell merupakan simulasi dari petak-petak yang terdapat dalam kebun binatang.
 * @author Catherine Almira - 13515111
 */

public class Cell {
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

  public Cell(String ot) {
    objectType = ot;
    if (objectType == "LandHabitat") {
      render = '@';
    } else if (objectType == "AirHabitat") {
      render = '^';
    } else if (objectType == "WaterHabitat") {
      render = '~';
    } else if (objectType == "Restaurant") {
      render = 'S';
    } else if (objectType == "Park") {
      render = '#';
    } else if (objectType == "Road") {
      render = '+';
    } else if (objectType == "Exit") {
      render = 'X';
    } else if (objectType == "Entrance") {
      render = 'Z';
    }
  }
  /**
    * Getter untuk object type.
    * @return Mengembalikan object type dari Cell.
    */

  public String getObjectType() {
    return objectType;
  }
  /**
    * Getter untuk render.
    * @return Mengembalikan render dari Cell.
    */

  public char render() {
    return render;
  }
  /**
    * Setter untuk object type dari Cell.
    * @param ot Nilai object type yang akan di-set pada Cell.
    */

  public void setObjectType(String ot) {
    objectType = ot;
    if (objectType == "LandHabitat") {
      render = '@';
    } else if (objectType == "AirHabitat") {
      render = '^';
    } else if (objectType == "WaterHabitat") {
      render = '~';
    } else if (objectType == "Restaurant") {
      render = 'S';
    } else if (objectType == "Park") {
      render = '#';
    } else if (objectType == "Road") {
      render = '+';
    } else if (objectType == "Exit") {
      render = 'X';
    } else if (objectType == "Entrance") {
      render = 'Z';
    }
  }
  /**
    * Mengecek apakah cell berisi Habitat.
    * @return Menghasilkan true jika code pada layar merupakan kode Land, Air, atau Water Habitat.
    */

  public boolean isHabitat() {
    return ((render == '@') || (render == '^') || (render == '~'));
  }
  /**
    * Mengecek apakah cell berisi LandHabitat.
    * @return Menghasilkan true jika code pada layar merupakan kode Land Habitat.
    */

  public boolean isLandHabitat() {
    return (render == '@');
  }
  /**
    * Mengecek apakah cell berisi AirHabitat.
    * @return Menghasilkan true jika code pada layar merupakan kode Air Habitat.
    */

  public boolean isAirHabitat() {
    return (render == '^');
  }
  /**
    * Mengecek apakah cell berisi WaterHabitat.
    * @return Menghasilkan true jika code pada layar merupakan kode Water Habitat.
    */

  public boolean isWaterHabitat() {
    return (render == '~');
  }
  /** 
    * Mengecek apakah cell berisi Exit.
    * @return Menghasilkan true jika code pada layar merupakan kode Exit.
    */

  public boolean isExit() {
    return (render == 'X');
  }
  /**
    * Mengecek apakah cell berisi Road.
    * @return Menghasilkan true jika code pada layar merupakan kode Road.
    */

  public boolean isRoad() {
    return ((render == '+') || (render == 'X') || (render == 'Z'));
  }
  /**
    * Mengecek apakah cell berisi Entrance.
    * @return Menghasilkan true jika code pada layar merupakan kode Entrance.
    */

  public boolean isEntrance() {
    return (render == 'Z');
  }
}
