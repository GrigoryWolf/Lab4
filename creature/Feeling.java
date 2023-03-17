package creature;

public enum Feeling {
    NETURAL("ничего"), HAPPY("счастье"), SAD("печаль"), FEAR("страх"), ANGRY("злость"), DISGUST("отвращение");
    private final String feeling;

    Feeling(String feeling) {
        this.feeling = feeling;
    }

    public String getFeeling() {
        return feeling;
    }
}
