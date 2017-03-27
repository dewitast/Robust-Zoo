package animal;
import point.*;

/**
 * File : Animal.java 
 * Kelas animal merepresentasikan binatang beserta perilakunya.
 * @author Catherine Almira - 13515111
 */
public class Animal {
	  private Point position;
	  private String species;
	  private String sound;
	  private String foodType;
	  private String[] habitat;
	  private double weight;
	  private double foodMeat;
	  private double foodVeggie;
	  private int numberHabitat;
	  private boolean tame;
	  private char render;

	  /**
	    * Constructor.
	    * Menciptakan animal kosong.
	    */
	  public Animal() {
	    position = new Point(-1,-1);
	    species = "Dugong";
	    sound = "Splashh!";
	    foodType = "Herbivore";
	    numberHabitat = 1;
	    tame = true;
	    render = 'U';
	    weight = 500;
	    foodMeat = 0;
	    foodVeggie = 25;
	    habitat = new String[numberHabitat];
	    habitat[0] = "Water";
	  }
	  /**
	    * Constructor dengan parameter.
	    * Menciptakan animal sesuai dengan parameter yang diberikan.
	    * @param posisi Letak Animal dalam  Zoo.
	    * @param spesies Nama spesies Animal.
	    * @param suara Suara yang dihasilkan Animal.
	    * @param jenis_makanan Carnivore, Omnivore, atau Herbivore.
	    * @param tempat_hidup Hanitat Animal.
	    * @param berat Berat Animal.
	    * @param daging Jumlah makanan (daging) yang dimakan Animal.
	    * @param sayur Jumlah makanan (sayur) yang dimakan Animal.
	    * @param jumlah_habitat Jumlah habitat yang dapat ditinggali oleh Animal
	    * @param jinak Menyatakan jinak atau buasnya Animal.
	    * @param cetak Karakter yang merepresentasikan Animal.
	    */
	  public Animal(Point posisi,
	                String spesies,
	                String suara,
	                String jenis_makanan,
	                String[] tempat_hidup,
	                double berat,
	                double daging,
	                double sayur,
	                int jumlah_habitat,
	                boolean jinak,
	                char cetak) {
	    position = posisi;
	    species = spesies;
	    sound = suara;
	    foodType = jenis_makanan;
	    numberHabitat = jumlah_habitat;
	    habitat = new String[numberHabitat];
	    for (int i = 0; i < numberHabitat; i++) {
	      habitat[i] = tempat_hidup[i];
	    }
	    weight = berat;
	    foodMeat = daging;
	    foodVeggie = sayur;
	    tame = jinak;
	    render = cetak;
	  }
	  /**
	    * Constructor dengan parameter.
	    * Menciptakan animal sesuai dengan parameter yang diberikan.
	    * @param a Animal yang akan disalin.
	    */
	  public Animal(Animal a) {
	    position = a.position;
	    species = a.species;
	    sound = a.sound;
	    foodType = a.foodType;
	    numberHabitat = a.numberHabitat;
	    habitat = new String[numberHabitat];
	    for (int i = 0; i < numberHabitat; i++) {
	      habitat[i] = a.habitat[i];
	    }
	    weight = a.weight;
	    foodMeat = a.foodMeat;
	    foodVeggie = a.foodVeggie;
	    tame = a.tame;
	    render = a.render;
	  }
	  /**
	    * Mengecek apakah binatang merupakan karnivor.
	    * @return true jika binatang adalah karnivor.
	    */
	  public boolean isCarnivore() {
	    return (foodType=="Carnivore");
	  }
	  /**
	    * Mengecek apakah binatang merupakan omnivor.
	    * @return true jika binatang adalah omnivor.
	    */
	  public boolean isOmnivore() {
	    return (foodType=="Omnivore");
	  }
	  /**
	    * Mengecek apakah binatang merupakan herbivor.
	    * @return true jika binatang adalah herbivor.
	    */
	  public boolean isHerbivore() {
	    return (foodType=="Herbivore");
	  }
	  /**
	    * Mengeluarkan point yang merupakan posisi binatang.
	    * @return posisi binatang.
	    */
	  public Point getPos() {
	    return position;
	  }
	  /**
	    * Mengeluarkan string yang merupakan nama spesies binatang.
	    * @return String yang merupakan nama spesies binatang.
	    */
	  public String getSpecies() {
	    return species;
	  }
	  /**
	    * Mengeluarkan string yang merupakan bentuk interaksi dari binatang.
	    * @return String yang merupakan suara binatang.
	    */
	  public String interact() {
	    return sound;
	  }
	  /**
	    * Mengembalikan jenis makanan binatang.
	    * @return jenis makanan binatang.
	    */
	  public String getFoodType() {
	    return foodType;
	  }
	  /**
	    * Mengembalikan jinak tidaknya binatang.
	    * @return jinak tidaknya binatang.
	    */
	  public String[] getHabitat() {
	    return habitat;
	  }
	  /**
	    * Mengembalikan nilai berat binatang.
	    * @return nilai berat binatang.
	    */
	  public double getWeight() {
	    return weight;
	  }
	  /**
	    * Mengembalikan nilai jumlah makanan (daging) binatang.
	    * @return nilai jumlah makanan (daging) binatang.
	    */
	  public double getFoodMeat() {
	    if (isCarnivore() || isOmnivore())
	      return (weight * 0.05);
	    else
	      return 0;
	  }
	  /**
	    * Mengembalikan nilai jumlah makanan (sayur) binatang.
	    * @return nilai jumlah makanan (sayur) binatang.
	    */
	  public double getFoodVeggie() {
	    if (isHerbivore() || isOmnivore())
	      return (weight * 0.05);
	    else
	      return 0;
	  }
	  /**
	    * Mengembalikan nilai jumlah habitat yang dapat ditinggali.
	    * @return nilai jumlah habitat yang dapat ditinggali.
	    */
	  public int getNumberOfHabitat() {
	    return numberHabitat;
	  }
	  /**
	    * Mengembalikan jinak tidaknya binatang.
	    * @return jinak tidaknya binatang.
	    */
	  public boolean getTame() {
	    return tame;
	  }
	  /**
	    * Mengembalikan karakter yang akan dicetak.
	    * @return karakter yang akan dicetak.
	    */
	  public char render() {
	    return render;
	  }
	  /**
	    * I.S. Point sembarang
	    * F.S. Point bernilai absis, ordinat.
	    * @param absis Absis point.
	    * @param ordinat Ordinat point.
	    */
	  public void setPoint(int absis, int ordinat) {
	    position.setAbsis(absis);
	    position.setOrdinat(ordinat);
	  }
	  /**
	    * I.S. Point sembarang
	    * F.S. Point bernilai sama dengan p.
	    * @param p Point yang akan disalin.
	    */
	  public void setPoint(Point p) {
	    position = p;
	  }
	  /**
	    * Memeriksa apakah Objek animal a dan this sama.
	    * @param a Objek animal yang akan diperiksa.
	    * @return True jika p sama dengan this.
	    */
	  public boolean isSame(Animal a) {
	    return (position.isSame(a.position));
	  }
}
