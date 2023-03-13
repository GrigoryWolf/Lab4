package skills;
import filled.Vehicle;
import filled.VehicleType;
import place.Street;
import place.Town;
import java.util.ArrayList;

public class Ride{
    public static void skill(Vehicle vehicle, ArrayList<Street> way){
        String move;
        int distance;
        int previous_x = 0;
        int previous_y = 0;
        for(int i = 0; i < way.size(); i++){
            if(!vehicle.engine.canRide()){
                System.out.println(vehicle.getName()+" "+vehicle.getColor()+" "+vehicle.getType()+ " остановился по причине нехватки топлива. "+ vehicle.getPassanges() + " дотолкал(-и) транспорт до локации "+ way.get(way.size()-1).getName());
                break;
            }
            if(i==0){move = " начал движение в локации ";}
            else if(i == way.size()){move = " остановился в локации ";}
            else{move = " проезжает локацию ";}
            System.out.println(vehicle.getName()+" "+vehicle.getColor()+" "+vehicle.getType()+ move + way.get(i).getName()+"("+ way.get(i).getX() + ", "+ way.get(i).getY() + ") в городе "+way.get(i).getTown()+" "+way.get(i).getDescription());
            distance = Math.toIntExact(Math.round(Math.pow(Math.pow(way.get(i).getX() - previous_x, 2) + Math.pow(way.get(i).getY() - previous_y, 2), 0.5)*0.1));
            vehicle.engine.setFuel(vehicle.engine.getFuel() - distance * vehicle.engine.getFuelConsumption());
            previous_x = way.get(i).getX();
            previous_y = way.get(i).getY();

        }
    }
    public static void skill(int number_of_vehicles, VehicleType vehicleType, ArrayList<Street> way){
        String answer = "Транспортные средства типа "+vehicleType.getType()+" в количестве "+number_of_vehicles+" проехали по маршруту: ";
        for(int i = 0; i < way.size(); i++){
            answer += way.get(i).getName() + (i != way.size()-1 ?", ":"");
        }
        System.out.println(answer);
    }
    public static void skill(Vehicle vehicle, Town place){
        System.out.println(vehicle.getColor()+" "+vehicle.getName()+" "+vehicle.getType()+ " приехал в "+ place.getName());
    }
}

