import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        boolean Verschieden = false;
        do {
            System.out.print("Gib einen Wert für x ein:");
            x = scanner.nextInt();

            System.out.print("Gib einen Wert für y ein:");
            y = scanner.nextInt();

            System.out.print("Gib einen Wert für z ein:");
            z = scanner.nextInt();

            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);

            if (x != y && x != z && y != z) {
                System.out.println("Alle Zahlen sind verschieden.");
                Verschieden = true;
            }

            else if (x == y && x == z && y == z) {
                System.out.println("Alle Zahlen sind gleich.");
            }

            else  if (x == y) {
                System.out.println("Zwei Zahlen sind gleich, nämlich " + x);
            }
            else if (x == z) {
                System.out.println("Zwei Zahlen sind gleich, nämlich X und Z.");
            }

            else  {
                System.out.println("Zwei Zahlen sind gleich, nämlich Y und Z.");
            }

            if (!Verschieden) {
                System.out.println("Gib andere Zahlen ein:");
            }

        } while (!Verschieden) ;

    }
}

