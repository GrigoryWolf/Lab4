package skills;
import creature.person.Person;
import subject.Food;
import java.util.ArrayList;
import Exception.NameException;
public class Hire{
    public static void skill(Person employer, Person employee){
        if(employer.equals(employee)){
            System.out.println(employer.getName()+" не может нанять сам себя");
        }
        else if(!employee.isHereToBeHired()){System.out.println(employee.getName()+" не собирается работать. Видимо попал в очередь случайно ");}
        else{
            System.out.println(employer.getName() + " осматривает коротышку " + employee.getName() + ". Возраст: " + employee.getAge()+ " Состояние здоровья: "+ employee.getType());
            String answer = employee.isWorkable() ? "" : " не";
            System.out.println(employee.getName() + answer+" принят(а) на работу");
        }
    }
    public static void skill(Person employer, ArrayList<Person> employes) {
        System.out.println(employer.getName() + " начинает отбор кандидатов");
        for (Person employe : employes) {
            skill(employer, employe);
        }
        System.out.println(employer.getName() + " заканчивает отбор кандидатов");
    }

    public static void skill(Person employer, ArrayList<Person> employes, Person cook, Person manager) throws NameException {
        System.out.println(employer.getName() + " начинает отбор кандидатов");
        for (Person employe : employes) {
            skill(employer, employe);
            if (Math.random() > 0.7)
                Speak.skill(employer, employe, Phrase_Type.QUESTION, "какие у него мысли и настроения");
            Give.skill(cook, employe, new Food("сосиска"));
            System.out.println(manager.getName() + " занес персонажа " + employe.getName() + " в список и берет с него расписку, что тот получил сосиску");
        }
        System.out.println(employer.getName() + " заканчивает отбор кандидатов");
    }
}
