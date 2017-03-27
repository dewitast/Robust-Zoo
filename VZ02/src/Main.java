import driver.*;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
		Driver d = new Driver();
		d.DisplayMenu();
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		while (x != 4) {
			if (x == 1) {
				d.DisplayZoo();
			} else if (x == 2) {
				d.TourZoo();
				while (d.GetPoint().GetAbsis() != -1) {
					d.TourZoo();
				}
			} else if (x == 3) {
				System.out.println("Total meat calculation : " + d.FoodCalcMeat());
				System.out.println("Total veggie calculation : " + d.FoodCalcVeggie());
			} else {
				System.out.println("Your input is invalid. Please choose a number from 1 to 4.");
			}
			d.DisplayMenu();
			x = sc.nextInt();
			System.out.println("");
		}
		sc.close();
	}

}
