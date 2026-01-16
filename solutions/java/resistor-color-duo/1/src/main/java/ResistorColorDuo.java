import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {
    int value(String[] colors) {
        List<String> colorsList = Arrays.asList(
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
        );
        
        int first = colorsList.indexOf(colors[0]);
        int second = colorsList.indexOf(colors[1]);

        return first * 10 + second;
    }
}
