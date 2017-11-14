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
public class PBO12_10116552_LatihanUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang jg = new JajarGenjang(50,60,70,80,100,120);
        Segitiga sg = new Segitiga(50,60,70,100,120);
        
        jg.hitungKeliling();
        jg.hitungLuas();
        sg.hitungKeliling();
        sg.hitungLuas();
    }
    
}
