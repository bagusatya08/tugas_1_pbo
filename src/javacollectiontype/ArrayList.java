package javacollectiontype;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        java.util.ArrayList kumpulan_angka = new java.util.ArrayList();

        System.out.println("+-----------------------------------------------------+");
        System.out.println("|       Program Pencetakan Value Dari Arraylist       |");
        System.out.println("+-----------------------------------------------------+");
        System.out.print("| Masukan jumlah angka yang akan dimasukan : ");
        int jumlah_data = scanner.nextInt();

        for (int i=0; i<jumlah_data; i++){
            System.out.print("| Masukan Angka ke-" + (i + 1));
            System.out.print(" = ");
            kumpulan_angka.add(new Scanner(System.in).nextLine());
        }
        System.out.println("+-----------------------------------------------------+");
        System.out.print("| Isi Data = ");
        System.out.println(kumpulan_angka);
        System.out.print("| Masukan indeks Angka yang akan dicetak = ");
        int data_indeks = scanner.nextInt();
        System.out.print("| Nilai indeks ke- " + (data_indeks));
        System.out.print(" = ");
        System.out.println(kumpulan_angka.get(data_indeks-1));
        System.out.println("+-----------------------------------------------------+");
    }
}
