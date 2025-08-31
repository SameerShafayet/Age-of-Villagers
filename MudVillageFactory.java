public class MudVillageFactory implements VillageComponentFactory {
    @Override
    public HouseBuilder createHouseBuilder() {
        return new MudHouseBuilder();
    }

    @Override
    public Tree createTree() {
        Tree banana = new Tree("Banana");
        banana.add(new LeafShape(new Rectangle(1, 3, "Trunk")));
        banana.add(new LeafShape(new Rectangle(1, 2, "LargeLeaf1")));
        banana.add(new LeafShape(new Rectangle(1, 2, "LargeLeaf2")));
        banana.add(new LeafShape(new Circle(1, "BananaFruit")));
        return banana;
    }

    @Override
    public WaterSource createWaterSource() {
        WaterSource pond = new WaterSource("Pond");
        pond.add(new LeafShape(new Rectangle(3, 2, "PondBed")));
        pond.add(new LeafShape(new Rectangle(3, 1, "PondWater")));
        pond.add(new LeafShape(new Circle(1, "Duck")));
        return pond;
    }
}
