import java.math.BigDecimal;
import java.math.MathContext;

public class ComplexNumber { //T can only be double or BigDecimal
    private BigDecimal x, i;
    private double length; //ci serve solamente sapere se la lunghezza e' < 2 o meno
    private long nIter;
    //Constructors-----------------------------------------------------------------------------------------------------------
    public ComplexNumber(BigDecimal x, BigDecimal i, long nIter) {
        this.x = x;
        this.i = i;
        this.nIter = nIter;

        length = Double.parseDouble(((BigDecimal)x.pow(2).add((BigDecimal)i.pow(2))).sqrt(new MathContext(10)).toString​());
    }
    //Methods----------------------------------------------------------------------------------------------------------------
    public BigDecimal getX() {return x;}

    public BigDecimal getI() {return i;}

    public double getLength() {
        length = Double.parseDouble(((BigDecimal)x.pow(2).add((BigDecimal)i.pow(2))).sqrt(new MathContext(10)).toString​());
        return length;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(x.add(other.getX()), i.add(other.getI()));
    }

    public ComplexNumber pow(int n) {
        return new ComplexNumber(x.pow(n).subtract(i.pow(n)), x.multiply(i.multiply(new BigDecimal(n))));
    }
    //Utility----------------------------------------------------------------------------------------------------------------
    public void print() {
        System.out.println(x + " + " + i + "i");
    }

    public String getStringNumber() {
        return "(" + x.toString() + " + " + i.toString() + "i)" + ".length = " + length;
    }
}
