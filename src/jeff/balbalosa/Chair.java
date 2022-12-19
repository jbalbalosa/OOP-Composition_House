package jeff.balbalosa;

public class Chair {

    String type;

    String material;
    boolean withArm;
    boolean isReclaining;

    public Chair(String type, String material, boolean withArm, boolean isReclaining) {
        this.type = type;
        this.material = material;
        this.withArm = withArm;
        this.isReclaining = isReclaining;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isWithArm() {
        return withArm;
    }

    public boolean isReclaining() {
        return isReclaining;
    }
}
