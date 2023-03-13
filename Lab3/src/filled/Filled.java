package filled;

import subject.Subject;

import java.util.ArrayList;
import Exception.NameException;

public abstract class Filled extends Subject {
    private  ArrayList<Subject> filling;
    public Filled(String name, ArrayList<Subject> filling) throws NameException {
        super(name);
        this.filling = filling;
    }
    public String getFilling(){
        String local = "";
        for(int i = 0; i < filling.size(); i++){
            if(i == 0){
            local += filling.get(i).getName() ;}
            else{local += ", " + filling.get(i).getName() ;}

        }
        return local;
    }
}
