package com.xdkomel.flutter_cell_info_plugin.models.gsm;

import androidx.annotation.Keep;

import com.xdkomel.flutter_cell_info_plugin.models.common.Signal;

import java.io.Serializable;
@Keep
public class SignalGSM extends Signal implements Serializable {

    private int rssi;
    private int bitErrorRate;
    private int timingAdvance;


    public SignalGSM() {
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public int getBitErrorRate() {
        return bitErrorRate;
    }

    public void setBitErrorRate(int bitErrorRate) {
        this.bitErrorRate = bitErrorRate;
    }

    public int getTimingAdvance() {
        return timingAdvance;
    }

    public void setTimingAdvance(int timingAdvance) {
        this.timingAdvance = timingAdvance;
    }
}
