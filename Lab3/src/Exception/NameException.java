package Exception;

public class NameException extends Exception{
    public NameException(){
        super("Ошибка: name is null");
    }
    public static void namecheck(String name) throws NameException {
        if(name == null) {throw new NameException();}
    }
}
