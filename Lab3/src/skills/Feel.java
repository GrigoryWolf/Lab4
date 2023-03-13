package skills;

import creature.Creature;
import creature.Feeling;
import place.Town;
public class Feel {
    public static void skill(Creature creature, Feeling feeling, String reason) {
        creature.setFeeling(feeling);
        System.out.println(creature.getName() + " чувствует " + feeling.getFeeling() + " из-за того, что " + reason);
        }
    public static void skill(Creature creature, Feeling feeling) {
        creature.setFeeling(feeling);
        System.out.println(creature.getName() + " чувствует " + feeling.getFeeling());
    }
    public static void skill(Town inhabitants, Feeling feeling) {
        System.out.println("Все обитатели " + inhabitants.getName() + " чувствуют " + feeling.getFeeling());
    }
    public static void skill(Town inhabitants, Feeling feeling, String reason) {
        System.out.println("Все обитатели " + inhabitants.getName() + " чувствуют " + feeling.getFeeling() + " из-за того, что " + reason);
    }
}



