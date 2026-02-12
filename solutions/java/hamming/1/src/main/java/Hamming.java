import java.lang.IllegalArgumentException;

public class Hamming {

    private String leftStrand;
    private String rightStrand;
    
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        char[] leftStrandChar = leftStrand.toCharArray();
        char[] rightStrandChar = rightStrand.toCharArray();
        int count = 0;

        for (int i = 0; i < leftStrandChar.length; i++) {
            if (leftStrandChar[i] != rightStrandChar[i]) {count++;}
        }
        return count;
    }
}
