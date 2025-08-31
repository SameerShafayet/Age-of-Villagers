public class WaterSource extends CompositeComponent {
    private final String waterType;

    public WaterSource(String waterType) {
        super("WaterSource (" + waterType + ")");
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }
}
