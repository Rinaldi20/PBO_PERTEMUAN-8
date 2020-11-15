package com.pbo;
abstract class hitungluas{
    protected double s1;
    protected double s2;
    public hitungluas(){
        this.s1=0;
        this.s2=0;
    }
    public void setSisi(double s1){
        this.s1 = s1;
    }
    public void setSisi(double s1, double s2){
        this.s1=s1;
        this.s2=s2;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }
    public abstract double getLuas();
}
class segitiga2 extends hitungluas{
    @Override
    public double getLuas() {
        double luas = 0.5 *this.s1 *this.s2;
        return luas;
    }
}
class lingkaran2 extends hitungluas{
    @Override
    public double getLuas() {
        double r = this.s1/2;
        double luas = 3.14 * r *r ;
        return luas;
    }
}

public class latihan_1{
    public static void main(String[] args) {
        segitiga2 osegitiga = new segitiga2();
        osegitiga.setSisi(5,2);
        System.out.println("luas segitiga = "+osegitiga.getLuas());

        lingkaran2 olingkaran =new  lingkaran2();
        olingkaran.setSisi(10);
        System.out.println("luas lingkaran = "+olingkaran.getLuas());
    }
}