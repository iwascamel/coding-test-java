package AlgorithmLecture;

import java.math.BigInteger;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a number to test for primality.");
        BigInteger mynum = new BigInteger(stdin.next());

        if (MillerRabin(mynum, 50))
            System.out.println("Number is Prime");
        else
            System.out.println("Number is Composite");

    }

    public static boolean FermatTest(BigInteger n, Random r) {

        BigInteger temp = BigInteger.ZERO;
        do {
            temp = new BigInteger(n.bitLength()-1, r);
        } while (temp.compareTo(BigInteger.ONE) <= 0);

        BigInteger ans = temp.modPow(n.subtract(BigInteger.ONE), n);

        return (ans.equals(BigInteger.ONE));
    }

    private static boolean MyMillerRabin(BigInteger n, Random r) {

        // Ensures that temp > 1 and temp < n.
        BigInteger temp = BigInteger.ZERO;
        do {
            temp = new BigInteger(n.bitLength()-1, r);
        } while (temp.compareTo(BigInteger.ONE) <= 0);

        if (!n.gcd(temp).equals(BigInteger.ONE)) return false;

        BigInteger base = n.subtract(BigInteger.ONE);
        BigInteger TWO = new BigInteger("2");

        int k=0;
        while ( (base.mod(TWO)).equals(BigInteger.ZERO)) {
            base = base.divide(TWO);
            k++;
        }

        BigInteger curValue = temp.modPow(base,n);

        if (curValue.equals(BigInteger.ONE))
            return true;

        for (int i=0; i<k; i++) {

            if (curValue.equals(n.subtract(BigInteger.ONE)))
                return true;

            else
                curValue = curValue.modPow(TWO, n);
        }
        return false;
    }

    public static boolean MillerRabin(BigInteger n, int numTimes) {

        Random r = new Random();

        for (int i=0; i<numTimes; i++)
            if (!MyMillerRabin(n,r)) return false;

        return true;
    }
}