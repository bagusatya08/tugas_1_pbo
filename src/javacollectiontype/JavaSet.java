package javacollectiontype;

import java.util.*;

public class JavaSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> kumpulan_data = new HashSet<>();

        System.out.println("+-----------------------------------------------------+");
        System.out.println("|         Program Validasi Value Dari HashSet         |");
        System.out.println("+-----------------------------------------------------+");
        System.out.print("| Masukan jumlah angka yang akan dimasukan : ");
        int jumlah_data = scanner.nextInt();

        for (int i=0; i<jumlah_data; i++){
            System.out.print("| Masukan Angka ke-" + (i + 1));
            System.out.print(" = ");
            kumpulan_data.add(new Scanner(System.in).nextLine());
        }

        System.out.println("+-----------------------------------------------------+");
        System.out.print("| Isi Data = ");
        System.out.println(kumpulan_data);
        System.out.print("| Cari nilai yang diinput = ");
        String nilai_dicari;
        nilai_dicari = new String(scanner.next());
        if (kumpulan_data.contains(nilai_dicari)){
            System.out.println("| Data Terdapat dalam HashSet");
        } else{
            System.out.println("| Tidak Terdapat dalam HashSet");
        }

        System.out.println("+-----------------------------------------------------+");
    }
}
