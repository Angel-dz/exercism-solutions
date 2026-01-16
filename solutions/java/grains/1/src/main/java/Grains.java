import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square > 0 && square < 65) {
            BigInteger cuantity = new BigInteger("2");
            return cuantity.pow(square-1);
        } else {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
    }

    BigInteger grainsOnBoard() {
        BigInteger total = BigInteger.ZERO;
        BigInteger grains = BigInteger.ONE;

        for (int square = 1; square <= 64; square++) {
            total = total.add(grains);
            grains = grains.multiply(BigInteger.TWO);
        }

        return total;
    }
    
}
