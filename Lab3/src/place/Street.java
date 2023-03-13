package place;

import creature.Creature;
import Exception.NameException;
import java.util.ArrayList;

public class Street extends Town{
    private Town town;
    public Street(String name, String description, int x, int y, Town town) throws NameException {
        super(name, description, x, y);
        this.town = town;
    }
    public Street(String name, int x, int y, Town town){
        super(name, x, y);
        this.town = town;
    }
    public String getTown(){
        return town.getName();
    }
    public static class House{
        private ArrayList<Creature> guests;
        private Street street;
        private String color;
        public House(ArrayList<Creature> guests, Street street, String color){
            this.guests = guests;
            this.street = street;
            this.color = color;
        }
        @Override
        public String toString(){
            return color + " дом на улице " + street.getName();
        }
        public ArrayList<Creature> getGuests(){
            return guests;
        }
        public String getColor(){
            return color;
        }
    }
}
