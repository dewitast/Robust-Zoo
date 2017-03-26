/** File : Animal.java */
/** Penanggung jawab : Catherine Almira - 13515111
  */

public class Animal() {
  private Point position;
  private String species;
  private String sound;
  private String food_type;
  private String[] habitat;
  private float weight;
  private float food_meat;
  private float food_veggie;
  private int number_habitat;
  private boolean tame;
  private char render;

  //constructor
  //menciptakan animal kosong
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
  //constructor dengan parameter
  public Animal(Point posisi,
  	            String spesies,
  	            String suara,
  	            String jenis_makanan,
  	            String[] tempat_hidup,
  	            float berat,
  	            float daging,
  	            float sayur,
  	            int jumlah_habitat,
  	            boolean jinak,
  	            char cetak) {
  	position = posisi;
  	species = spesies;
  	sound = suara;
  	food_type = jenis_makanan;
  	number_habitat = jumlah_habitat;
  	habitat= new String[number_habitat];
  	for (int i=0; i<number_habitat; i++) {
  	  habitat[i] = tempat_hidup[i];
  	}
  	weight = berat;
  	food_meat = daging;
  	food_veggie = sayur;
  	tame = jinak;
  	render = cetak;
  }
  




  public boolean IsCarnivore() {
  	return (food_type=="Carnivore");
  }
  public boolean IsOmnivore() {
  	return (food_type=="Omnivore");
  }
  public boolean IsHerbivore() {
  	return (food_type=="Herbivore");
  }

  //Getter
  public Point GetPos() {
  	return position;
  }
  public String GetSpecies() {
  	return species;
  }
  public String Interact() {
  	return sound;
  }
  public String GetFoodType() {
  	return food_type;
  }
  public String[] GetHabitat() {
  	return habitat;
  }
  public float GetWeight() {
  	return weight;
  }
  public float GetFoodMeat() {
    if (IsCarnivore() || IsOmnivore())
  	  return (weight * 0.05);
  	else
  	  return 0;
  }
  public float GetFoodVeggie() {
  	if (IsHerbivore() || IsOmnivore())
  	  return (weight * 0.05);
  	else
  	  return 0;
  }
  public int GetNumberOfHabitat() {
  	return number_habitat;
  }
  public boolean IsTame() {
  	return tame;
  }
  public char Render() {
  	return render;
  }

  //Setter
  public void SetPoint(int absis, int ordinat) {
  	position.SetAbsis(absis);
  	position.SetOrdinat(ordinat);
  }
  public void SetPoint(Point p) {
  	position = p;
  }


}