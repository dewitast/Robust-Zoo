import driver.Driver;

import java.util.Scanner;

public class Main {
  /**
   * Kelas main sebagai program utama dari virtual zoo.
   * @param args mengembalikan keluaran dari zoo.
   */
  public static void main(String[] args) {
    int x;
    int abs1;
    int ord1;
    int abs2;
    int ord2;
    Driver d = new Driver();
    Scanner sc = new Scanner(System.in);
    do {
      d.displayMenu();;
      x = sc.nextInt();
      System.out.println("");
      if (x == 1) {
        System.out.print("Absis kiri atas : "); abs1 = sc.nextInt();
        System.out.print("Ordinat kiri atas : "); ord1 = sc.nextInt();
        System.out.print("Absis kanan bawah : "); abs2 = sc.nextInt();
        System.out.print("Ordinat kanan bawah : "); ord2 = sc.nextInt();
        if (abs1 < 0 || abs1 > abs2 || ord1 < 0 || ord1 > ord2 || abs2 > d.getZoo().getBaris() || ord2 > d.getZoo().getKolom()) {
          System.out.println("Input Salah!");
        } else {
          d.displayZoo(abs1, ord1, abs2, ord2);
        }
      } else if (x == 2) {
        d.tourZoo();
        while (d.getPoint().getAbsis() != -1) {
          d.tourZoo();
        }
      } else if (x == 3) {
        System.out.println("Total meat calculation : " + d.foodCalcMeat());
        System.out.println("Total veggie calculation : " + d.foodCalcVeggie());
        System.out.println();
      } else if (x != 4) {
        System.out.println("Your input is invalid. Please choose a number from 1 to 4.");
      }
    } while (x != 4);
    sc.close();
  }
}
