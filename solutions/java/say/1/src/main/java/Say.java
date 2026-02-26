public class Say {

    private static final String[] BELOW_20 = {
        "", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen",
        "nineteen"
    };

    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public String say(long num) {
        if (num == 0) return "zero";
        if (num < 0) throw new IllegalArgumentException();
        if (num > 999_999_999_999L) throw new IllegalArgumentException();

        StringBuilder result = new StringBuilder();

        if (num >= 1_000_000_000) {
            result.append(convertLessThanThousand((int)(num / 1_000_000_000)))
                  .append(" billion ");
            num %= 1_000_000_000;
        }

        if (num >= 1_000_000) {
            result.append(convertLessThanThousand((int)(num / 1_000_000)))
                  .append(" million ");
            num %= 1_000_000;
        }

        if (num >= 1_000) {
            result.append(convertLessThanThousand((int)(num / 1_000)))
                  .append(" thousand ");
            num %= 1_000;
        }

        if (num > 0) {
            result.append(convertLessThanThousand((int) num));
        }

        return result.toString().trim();
    }
    
    private static String convertLessThanThousand(int num) {
        StringBuilder sb = new StringBuilder();

        if (num >= 100) {
            sb.append(BELOW_20[num / 100]).append(" hundred");
            num %= 100;
            if (num > 0) sb.append(" ");
        }

        if (num >= 20) {
            sb.append(TENS[num / 10]);
            if (num % 10 != 0) {
                sb.append("-").append(BELOW_20[num % 10]);
            }
        } else if (num > 0) {
            sb.append(BELOW_20[num]);
        }

        return sb.toString();
    }
}
