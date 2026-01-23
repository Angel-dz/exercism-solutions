import java.util.HashMap;
import java.lang.StringBuilder;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        if (dnaStrand.isEmpty()) {return "";}
        HashMap<String, String> complementations = new HashMap<>();
        complementations.put("G","C");
        complementations.put("C","G");
        complementations.put("T","A");
        complementations.put("A","U");

        StringBuilder rnaStrand = new StringBuilder();
        
        for (String nucleotid : dnaStrand.split("")) {
            rnaStrand.append(complementations.get(nucleotid));
        }
        return rnaStrand.toString();
    }
}
