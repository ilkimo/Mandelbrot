import java.awt.Color;
import java.math.BigDecimal;
import java.math.BigInteger;

public class ColorMap {
    private final static Color[] colors = new Color[]{
                                            new Color(30f/255f, 0f/255f, 30f/255f), //viola
                                            new Color(222f/255f, 0f/255f, 0f/255f), //rosso
                                            new Color(222f/255f, 120f/255f, 30f/255f), //arancione
                                            new Color(255f/255f, 214f/255f, 30f/255f), //giallo/arancione
                                            new Color(0f/255f, 214f/255f, 210f/255f), //azzurro
                                            new Color(150f/255f, 172f/255f, 148f/255f), //rosa
                                            new Color(120f/255f, 255f/255f, 0f/255f), //verde
                                            new Color(255f/255f, 60f/255f, 0f/255f), //rosso scuro
                                            new Color(200f/255f, 200f/255f, 200f/255f), //grigio
                                            new Color(150f/255f, 0f/255f, 150f/255f), //violetto
                                            new Color(255f/255f, 255f/255f, 0f/255f), //giallo limone
                                            new Color(60f/255f, 60f/255f, 60f/255f), //bluetto
                                            new Color(150f/255f, 150f/255f, 150f/255f) //grigio
                                              };

    public static Color getColor(BigInteger zoom, ComplexNumber z, long nIterations) throws MyException {
        if(z.getLength() < 2) { //se non e' esploso lo coloro di nero
            return Color.black;
        } else {
            Color c = null;
            final double mfp = 2.0, imsc = 15.0 - 1.0; //15.0 - 1.0 per capire meglio cosa sto facendo (tolgo 1 e l0 aggiungo a imsc per evitare di assegnare nero a punti divergenti)
            float ic = (float)((imsc * Math.cos(BigMath.logBigInteger(zoom)))/mfp) + 1f;
            //imsc : mfp = ic : cos(log(x)), dove per zoomare si usare 2^x ed x sarebbe lo zoom
            //ic == Indice colore, IMSC == Indice massimo scala colori, mfp == massimo f. periodica, x == zoom

            if(ic < 1) {

            } else if(ic < 2) {
                c = colors[0];
            } else if(ic < 3) {
                c = colors[1];
            } else if(ic < 4) {
                c = colors[2];
            } else if(ic < 5) {
                c = colors[3];
            } else if(ic < 6) {
                c = colors[4];
            } else if(ic < 7) {
                c = colors[5];
            } else if(ic < 8) {
                c = colors[6];
            } else if(ic < 9) {
                c = colors[7];
            } else if(ic < 10) {
                c = colors[8];
            } else if(ic < 11) {
                c = colors[9];
            } else if(ic < 12) {
                c = colors[10];
            } else if(ic < 13) {
                c = colors[11];
            } else if(ic <= 14) {
                c = colors[12];
            } else {
                throw new MyException("Caso non previsto, ColorMap.getColor(...) in caso: " + "{zoom = " + zoom.toString()
                                        + ", z:" + z.getStringNumber() + "nIterations = " + nIterations + "}" + "ic = " + ic);
            }

            return c;
        }
    }
}
