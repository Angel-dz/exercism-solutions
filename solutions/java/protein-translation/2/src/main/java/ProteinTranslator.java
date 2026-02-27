import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

class ProteinTranslator {

    private static final Map<String, String> CODON_TABLE = new HashMap<>();

    private static void load(String protein, String... codons) {
        for (String codon : codons) {
            CODON_TABLE.put(codon, protein);
        }
    }

    static {
        load("Methionine", "AUG");
        load("Phenylalanine", "UUU", "UUC");
        load("Leucine", "UUA", "UUG");
        load("Serine", "UCU", "UCC", "UCA", "UCG");
        load("Tyrosine", "UAU", "UAC");
        load("Cysteine", "UGU", "UGC");
        load("Tryptophan", "UGG");
        load("STOP", "UAA", "UAG", "UGA");
    }

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
        int index = 0;
        String translation = "";

        while (index + 3 <= rnaSequence.length()) {
            String codon = rnaSequence.substring(index, index + 3);
            translation = CODON_TABLE.get(codon);

            if (translation == null) {
                throw new IllegalArgumentException("Invalid codon");
            }

            if (translation.equals("STOP")) {
                return proteins;
            }

            proteins.add(translation);
            index += 3;
        }

        if (!translation.equals("STOP") && index < rnaSequence.length()) {
            throw new IllegalArgumentException("Invalid codon");
        }

        return proteins;
    }
}
