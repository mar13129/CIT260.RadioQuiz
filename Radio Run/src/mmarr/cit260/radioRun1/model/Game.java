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
public class Game implements Serializable{

    private double numberCorrect;
    private String radioParts;

    public Game() {
    }

            
    public double getNumberCorrect() {
        return numberCorrect;
    }

    public void setNumberCorrect(double numberCorrect) {
        this.numberCorrect = numberCorrect;
    }

    public String getRadioParts() {
        return radioParts;
    }

    public void setRadioParts(String radioParts) {
        this.radioParts = radioParts;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.numberCorrect) ^ (Double.doubleToLongBits(this.numberCorrect) >>> 32));
        hash = 73 * hash + Objects.hashCode(this.radioParts);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "numberCorrect=" + numberCorrect + ", radioParts=" + radioParts + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.numberCorrect) != Double.doubleToLongBits(other.numberCorrect)) {
            return false;
        }
        if (!Objects.equals(this.radioParts, other.radioParts)) {
            return false;
        }
        return true;
    }
            
            
}
