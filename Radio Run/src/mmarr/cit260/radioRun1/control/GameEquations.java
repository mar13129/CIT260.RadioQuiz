package mmarr.cit260.radioRun1.control;

import java.text.DecimalFormat;

public class GameEquations {

    public double calcPercent(double numberCorrect) {

        /* IF numberCorrect < 0 THEN return -999
		IF numberCorrect > 25 THEN return -999
		numberCorrect / 25 = fractionCorrect
		fractionCorrect	* 100 = percentCorrect
		RETURN percentCorrect
         */
        if (numberCorrect < 0 || numberCorrect > 25) {
            return -999;

        }
        double fractionCorrect = numberCorrect / 25;
        double percentCorrect = fractionCorrect * 100;
        return percentCorrect;
    }

    public long calcBand(double frequency) {
        /*
        IF frequency < 0 THEN return -999
		300 / frequency = bandApprox
		round bandApprox to whole number.
		return bandApprox
         */
        if (frequency <= 0) {
            return -999;
        }

        double bandApprox = 300 / frequency;
        long bandResult = Math.round(bandApprox);
        return bandResult;
    }

    public double getRandomFrequency() {
        double frequencyForBand = Math.random();
       frequencyForBand = Math.round(frequencyForBand * 500000);
       frequencyForBand = frequencyForBand / 1000.000;
        return frequencyForBand;
    }

}
