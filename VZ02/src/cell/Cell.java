package cell;

/** 
 * File : Cell.java
 * Kelas Cell merupakan simulasi dari petak-petak yang terdapat dalam kebun binatang.
 * @author Catherine Almira - 13515111
 */
public class Cell {
	  private String object_type;
	  private char render;
	  
	  /**
	    * Constructor.
	    * Menciptakan Cell kosong.
	    */
	  public Cell() {
	    object_type = "Road";
	    render = '+';
	  }
	  /** 
	    * Constructor dengan parameter.
	    * Menciptakan Cell kosong dengan tipe objek ot dan render r.
	    * @param ot Object type dari Cell.
	    */
	  public Cell(String ot) {
	    object_type = ot;
	    if (object_type == "LandHabitat") {
	      render = '@';
	    }
	    else if (object_type == "AirHabitat") {
	      render = '^';
	    }
	    else if (object_type == "WaterHabitat") {
	      render = '~';
	    }
	    else if (object_type == "Restaurant") {
	      render = 'S';
	    }
	    else if (object_type == "Park") {
	      render = '#';
	    }
	    else if (object_type == "Road") {
	      render = '+';
	    }
	    else if (object_type == "Exit") {
	      render = 'X';
	    }
	    else if (object_type == "Entrance") {
	      render = 'Z';
	    }
	  }
	  /**
	    * Getter untuk object type.
	    * @return Mengembalikan object type dari Cell.
	    */
	  public String GetObjectType() {
	    return object_type;
	  }
	  /**
	    * Getter untuk render.
	    * @return Mengembalikan render dari Cell.
	    */
	  public char Render() {
	    return render;
	  }
	  /**
	    * Setter untuk object type dari Cell.
	    * @param ot Nilai object type yang akan di-set pada Cell.
	    */
	  public void SetObjectType(String ot) {
	    object_type = ot;
	    if (object_type == "LandHabitat") {
	      render = '@';
	    }
	    else if (object_type == "AirHabitat") {
	      render = '^';
	    }
	    else if (object_type == "WaterHabitat") {
	      render = '~';
	    }
	    else if (object_type == "Restaurant") {
	      render = 'S';
	    }
	    else if (object_type == "Park") {
	      render = '#';
	    }
	    else if (object_type == "Road") {
	      render = '+';
	    }
	    else if (object_type == "Exit") {
	      render = 'X';
	    }
	    else if (object_type == "Entrance") {
	      render = 'Z';
	    }
	  }
	  /**
	    * Mengecek apakah cell berisi Habitat.
		  * @return Menghasilkan true jika code pada layar merupakan kode Land, Air, atau Water Habitat.
		  */
	  public boolean IsHabitat() {
	    return ((render == '@') || (render == '^') || (render == '~'));
	  }
	  /**
	    * Mengecek apakah cell berisi LandHabitat.
	    * @return Menghasilkan true jika code pada layar merupakan kode Land Habitat.
	    */
	  public boolean IsLandHabitat() {
	    return (render == '@');
	  }
	  /**
	    * Mengecek apakah cell berisi AirHabitat.
	    * @return Menghasilkan true jika code pada layar merupakan kode Air Habitat.
	    */
	  public boolean IsAirHabitat() {
	    return (render == '^');
	  }
	  /**
	    * Mengecek apakah cell berisi WaterHabitat.
	    * @return Menghasilkan true jika code pada layar merupakan kode Water Habitat.
	    */
	  public boolean IsWaterHabitat() {
	    return (render == '~');
	  }
	  /** 
	    * Mengecek apakah cell berisi Exit.
	    * @return Menghasilkan true jika code pada layar merupakan kode Exit.
	    */
	  public boolean IsExit() {
	    return (render == 'X');
	  }
	  /**
	    * Mengecek apakah cell berisi Road.
	    * @return Menghasilkan true jika code pada layar merupakan kode Road.
	    */
	  public boolean IsRoad() {
	    return ((render == '+') || (render == 'X') || (render == 'Z'));
	  }
	  /**
	    * Mengecek apakah cell berisi Entrance.
	    * @return Menghasilkan true jika code pada layar merupakan kode Entrance.
	    */
	  public boolean IsEntrance() {
	    return (render == 'Z');
	  }
}
