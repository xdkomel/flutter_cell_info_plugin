package com.xdkomel.flutter_cell_info_plugin.models;

import androidx.annotation.Keep;

import com.xdkomel.flutter_cell_info_plugin.models.cdma.CellCDMA;
import com.xdkomel.flutter_cell_info_plugin.models.gsm.CellGSM;
import com.xdkomel.flutter_cell_info_plugin.models.lte.CellLTE;
import com.xdkomel.flutter_cell_info_plugin.models.nr.CellNR;
import com.xdkomel.flutter_cell_info_plugin.models.tdscdma.CellTDSCDMA;
import com.xdkomel.flutter_cell_info_plugin.models.wcdma.CellWCDMA;

import java.io.Serializable;
@Keep
public class CellType implements Serializable {

    private String type;
    private CellCDMA cdma;
    private CellGSM gsm;
    private CellLTE lte;
    private CellNR nr;
    private CellTDSCDMA tdscdma;
    private CellWCDMA wcdma;

    public CellType() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CellCDMA getCdma() {
        return cdma;
    }

    public void setCdma(CellCDMA cdma) {
        this.cdma = cdma;
    }

    public CellGSM getGsm() {
        return gsm;
    }

    public void setGsm(CellGSM gsm) {
        this.gsm = gsm;
    }

    public CellLTE getLte() {
        return lte;
    }

    public void setLte(CellLTE lte) {
        this.lte = lte;
    }

    public CellNR getNr() {
        return nr;
    }

    public void setNr(CellNR nr) {
        this.nr = nr;
    }

    public CellTDSCDMA getTdscdma() {
        return tdscdma;
    }

    public void setTdscdma(CellTDSCDMA tdscdma) {
        this.tdscdma = tdscdma;
    }

    public CellWCDMA getWcdma() {
        return wcdma;
    }

    public void setWcdma(CellWCDMA wcdma) {
        this.wcdma = wcdma;
    }
}
