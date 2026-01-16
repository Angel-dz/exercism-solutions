import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        HashSet a = new HashSet(myCollection);
        HashSet b = new HashSet(theirCollection);
        a.removeAll(theirCollection);
        b.removeAll(myCollection);
        return !(a.isEmpty() || b.isEmpty());
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) return Set.of();
        Set<String> commonCards = new HashSet<>(collections.get(0));
        for (Set<String> collection : collections) {
            commonCards.retainAll(collection);
        }
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        HashSet completeCollection = new HashSet();
        for (Set<String> collection : collections) {
            for (String card : collection)
                completeCollection.add(card);
        }
        return completeCollection;
    }
}
