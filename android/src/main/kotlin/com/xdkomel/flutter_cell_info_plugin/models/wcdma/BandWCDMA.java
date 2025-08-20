package com.xdkomel.flutter_cell_info_plugin.models.wcdma;

import androidx.annotation.Keep;

import com.xdkomel.flutter_cell_info_plugin.models.common.Band;

import java.io.Serializable;
@Keep
public class BandWCDMA extends Band implements Serializable {

    private int downlinkUarfcn;

    public BandWCDMA() {
    }

    public int getDownlinkUarfcn() {
        return downlinkUarfcn;
    }

    public void setDownlinkUarfcn(int downlinkUarfcn) {
        this.downlinkUarfcn = downlinkUarfcn;
    }
    
}
