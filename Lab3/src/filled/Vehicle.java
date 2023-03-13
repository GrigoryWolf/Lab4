package filled;

import creature.Creature;
import subject.Subject;
import Exception.NameException;
import java.util.ArrayList;

public class Vehicle extends Filled {
    private String color;
    private VehicleType type;
    private int fuel_reserve;
    private ArrayList<Creature> passangers;
    private int fuel_consumption;

    public Vehicle(String name, ArrayList<Subject> filling, ArrayList<Creature> passangers, String color, VehicleType type, int fuel_reserve, int fuel_consumption) throws NameException {
        super(name, filling);
        this.color = color;
        this.type = type;
        this.fuel_reserve = fuel_reserve;
        this.passangers = passangers;
        this.fuel_consumption = fuel_consumption;
    }
    public String getColor() {
        return color;
    }

    public String getType() {
        return type.getType();
    }

    public String getPassanges() {
        String local = "";
        for (int i = 0; i < passangers.size(); i++) {
            if (i == 0) {
                local += passangers.get(i).getName();
            } else {
                local += ", " + passangers.get(i).getName();
            }
        }
        return local;
    }
    public class Engine{
        public int getFuel(){
            return fuel_reserve;
        }
        public void setFuel(int fuel){
            fuel_reserve = fuel;
        }
        public int getFuelConsumption(){
            return fuel_consumption;
        }
        public boolean canRide() {
            return fuel_reserve > 0 ? true : false;
        }
    }
    public Engine engine = new Engine();
}

