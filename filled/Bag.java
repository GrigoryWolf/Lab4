package filled;

import subject.Subject;
import Exception.NameException;
import java.util.ArrayList;

public class Bag extends Filled {
    public Bag(String name, ArrayList<Subject> filling) throws NameException {
        super(name, filling);
    }
}
