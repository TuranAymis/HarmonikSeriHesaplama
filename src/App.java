import java.util.Scanner;

public class App {
    /*
    Proje Konusu 
    #Java ile girilen sayının harmonik serisini bulan programı yazınız.

     */
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n;
        double result = 0;

        System.out.print("N değerini giriniz: ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            result = result + (1.0 / i);
        }

        System.out.println(result);

    }
}
