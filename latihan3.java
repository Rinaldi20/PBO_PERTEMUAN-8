package com.pbo;

interface luas{
    public  void setSisi (double...sisi);
    public double getluas();
}
class luassegitiga implements luas{
    private double alas;
    private double tinggi;
    @Override
    public void setSisi(double...sisi){
        this.alas =sisi [0];
        this.tinggi=sisi[1];
    }


    @Override
    public double getluas(){
        double luas = 0.5 *this.alas *this.tinggi;
        return luas;
    }
}
public class latihan3 {

}
