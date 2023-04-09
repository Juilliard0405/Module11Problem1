package com.juilliardwu.module11problem1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juilliardwu
 */
public class Main {
    public static void main(String[] args) {
        UnitVoltsClassReporter test  = new UnitVoltsClassReporter();
        test.setVoltsToUS(230);
        System.out.println("Volts in EU:" + test.getVoltsToEU());
        System.out.println("Volts in US:" + test.getVoltsToUS());
    }
    
}
