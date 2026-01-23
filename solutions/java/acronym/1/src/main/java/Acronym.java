import java.lang.StringBuilder;

class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder sr = new StringBuilder();
        String[] sa = this.phrase.split("[^\\p{L}']+");
        for (String word : sa) {
            sr.append(word.toUpperCase().charAt(0));
        }
        return sr.toString();
    }

}
