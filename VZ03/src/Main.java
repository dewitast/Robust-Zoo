import driver.*;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x, abs1, ord1, abs2, ord2;
		Driver d = new Driver();
		d.displayMenu();
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		while (x != 4) {
			if (x == 1) {
				System.out.print("Absis kiri atas : ");
			    abs1 = sc.nextInt();
			    System.out.print("Ordinat kiri atas : ");
			    ord1 = sc.nextInt();
			    System.out.print("Absis kanan bawah : ");
			    abs2 = sc.nextInt();
			    System.out.print("Ordinat kanan bawah : ");
			    ord2 = sc.nextInt();
				d.displayZoo(abs1, ord1, abs2, ord2);
			} else if (x == 2) {
				d.tourZoo();
				while (d.getPoint().getAbsis() != -1) {
					d.tourZoo();
				}
			} else if (x == 3) {
				System.out.println("Total meat calculation : " + d.foodCalcMeat());
				System.out.println("Total veggie calculation : " + d.foodCalcVeggie());
			} else {
				System.out.println("Your input is invalid. Please choose a number from 1 to 4.");
			}
			d.displayMenu();
			x = sc.nextInt();
			System.out.println("");
		}
		sc.close();
	}

}
