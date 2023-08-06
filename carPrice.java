package Java.carprice-java;
import java.util.Scanner;

class carPrice{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();

        if (price<=12000) {
        System.out.println("enough");
        }

    }
}