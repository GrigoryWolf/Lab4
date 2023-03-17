import Exception.AgeException;
import creature.Creature;
import creature.Feeling;
import filled.*;
import subject.*;
import creature.person.*;
import place.*;
import skills.*;
import Exception.NameException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws AgeException, NameException {
        Creature goat= new Creature("Козлик", 4) {
            @Override
            public int getAge() {
                return (int) (super.getAge()*4.4);
            }
        };
        Town sankomarik = new Town("Сан-Комарик", "котороый стоит на первом месте по количеству безработных", 123, 24);
        Street deadlock = new Street("Дрянингский тупичок", 123, 1, sankomarik);
        Street garbage = new Street("Мусорный тупичок", "заполненный макаронными автофургонами", 123, 12, sankomarik);
        Street ghetto = new Street("Трущобная улица", "заполненный макаронными автофургонами", 123, 53, sankomarik);
        Street hotel = new Street("двор гостинницы Дрянинга", 234, 23, sankomarik);

        ArrayList<Street> way = new ArrayList<>();
        way.add(garbage);
        way.add(ghetto);
        way.add(hotel);

        Food sausages = new Food("сосиски");
        Food bread = new Food("хлеб");
        Furniture table = new Furniture("деревянный стол");
        Furniture sit1 = new Furniture("первый стул");
        Furniture sit2 = new Furniture("второй стул");
        Item jornal = new Item("Макаронный журнал");

        ArrayList<Subject> first_van_filling = new ArrayList<>();
        first_van_filling.add(sausages);
        first_van_filling.add(bread);

        ArrayList<Subject> second_van_filling = new ArrayList<>();
        second_van_filling.add(table);
        second_van_filling.add(sit1);
        second_van_filling.add(sit2);

        ArrayList<Subject> manager_bag_filling = new ArrayList<>();
        manager_bag_filling.add(jornal);

        ArrayList<Subject> motorcycle_filling = new ArrayList<>();

        Person sausage_man = new Person("Сосисочник", Health.NORMAL, 45, false);
        Person scooperfield = new Person("Скуперфильд", Health.NORMAL, 68, false);
        Person manager = new Person("Управляющий", Health.NORMAL, 43, false);
        Person driver = new Person("Шофёр", Health.NORMAL, 23, false);
        Person legless_carl = new Person("Карл", Health.LEGLESS, 54, true);
        Person george = new Person("Гришка", Health.WEAK, 18, false);
        Person ann = new Person("Анюта", Health.NORMAL, -2, true);
        Person arnold = new Person("Арнольд", Health.NORMAL, 18, true);
        Person weak_henry = new Person("Генри", Health.WEAK, 38, true);
        Person cook_Jane = new Person("Повариха Джейн", Health.WEAK, 45, false);
        Person dontknowguy = new Person("Нейзнайка", Health.NORMAL, 12, true);

        ArrayList<Creature> first_van_passangers = new ArrayList<>();
        first_van_passangers.add(sausage_man);
        ArrayList<Creature> second_van_passangers = new ArrayList<>();
        second_van_passangers.add(driver);
        second_van_passangers.add(scooperfield);
        second_van_passangers.add(manager);
        ArrayList<Creature> motorcycle_passangers = new ArrayList<>();
        motorcycle_passangers.add(george);
        ArrayList<Person> line = new ArrayList<>();
        line.add(legless_carl);
        line.add(george);
        line.add(ann);
        line.add(arnold);
        line.add(weak_henry);
        line.add(dontknowguy);
        ArrayList<Creature> house_guests = new ArrayList<>();
        house_guests.add(legless_carl);
        house_guests.add(cook_Jane);
        house_guests.add(ann);
        Street.House carl_house = new Street.House(house_guests, "Черный");
        Vehicle first_van = new Vehicle("Первый", first_van_filling, first_van_passangers, "оранжевый", VehicleType.VAN, 1000,  1);
        Vehicle second_van = new Vehicle("Второй", second_van_filling, second_van_passangers, "оранжевый", VehicleType.VAN, 40, 1);
        Vehicle motorcycle = new Vehicle("Классный", motorcycle_filling, motorcycle_passangers, "чёрный", VehicleType.MOTORCYCLE, 12, 2);
        Bag manager_bag = new Bag("рюкзак", manager_bag_filling);


        Feel.skill(goat, Feeling.SAD, "произошло");
        Feel.skill(goat, Feeling.HAPPY, "прошло некоторое время");
        Speak.skill(Phrase_Type.RUMOUR, "завтра приедет богач Скуперфильд, который будет набирать рабочих для своей макаронной фабрики");
        Feel.skill(deadlock, Feeling.HAPPY, "многие снова получили надежду");
        Speak.skill(Phrase_Type.RUMOUR, "Скуперфильд решил увеличить выпуск макаронных изделий, и поэтому ему понадобитесь больше рабочих, ведь "+sankomarik.getName()+" "+" город "+sankomarik.getDescription());
        Ride.skill(127, VehicleType.BUS, way);
        Ride.skill(first_van, way);
        Ride.skill(second_van, way);
        Ride.skill(motorcycle, way);
        GetOut.skill(first_van);
        GetOut.skill(second_van);
        GetOut.skill(motorcycle);
        PutOut.skill(sausage_man, first_van);
        PutOut.skill(driver, second_van);
        PutOut.skill(manager, manager_bag);
        GetOut.skill(carl_house);
        Speak.skill(Phrase_Type.NORMAL, "что Скуперфильд возьмет за сосиски их двойную стоимость с первой зарплаты коротышек");
        Hire.skill(scooperfield, line, cook_Jane, manager);
        Speak.skill(scooperfield, dontknowguy, Phrase_Type.QUESTION, "а не тот ли он Нейзнайка");
    }
}