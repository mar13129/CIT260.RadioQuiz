/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mmarr.cit260.radioRun1.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Matthew
 */
public class Radio implements Serializable{

    private String radioPart;
    private String partsNeeded;

    public Radio() {
    }

            
    public String getRadioPart() {
        return radioPart;
    }

    public void setRadioPart(String radioPart) {
        this.radioPart = radioPart;
    }

    public String getPartsNeeded() {
        return partsNeeded;
    }

    public void setPartsNeeded(String partsNeeded) {
        this.partsNeeded = partsNeeded;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.radioPart) ^ (Double.doubleToLongBits(this.radioPart) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.partsNeeded);
        return hash;
    }

    @Override
    public String toString() {
        return "Radio{" + "radioPart=" + radioPart + ", partsNeeded=" + partsNeeded + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Radio other = (Radio) obj;
        if (!Objects.equals(this.radioPart, other.radioPart)) {
            return false;
        }
        if (!Objects.equals(this.partsNeeded, other.partsNeeded)) {
            return false;
        }
        return true;
    }

    public void setNumberCorrect(int numberCorrect) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRadioParts(String radioParts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}