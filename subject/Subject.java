package subject;

import Exception.NameException;
import static Exception.NameException.namecheck;

public abstract class Subject {
    private String name;
    public Subject(String name) throws NameException{
       this.name = name;
       namecheck(name);
    }
    public String getName(){
        return name;
    }
}
