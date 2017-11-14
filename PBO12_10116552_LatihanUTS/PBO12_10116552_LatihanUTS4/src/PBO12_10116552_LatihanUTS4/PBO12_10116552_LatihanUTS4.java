/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO12_10116552_LatihanUTS4;

/**
 *
 * @author Hana
 */
public class PBO12_10116552_LatihanUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner dsg = new ModelDesigner();
        ModelSystemAnalyst ssa = new ModelSystemAnalyst();
        ModelProgrammer prg = new ModelProgrammer();
        
        dsg.bonusDesigner();
        prg.bonusProgrammer();
        ssa.bonusSystemAnalyst();
    }
    
}
