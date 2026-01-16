import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

class DnDCharacter {

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    int hitpoints;

    DnDCharacter() {
            for (int i = 0; i <= 6; i++) {
                int ability = this.ability(this.rollDice());
                switch (i) {
                    case 1: 
                        this.strength = ability;
                        break;
                    case 2: 
                        this.dexterity = ability;
                        break;
                    case 3:
                        this.constitution = ability;
                        break;
                    case 4:
                        this.intelligence = ability;
                        break;
                    case 5:
                        this.wisdom = ability;
                        break;
                    case 6:
                        this.charisma = ability;
                        break;
                    }
            }
            this.hitpoints = 10 + this.modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        return scores.stream()
                 .sorted(Comparator.reverseOrder())
                 .limit(3)
                 .mapToInt(Integer::intValue)
                 .sum();
    }

    List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();
        Random dice = new Random();
        for (int i = 0; i <= 3; i++) {
            scores.add(dice.nextInt(6)+1);
        }
        return scores;
    }

    int modifier(int input) {
        return Math.floorDiv((input - 10),2);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
