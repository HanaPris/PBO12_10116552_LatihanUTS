/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO12_10116552_LatihanUTS5;

/**
 *
 * @author Hana
 */
public class Segitiga implements BangunDatar{
    
    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCd;
    //private final int sisiDa;
    private final int alas;
    private final int tinggi;
    
    public Segitiga(int ab, int bc, int cd, int alas, int tinggi){
        this.sisiAb=ab;
        this.sisiBc=bc;
        this.sisiCd=cd;
        //this.sisiDa=da;
        this.alas=alas;
        this.tinggi=tinggi;
    }
    
    @Override
    public void hitungLuas(){
        luas = (int)(0.5* alas * tinggi);
        System.out.println("Luas Segitiga : "+luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = (sisiAb + sisiBc + sisiCd);
        System.out.println("Keiling Segitiga : "+keliling);
    }
    
}
