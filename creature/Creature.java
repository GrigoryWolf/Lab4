package creature;

import interfaces.Ageable;

import java.util.Objects;

import static Exception.NameException.namecheck;
import static Exception.AgeException.*;
import Exception.NameException;

public abstract class Creature implements Ageable {
    private String name;
    private int age;
    private Feeling feeling;

    public Creature(String name, int age, Feeling feeling) throws NameException {
        this.name = name;
        namecheck(name);
        this.age = age;
        try{agecheck(age);}
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Давай подождем " + age*-1 +" лет?");
            System.out.println("Прошло "+ age*-1 + " лет. С Днем Рождения!!!");
            this.age=0;
        }
        this.feeling = feeling;
    }
    public Creature(String name, int age) throws NameException {
        this.name = name;
        namecheck(name);
        this.age = age;
        try{agecheck(age);}
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Давай подождем " + age*-1 +" лет?");
            System.out.println("Прошло "+ age*-1 + " лет. С Днем Рождения!!!");
            this.age=0;
        }
        this.feeling = Feeling.NETURAL;

    }
    public String getName(){return name;}
    public int getAge(){
        return age;
    }
    public void setFeeling(Feeling new_feeling){
        this.feeling = new_feeling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return age == creature.age && name.equals(creature.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


