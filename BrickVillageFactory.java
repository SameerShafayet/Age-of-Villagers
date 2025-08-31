public class BrickVillageFactory implements VillageComponentFactory {
    @Override
    public HouseBuilder createHouseBuilder() {
        return new BrickHouseBuilder();
    }

    @Override
    public Tree createTree() {
        Tree mango = new Tree("Mango");
        mango.add(new LeafShape(new Rectangle(1, 3, "Trunk")));
        // leaves as circles
        mango.add(new LeafShape(new Circle(2, "LeafCluster1")));
        mango.add(new LeafShape(new Circle(2, "LeafCluster2")));
        // fruit
        mango.add(new LeafShape(new Circle(1, "MangoFruit")));
        return mango;
    }

    @Override
    public WaterSource createWaterSource() {
        WaterSource pool = new WaterSource("Swimming Pool");
        pool.add(new LeafShape(new Rectangle(4, 2, "PoolBase")));
        pool.add(new LeafShape(new Rectangle(4, 1, "PoolWater")));
        return pool;
    }
}
