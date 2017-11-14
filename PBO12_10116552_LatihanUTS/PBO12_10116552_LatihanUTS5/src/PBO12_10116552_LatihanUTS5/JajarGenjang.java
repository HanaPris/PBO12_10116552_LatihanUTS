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
public class JajarGenjang implements BangunDatar{
    
    private int luas;
    private int keliling;
    private final int sisiAb;
    private final int sisiBc;
    private final int sisiCd;
    private final int sisiDa;
    private final int alas;
    private final int tinggi;
    
    public JajarGenjang(int ab, int bc, int cd, int da, int alas, int tinggi){
        this.sisiAb=ab;
        this.sisiBc=bc;
        this.sisiCd=cd;
        this.sisiDa=da;
        this.alas=alas;
        this.tinggi=tinggi;
    }

    

    
    
    @Override
    public void hitungLuas(){
        luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang : "+luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = 2 * (sisiDa + sisiAb);
        System.out.println("Keliling Jajar Genjang : "+keliling);
    }
    
}
