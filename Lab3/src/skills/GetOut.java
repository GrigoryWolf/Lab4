package skills;
import creature.Creature;
import filled.Vehicle;
import place.Street;

public class GetOut{
    public static void skill(Vehicle vehicle){
        System.out.println("Из транспорта " + vehicle.getName() + " " + vehicle.getColor() + " " + vehicle.getType() + " выходит(-ят) " + vehicle.getPassanges());
    }
    public static void skill(Street.House house){
        class Key{

            public boolean isWorking(){
                return Math.random() > 0.2;
            }
        }
        Key key = new Key();
        System.out.println("Гости " + house.toString() + " пробуют открыть дверь ключом" );
        while (!key.isWorking()) System.out.println("Гости потерпели неудачу в открытии дома. Гости пробуют ещё раз ");
        System.out.println("Гости открыли дверь");
        String s = house.toString() + " покинул(и) ";
        for(Creature creature : house.getGuests()) {
            s += creature.getName() + " ";
        }
        System.out.println(s);
    }
}
