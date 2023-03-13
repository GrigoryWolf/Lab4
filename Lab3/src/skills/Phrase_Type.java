package skills;

public enum Phrase_Type {
    NORMAL("говорит"), RUMOUR("говорит слух"), QUESTION("задает вопрос");
    private final String type;

    Phrase_Type(String type) {
        this.type = type;
    }

    public String getPhraseType() {
        return type;
    }
}
