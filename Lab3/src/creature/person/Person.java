package creature.person;
import Exception.*;
import creature.Creature;
import creature.Feeling;
public class Person extends Creature {
    private Health type;
    private boolean isHereToBeHired;
    public Person(String name, Health type, Feeling feeling, int age, boolean isHereToBeHired) throws NameException {
        super(name,age,feeling);
        this.type = type;
        this.isHereToBeHired = isHereToBeHired;
    }
    public Person(String name, Health type, int age, boolean isHereToBeHired) throws NameException {
        super(name,age);
        this.type = type;
        this.isHereToBeHired = isHereToBeHired;
        }
    public String getType(){
        return type.getType();
    }
    public boolean isHereToBeHired(){
        return isHereToBeHired;
    }
    public boolean isWorkable(){
        if (getAge() <= 80 & getAge() >= 18 & type == Health.NORMAL){
            return true;
        }
        else{
            return false;
        }
    }
}
