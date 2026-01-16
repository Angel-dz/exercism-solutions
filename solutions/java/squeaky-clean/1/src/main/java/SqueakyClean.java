import java.util.Map;
import java.util.HashMap;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        Map leetSpeak = Map.of('4','a', '3','e', '0','o', '1','l', '7','t');
        
        for (int i = 0; i <= identifier.length() - 1; i++) {
            if (Character.isSpace(identifier.charAt(i))) {
                result.append('_');
            } else if (identifier.charAt(i) == '-') {
                result.append(Character.toUpperCase(identifier.charAt(i+1)));
                i++;
            } else if (leetSpeak.containsKey(identifier.charAt(i))) {
                result.append(leetSpeak.get(identifier.charAt(i)));
            } else if (Character.isAlphabetic(identifier.charAt(i)) == false) {
                
            } else {
                result.append(identifier.charAt(i));
            }
        }
      return result.toString();  
    }
}
