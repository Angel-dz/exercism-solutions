import java.lang.StringBuilder;

class RaindropConverter {

    String convert(int number) {
        
        boolean isDivisible = false;
        StringBuilder sr = new StringBuilder();

        if (number % 3 == 0) {
            sr.append("Pling");
            isDivisible = true;
        }
        if (number % 5 == 0) {
            sr.append("Plang");
            isDivisible = true;
        }
        if (number % 7 == 0) {
            sr.append("Plong");
            isDivisible = true;
        }
        if (isDivisible == true) {
            return sr.toString();
        } else {
            return String.valueOf(number);
        }
    }

}
