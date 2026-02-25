import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class ProteinTranslator {

    private static final Map<String, String> CODON_TABLE = Map.ofEntries(
        Map.entry("AUG", "Methionine"),
        Map.entry("UUU", "Phenylalanine"),
        Map.entry("UUC", "Phenylalanine"),
        Map.entry("UUA", "Leucine"),
        Map.entry("UUG", "Leucine"),
        Map.entry("UCU", "Serine"),
        Map.entry("UCC", "Serine"),
        Map.entry("UCA", "Serine"),
        Map.entry("UCG", "Serine"),
        Map.entry("UAU", "Tyrosine"),
        Map.entry("UAC", "Tyrosine"),
        Map.entry("UGU", "Cysteine"),
        Map.entry("UGC", "Cysteine"),
        Map.entry("UGG", "Tryptophan"),
        Map.entry("UAA", "STOP"),
        Map.entry("UAG", "STOP"),
        Map.entry("UGA", "STOP")
        );

    List<String> translate(String rnaSequence) {
        List<String> proteins = new ArrayList<>();
        int index = 0;
        String translation = null;

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

        if (index < rnaSequence.length()) {
            throw new IllegalArgumentException("Invalid codon");
        }

        return proteins;
    }
}
