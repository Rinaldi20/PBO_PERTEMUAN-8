package com.pbo;

interface mamalia {
    public void tempattinggal();
    public void tidur();
}
interface mahlukhidup{
    public void bernapas();
    public void bernama();
}
class hewan1 implements mamalia,mahlukhidup{
    @Override
    public void tempattinggal(){
        System.out.println("tempat tinggal = air");
    }
    @Override
    public void tidur() {
        System.out.println("Zzzz");
    }
    @Override
    public void bernapas(){
        System.out.println("paru paru");
    }
    @Override
    public void bernama(){
        System.out.println("paus");
    }
}

public class latihan2 {
    public static void main(String[] args) {
        hewan1 paus = new hewan1();
        paus.bernapas();
        paus.bernama();
        paus.tempattinggal();
        paus.tidur();
    }
}
