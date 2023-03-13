package creature.person;

public enum Health {
    LAME("хромой"), LEGLESS("безногий"), ARMLESS("безрукий") ,WEAK("больной"), SICK("слабосильный"), NORMAL("нормальный");
    private final String type;

    Health(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
