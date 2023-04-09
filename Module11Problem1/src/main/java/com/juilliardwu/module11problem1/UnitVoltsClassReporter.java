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
public class UnitVoltsClassReporter extends USsystemReporter implements Adapter{

    @Override
    public int getVoltsToUS() {
        return this.volts;
    }

    @Override
    public void setVoltsToUS(int volts) {
        this.volts = volts;
    }

    @Override
    public int getVoltsToEU() {
        return USToEU(this.volts);
    }

    @Override
    public void setVoltsToEu(int volts) {
        this.volts = EUToUS(volts);
    }
    
    private int USToEU(int volts){
        return volts + 100;
    }
    private int EUToUS(int volts){
        return volts - 100;
    }
}
