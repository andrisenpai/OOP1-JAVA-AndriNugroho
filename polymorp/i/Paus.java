/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.polymorp.i;

/**
 *
 * @author Andri Nugroho
 */
public class Paus extends Ikan {

    @Override
    void makan() {
        System.out.println("Paus Makan");    
    }

    @Override
    void berenang() {
        System.out.println("Paus Berenang");
    }
    
}
