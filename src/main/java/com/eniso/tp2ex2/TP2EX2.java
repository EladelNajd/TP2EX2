/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2ex2;

/**
 *
 * @author LENOVO
 */
public class TP2EX2 {

    public static void main(String[] args) {
        Livre l1 = new Livre ();
        Livre l2 = new Livre("billy bat ","naoki urasawa");
        Livre l3 = new Livre ("GTO","Toru Fujisawa",1997);
        Livre l4 = new Livre ("shamo","Izo Hashimoto",1998,1);
        l1.Tostring();
        l2.Tostring();
        l3.Tostring();
        l4.Tostring();
        
    }
}
