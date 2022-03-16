package javacollectiontype;

import java.util.*;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> kumpulan_data = new HashMap<>();

        System.out.println("+-----------------------------------------------------+");
        System.out.println("|  Program Pencari Nama dan Id Pegawai dengan HashMap |");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("| Nama       | Id_pegawai");
        System.out.println("+-----------------------------------------------------+");
        kumpulan_data.put("Bagus",15346);
        kumpulan_data.put("Putri", 12453);
        kumpulan_data.put("Anisa", 14321);
        kumpulan_data.put("Harry", 23412);

        for (String i : kumpulan_data.keySet()){
            System.out.println("| " + i + "      |" +kumpulan_data.get(i));
        }
        System.out.println("+-----------------------------------------------------+");
        System.out.print("| Masukan Nama untuk mencari id_pegawai = ");
        String nama = scanner.next();

        System.out.println("| Id_pegawai " +nama+ " = " +kumpulan_data.get(nama));
        System.out.println("+-----------------------------------------------------+");
    }
}
