import java.math.BigInteger;

public class MathUse {
    public static void main(String[] args) {
        // int square = Math.sqrt(9); This method returns a double so it's a type mismatch
        int square = (int) Math.sqrt(9); // 9 is implicit

        double powResult = Math.pow(5,3); // uses convertion for the parameters that require a double


        //Since these types of operation can give a very large result we can use BigInteger
        BigInteger base = BigInteger.valueOf(25);
        int exp = 123;
        BigInteger result = base.pow(exp); //Using pow of the BigInteger class (non-static)



        // Using Random
        int randomNumber = (int) (Math.random() * 100) ;


        int absoluteValue = Math.abs(45);
    }
}
