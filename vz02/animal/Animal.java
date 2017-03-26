package animal;

/**
  * File : Animal.java 
  * Kelas animal merepresentasikan binatang beserta perilakunya.
  * @author Catherine Almira - 13515111
  */
public class Animal() {
  private Point position;
  private String species;
  private String sound;
  private String food_type;
  private String[] habitat;
  private double weight;
  private double food_meat;
  private double food_veggie;
  private int number_habitat;
  private boolean tame;
  private char render;

  /**
    * Constructor.
    * Menciptakan animal kosong.
    */
  public Animal() {
    position.SetAbsis(-1);
    position.SetOrdinat(-1);
    species = "Dugong";
    sound = "Splashh!";
    food_type = "Herbivore";
    number_habitat = 1;
    tame = true;
    render = 'U';
    weight = 500;
    food_meat = 0;
    food_veggie = 25;
    habitat = new String[number_habitat];
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
    food_type = jenis_makanan;
    number_habitat = jumlah_habitat;
    habitat = new String[number_habitat];
    for (int i = 0; i < number_habitat; i++) {
      habitat[i] = tempat_hidup[i];
    }
    weight = berat;
    food_meat = daging;
    food_veggie = sayur;
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
    food_type = a.food_type;
    number_habitat = a.number_habitat;
    habitat = new String[number_habitat];
    for (int i = 0; i < number_habitat; i++) {
      habitat[i] = a.habitat[i];
    }
    weight = a.weight;
    food_meat = a.food_meat;
    food_veggie = a.food_veggie;
    tame = a.tame;
    render = a.render;
  }
  /**
    * Mengecek apakah binatang merupakan karnivor.
    * @return true jika binatang adalah karnivor.
    */
  public boolean IsCarnivore() {
    return (food_type=="Carnivore");
  }
  /**
    * Mengecek apakah binatang merupakan omnivor.
    * @return true jika binatang adalah omnivor.
    */
  public boolean IsOmnivore() {
    return (food_type=="Omnivore");
  }
  /**
    * Mengecek apakah binatang merupakan herbivor.
    * @return true jika binatang adalah herbivor.
    */
  public boolean IsHerbivore() {
    return (food_type=="Herbivore");
  }
  /**
    * Mengeluarkan point yang merupakan posisi binatang.
    * @return posisi binatang.
    */
  public Point GetPos() {
    return position;
  }
  /**
    * Mengeluarkan string yang merupakan nama spesies binatang.
    * @return String yang merupakan nama spesies binatang.
    */
  public String GetSpecies() {
    return species;
  }
  /**
    * Mengeluarkan string yang merupakan bentuk interaksi dari binatang.
    * @return String yang merupakan suara binatang.
    */
  public String Interact() {
    return sound;
  }
  /**
    * Mengembalikan jenis makanan binatang.
    * @return jenis makanan binatang.
    */
  public String GetFoodType() {
    return food_type;
  }
  /**
    * Mengembalikan jinak tidaknya binatang.
    * @return jinak tidaknya binatang.
    */
  public String[] GetHabitat() {
    return habitat;
  }
  /**
    * Mengembalikan nilai berat binatang.
    * @return nilai berat binatang.
    */
  public double GetWeight() {
    return weight;
  }
  /**
    * Mengembalikan nilai jumlah makanan (daging) binatang.
    * @return nilai jumlah makanan (daging) binatang.
    */
  public double GetFoodMeat() {
    if (IsCarnivore() || IsOmnivore())
      return (weight * 0.05);
    else
      return 0;
  }
  /**
    * Mengembalikan nilai jumlah makanan (sayur) binatang.
    * @return nilai jumlah makanan (sayur) binatang.
    */
  public double GetFoodVeggie() {
    if (IsHerbivore() || IsOmnivore())
      return (weight * 0.05);
    else
      return 0;
  }
  /**
    * Mengembalikan nilai jumlah habitat yang dapat ditinggali.
    * @return nilai jumlah habitat yang dapat ditinggali.
    */
  public int GetNumberOfHabitat() {
    return number_habitat;
  }
  /**
    * Mengembalikan jinak tidaknya binatang.
    * @return jinak tidaknya binatang.
    */
  public boolean GetTame() {
    return tame;
  }
  /**
    * Mengembalikan karakter yang akan dicetak.
    * @return karakter yang akan dicetak.
    */
  public char Render() {
    return render;
  }
  /**
    * I.S. Point sembarang
    * F.S. Point bernilai absis, ordinat.
    * @param absis Absis point.
    * @param ordinat Ordinat point.
    */
  public void SetPoint(int absis, int ordinat) {
    position.SetAbsis(absis);
    position.SetOrdinat(ordinat);
  }
  /**
    * I.S. Point sembarang
    * F.S. Point bernilai sama dengan p.
    * @param p Point yang akan disalin.
    */
  public void SetPoint(Point p) {
    position = p;
  }
}