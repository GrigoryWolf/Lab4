package place;

import Exception.NameException;
import interfaces.Placeable;
import static Exception.NameException.namecheck;

public class Town implements Placeable {
    private String name;
    private String description;
    private int x;
    private int y;
    public Town(String name, String description, int x, int y) throws NameException {
        this.name=name;
        namecheck(name);
        this.description=description;
        this.x=x;
        this.y=y;
    }
    public Town(String name, int x, int y){
        this.name=name;
        this.description = "";
        this.x=x;
        this.y=y;
    }
    public String getName(){
        return name;}
    public String getDescription(){
        return description;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}


