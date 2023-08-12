/*
 *MARVIN GEOBANY REYNA ORTEGA 7690-22-8291 
 * 
 * PARCIAL 1
 */


public class OctalADecimal {

	private int NumOctal;

    public OctalADecimal(int NumOctal) {
        this.NumOctal = NumOctal;
    }

    public int convert() {
        int NumDecimal = 0;
        int octalTemp = NumOctal;
        int power = 0;

        while (octalTemp != 0) {
            int digito = octalTemp % 10;
            NumDecimal += digito * Math.pow(8, power);
            power++;
            octalTemp /= 10;
        }

        return NumDecimal;
    }
}

