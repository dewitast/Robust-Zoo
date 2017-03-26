/** File : Driver.java */
/** Penanggung jawab :
  * Nama : Catherine Almira
  * NIM : 13515111
  */

package driver;
import zoo.*;
import java.io.*;
import java.util.*;
import java.util.Random;

/** Kelas Driver merupakan kelas sebagai pilihan menu aplikasi.
  */
public class Driver {
  public Zoo z;
  public boolean[][] visited;
  public Point p;


  /** Menciptakan Cage kosong tanpa animal.
   */
  public Driver() {
    p(-1,-1);
    BELOM KELAR
    BACA FILE BELOM
  }
  /** Menampilkan zoo ke layar.
   */
  public void DisplayZoo() {
    for (int i=0;i<z.GetJumlahCage();++i)
		z.GetCage(i).Move();
	System.out.println(z);
  }
  /** Mencetak ke layar eksperimen yang didapat pengunjung.
    */
  public void GetExperience() {
    Point p1;
	if (p.GetAbsis()>0) {
	  p1.SetAbsis(p.GetAbsis()-1);
	  p1.SetOrdinat(p.GetOrdinat());
	  if ((z.GetElement(p1)).IsHabitat())
	    (z.SearchPoint(p1)).Interact();
	}
	if (p.GetAbsis()<z.GetBeff()-1) {
	  p1.SetAbsis(p.GetAbsis()+1);
	  p1.SetOrdinat(p.GetOrdinat());
	  if ((z.GetElement(p1)).IsHabitat())
	    (z.SearchPoint(p1)).Interact();
	}
	if (p.GetOrdinat()>0)
	{
	  p1.SetAbsis(p.GetAbsis());
	  p1.SetOrdinat(p.GetOrdinat()-1);
	  if ((z.GetElement(p1)).IsHabitat())
	    (z.SearchPoint(p1)).Interact();
	}
	if (p.GetAbsis()<z.GetKeff()-1)
	{
	  p1.SetAbsis(p.GetAbsis());
	  p1.SetOrdinat(p.GetOrdinat()+1);
	  if ((z.GetElement(p1)).IsHabitat())
	    (z.SearchPoint(p1)).Interact();
	}
  }
  /** Melakukan tur zoo.
    */
  public void TourZoo() {
    for (int i=0; i<z.GetJumlahCage();++i)
	  z.GetCage(i).Move();
	Random rand = new Random();
	bool found = false;
	if ((p.GetAbsis()==-1)&&(p.GetOrdinat()==-1)) {
	  System.out.println("Welcome to the zoo.");
	  while (!found) {
	    for (int i=0;i<z.GetBeff();++i)
		  for (int j=0;j<z.GetKeff();++j)
		    visited[i][j] = false;
		Random rand = new Random();
		int random = rand.nextInt(z.GetBeff());
		if ((z.GetElement(0,random)).IsEntrance()) {
		  found = true;
		  p.SetAbsis(0);
		  p.SetOrdinat(random);
		}
		else if ((z.GetElement(z.GetBeff()-1,random)).IsEntrance()) {
		  found = true;
		  p.SetAbsis(z.GetBeff()-1);
		  p.SetOrdinat(random);
		}	
		if (!found) {
		  Random rand = new Random();
		  int random = rand.nextInt(z.GetKeff());
		  if ((z.GetElement(random,0)).IsEntrance()) {
		    found = true;
			p.SetAbsis(random);
			p.SetOrdinat(0);
		  }
		  else if ((z.GetElement(random,z.GetKeff()-1)).IsEntrance()) {
		  	found = true;
		  	p.SetAbsis(random);
			p.SetOrdinat(z.GetKeff()-1);
		  }
		}
	  }
	}
	else {
	  visited[p.GetAbsis()][p.GetOrdinat()] = true;
	  bool b1 = ((p.GetAbsis()>0)&&(!visited[p.GetAbsis()-1][p.GetOrdinat()])&&((z.GetElement(p.GetAbsis()-1,p.GetOrdinat()))).IsRoad());
	  bool b2 = ((p.GetOrdinat()<z.GetKeff()-1)&&(!visited[p.GetAbsis()][p.GetOrdinat()+1])&&((z.GetElement(p.GetAbsis(),p.GetOrdinat()+1))).IsRoad());
	  bool b3 = ((p.GetAbsis()<z.GetBeff()-1)&&(!visited[p.GetAbsis()+1][p.GetOrdinat()])&&((z.GetElement(p.GetAbsis()+1,p.GetOrdinat()))).IsRoad());
	  bool b4 = ((p.GetOrdinat()>0)&&(!visited[p.GetAbsis()][p.GetOrdinat()-1])&&((z.GetElement(p.GetAbsis(),p.GetOrdinat()-1))).IsRoad());
	  if ((!b1)&&(!b2)&&(!b3)&&(!b4)) {
	    p.SetAbsis(-1);
	    p.SetOrdinat(-1);
		return;
	  }
	  while (!found) {
	  	Random rand = new Random();
		int random = rand.nextInt(4);
		if (random==0) {
		  if (b1) {
		  	found = true;
		  	p.SetAbsis(p.GetAbsis()-1);
		  }	
		}
		else if (random==1) {
		  if (b2) {
		  	found = true;
		  	p.SetOrdinat(p.GetOrdinat()+1);
		  }
		}
	    else if (random==2) {
		  if (b3) {
		    found = true;
			p.SetAbsis(p.GetAbsis()+1);
		  }
		}
		else if (random==3) {
		  if (b4) {
		  	found = true;
		  	p.SetOrdinat(p.GetOrdinat()-1);
		  }	
		}
	  }
	  GetExperience();
	  if ((z.GetElement(P)).IsExit()) {
	  	System.out.println("Posisi : (" + p.GetAbsis() + "," + p.GetOrdinat() + ")");
	  	System.out.println("You've reached the end of this journey.");
		p.SetAbsis(-1);
		p.SetOrdinat(-1);
	  }
	}
	if (p.GetAbsis()!=-1)
      System.out.println("Posisi : (" + p.GetAbsis() + "," + p.GetOrdinat() + ")");
  }
  /** Melakukan perhitungan makanan (sayuran) yang harus disiapkan.
	* @return Mengembalikan jumlah makanan (sayuran) yang harus disiapkan.
    */
  public float FoodCalcVeggie() {
    float sum = 0;
	for(int i=0;i<z.GetJumlahCage();i++) {
	  for(int j=0;j<(z.GetCage(i)).GetTotalAnimal();j++) {
	    sum += ((z.GetCage(i)).GetAnimal(j))->GetFoodVeggie();
	  }
	}
	return sum;
  }
  /** Melakukan perhitungan makanan (daging) yang harus disiapkan.
	* @return Mengembalikan jumlah makanan (daging) yang harus disiapkan.
    */
  public float FoodCalcMeat() {
    float sum = 0;
	for(int i=0;i<z.GetJumlahCage();i++) {
	  for(int j=0;j<(z.GetCage(i)).GetTotalAnimal();j++) {
	    sum += ((z.GetCage(i)).GetAnimal(j))->GetFoodMeat();
	  }
	}
	return sum;
  }
  /** Menampilkan menu utama ke layar.
    */
  public void DisplayMenu() {
    System.out.println("Main Menu:");
    System.out.println("1. Display Zoo");
    System.out.println("2. Tour Around Zoo");
    System.out.println("3. Animal's Food Calculation");
    System.out.println("4. Exit");
    System.out.print("Input your number of choice here: ");
  }
  /** @return Mengembalikan zoo.
	*/
  public Zoo GetZoo() {
    return z;
  }
  /** @return Mengembalikan point.
	*/
  public Point GetPoint() {
    return p;
  }
};