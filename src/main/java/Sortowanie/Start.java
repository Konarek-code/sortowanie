package Sortowanie;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Start {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[200];
        Random random = new Random();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = random.nextInt(200);
        }
        while (true) {
            System.out.println("wybierz które sortowanie chcesz wykonać");
            System.out.println(" 1.Sortowanie Bąbelkowe");
            System.out.println(" 2.Sortowanie kubełkowe");
            int a = scanner.nextInt();
            if (a == 1) {
                SortowanieB sortb = new SortowanieB();

                arr = sortb.sort(arr);
                System.out.println(Arrays.toString(arr));
                System.out.println("liczba kroków:");
                System.out.println(sortb.step_counting());
            }

            if (a == 2) {

                SortowanieKube sortK = new SortowanieKube();
                arr = sortK.sort(arr);
                System.out.println(Arrays.toString(arr));
                System.out.println("liczba kroków:");
                System.out.println(sortK.step_counting());
            }
        }
    }
}

