import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class DialingCodes {

    private Map<Integer, String> dialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return this.dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        this.dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (this.dialingCodes.containsKey(code) == false && this.dialingCodes.containsValue(country) == false) {
            this.dialingCodes.put(code, country);}
    }

    public Integer findDialingCode(String country) {
        for (Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (entry.getValue() == country) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (this.findDialingCode(country) != null) {
            dialingCodes.remove(this.findDialingCode(country));
            this.dialingCodes.put(code, country);
        }
    }
}
