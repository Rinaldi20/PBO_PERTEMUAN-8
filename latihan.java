package com.pbo;
import java.util.Scanner;
abstract class perhitungan{
    public abstract void hitungluas();


}
class segitiga extends perhitungan{
    public void hitungluas(){
        double alas , tinggi, luas;
        Scanner input = new Scanner(System.in);
        System.out.println("menghitung luas segitiga");
        System.out.print("masukan alas = ");
        alas = input.nextDouble();
        System.out.print("masukan tinggi = ");
        tinggi = input.nextDouble();
        luas = 0.5 * alas *tinggi;
        System.out.println(luas);
    }
}
class lingkaran extends perhitungan {
    public void hitungluas() {
        double diameter, luas;
        Scanner input = new Scanner(System.in);
        System.out.println("menghitung luas lingkaran");
        System.out.print("masukan diameter = ");
        diameter = input.nextDouble();
        luas = 3.14 * (0.5 * diameter) * (0.5 * diameter);
        System.out.println(luas);
    }
}

public class latihan {
    public static void main(String[] args) {
        segitiga hasilsegitiga = new segitiga();
        hasilsegitiga.hitungluas();
        lingkaran hasillingkaran = new lingkaran();
        hasillingkaran.hitungluas();
    }
}
