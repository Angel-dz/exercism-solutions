public class GameMaster {

    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod travelMethod) {
        if (travelMethod.name() == "HORSEBACK" ) {
            return "You're traveling to your destination on horseback.";
        } else if (travelMethod.name() == "WALKING") {
            return "You're traveling to your destination by walking.";
        } else return "";
        
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return this.describe(character) + " " + this.describe(travelMethod) + " " + this.describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return this.describe(character) + " You're traveling to your destination by walking. " + this.describe(destination);
    }
}
