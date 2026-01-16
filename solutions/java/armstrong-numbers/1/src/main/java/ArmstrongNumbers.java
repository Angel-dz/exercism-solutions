class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] digits = Integer.toString(numberToCheck).toCharArray();
        int sum = 0;
        
        for(char character : digits) {
            int digit = character - '0';
            sum += Math.pow(digit, digits.length);
        }
        return sum == numberToCheck;
    }

}
