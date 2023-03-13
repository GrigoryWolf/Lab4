package Exception;

import java.io.IOException;

public class AgeException extends IOException {
    public AgeException(){
        super("Ошибка возраста: Персонаж ещё не родился");
    }
    public static void agecheck(int age) throws AgeException {
        if(age<0) throw new AgeException();
    }
}
