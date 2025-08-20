package com.xdkomel.flutter_cell_info_plugin.models.gsm;

import androidx.annotation.Keep;

import com.xdkomel.flutter_cell_info_plugin.models.common.Band;

import java.io.Serializable;
@Keep
public class BandGSM extends Band implements Serializable {

    private int arfcn;

    public BandGSM() {
    }


    public int getArfcn() {
        return arfcn;
    }

    public void setArfcn(int arfcn) {
        this.arfcn = arfcn;
    }
}
