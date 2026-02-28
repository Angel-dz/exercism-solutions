import java.util.Map;
import java.util.HashMap;

class Scrabble {

    private static final Map<Character, Integer> VALUES = new HashMap<>();

    private static void load(int value, char... letters) {
        for (char letter : letters) {
            VALUES.put(letter, value);
        }
    }

    static {
        load(1,'A','E','I','O','U','L','N','R','S','T');
        load(2,'D','G');
        load(3,'B','C','M','P');
        load(4,'F','H','V','W','Y');
        load(5,'K');
        load(8,'J','X');
        load(10,'Q','Z');
    }

    private final int score;

    Scrabble(String word) {
        int sum = 0;
        for (char c : word.toUpperCase().toCharArray()) {
            sum += VALUES.getOrDefault(c, 0);
        }
        this.score = sum;
    }

    int getScore() {
        return score;
    }

}
