package com.pbo;
// class abstrak
abstract class hewan{
    //abstrak method (tidak memiliki body)
    public abstract void  suarahewan();

    public void tidur(){
        System.out.println("Zzz....");
    }
}
class ayam extends hewan{
    public void suarahewan(){
        System.out.println("kuuuuukuruyuk");
    }
}
class kucing extends hewan{
    public void suarahewan(){
        System.out.println("meongmeong");
    }
}

public class Main {

    public static void main(String[] args) {
	ayam ayamku = new ayam();
	ayamku.suarahewan();
	ayamku.tidur();
	kucing kucingku = new kucing();
	kucingku.suarahewan();
	kucingku.tidur();
    }
}
