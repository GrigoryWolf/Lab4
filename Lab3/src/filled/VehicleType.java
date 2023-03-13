package filled;

public enum VehicleType {
    VAN("фургон"), CAR("машина"), MOTORCYCLE("мотоцикл"), TRUCK("грузовик"), BUS("автобус");
    private final String type;

    VehicleType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
