package part.one;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DataType {

    private boolean aBoolean = true;
    private char aChar = 'a';
    private byte aByte = 1;
    private short aShort = 234;
    private int anInt = 366524;
    private long aLong = 33342342L;
    private float aFloat = 3.4f;
    private double aDouble = 99.99;

    /*
    wrapper
    */
    Character chOne = new Character(aChar);
    Character chTwo = new Character('a');
    Character chThree = 'a';

    BigInteger bigInteger = new BigInteger("341233213131232");
    BigDecimal bigDecimal = new BigDecimal("3213123.3232323");

}
