import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int nim;

        System.out.print("Masukkan nama: ");
        nama = input.next();
        System.out.println();

        System.out.print("Masukkan nim: ");
        nim = input.nextInt();
        System.out.println();

        // for loop, tipe data, array 1 dimensi, cin, cout
        String[] a = new String[50];
        String[] b = new String[50];
        int[] c = new int[50];
        int[] d = new int[50];
        int isi;

        System.out.print("Masukkan isi himpunan a : ");
        isi = input.nextInt();
        for (int i = 0; i < isi; i++) {
            System.out.print("Masukkan isi Himpunan a ke " + (i + 1) + " : ");
            a[i] = input.next();
        }
        System.out.println();

        // if else
        int waktu = 22;

        if (waktu < 10) {
            System.out.println("Good morning.");
        } else if (waktu < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        System.out.println();

        // while
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();
        System.out.println();

        // do...while
        int k = 1;
        do {
            System.out.print(k + " ");
            ++k;
        } while (k <= 5);
        System.out.println();
        System.out.println();

        // array multidimensi
        int[][] arr = {{2, -5}, {4, 0}, {9, 1}};
        for (int j = 0; j < 3; ++j) {
            for (int l = 0; l < 2; ++l) {
                System.out.println("array[" + j + "][" + l + "] = " + arr[j][l]);
            }
        }
    }
}