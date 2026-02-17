public class PangramChecker {

    public boolean isPangram(String input) {
    if (input == null) {
        return false;
    }

    boolean[] seen = new boolean[26];
    int count = 0;

    for (char c : input.toLowerCase().toCharArray()) {
        if (c >= 'a' && c <= 'z') {
            int index = c - 'a';
            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }
    }

    return count == 26;
}
}
