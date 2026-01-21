import java.lang.Math;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

class ResistorColorTrio {
    String label(String[] colors) {
        
        List<String> colorsList = Arrays.asList(
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
        );
        
        int first = colorsList.indexOf(colors[0]);
        int second = colorsList.indexOf(colors[1]);
        Double zeros = Math.pow(10, colorsList.indexOf(colors[2]));
        
        if (zeros < 1.0) {zeros = 1.0;}
        int value = (first * 10 + second) * zeros.intValue();
        
        String magnitude = value >= 1000000.0 ? "megaohms" : value >= 1000.0 ? "kiloohms" : "ohms";
        
        if (magnitude == "kiloohms") {
            value = value/1000;
        } else if (magnitude == "megaohms") {
            value = value/1000000;
        }

        if (value >= 99 && magnitude == "megaohms") {
            value = 99;
            magnitude = "gigaohms";
        }
        
        return value + " " + magnitude;
    }
}
