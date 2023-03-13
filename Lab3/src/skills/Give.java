package skills;

import creature.Creature;
import subject.Subject;

public class Give {
    public static void skill(Creature who_giving , Creature who_getting, Subject subject){
        System.out.println(who_giving.getName() + " даёт " + subject.getName() + " персонажу " + who_getting.getName());
    }
}
