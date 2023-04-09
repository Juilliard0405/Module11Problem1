/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juilliardwu.module11problem1;

/**
 *
 * @author juilliardwu
 */
public class USsystemReporter {
    public int volts;
    public USsystemReporter() {
        this.volts = 120;
    }

    public USsystemReporter(int volts) {
        this.volts = volts;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
    
    
}
