package skills;
import filled.*;
import creature.person.Person;
public class PutOut{
    public static void skill(Person person, Filled filled) {
        System.out.println(person.getName() + " достаёт из " + filled.getName() + " " + filled.getFilling());
    }
}
