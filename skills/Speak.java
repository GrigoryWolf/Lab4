package skills;

import creature.Creature;

public class Speak {
    public static void skill(Creature speaker, Phrase_Type phrase_type, String phrase){
        System.out.println(speaker.getName()+" "+phrase_type.getPhraseType()+" "+phrase);
    }
    public static void skill(Creature speaker, Creature listener, Phrase_Type phrase_type, String phrase){
        System.out.println(speaker.getName()+" "+phrase_type.getPhraseType()+" персонажу "+listener.getName()+" "+phrase);
    }
    public static void skill(Phrase_Type phrase_type, String phrase){
        System.out.println("Кто-то "+phrase_type.getPhraseType()+" "+phrase);
    }
}
