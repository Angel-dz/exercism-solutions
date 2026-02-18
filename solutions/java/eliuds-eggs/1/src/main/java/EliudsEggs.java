public class EliudsEggs {
    public int eggCount(int number) {
        int count = 0;
        
        while (number >= 1) {
            if (number % 2 != 0) {
                count++; 
            }
            number = number / 2;
        }
        return count;
    }
}
