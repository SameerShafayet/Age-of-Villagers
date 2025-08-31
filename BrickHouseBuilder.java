public class BrickHouseBuilder implements HouseBuilder {
    private House house;

    public BrickHouseBuilder() {
        this.house = new House("Brick");
    }

    @Override
    public void buildFoundation() {
        house.add(new LeafShape(new Rectangle(6, 2, "ConcreteFoundation")));
    }

    @Override
    public void buildWalls() {
        house.add(new LeafShape(new Rectangle(6, 5, "BrickWalls")));
        // windows
        house.add(new LeafShape(new Rectangle(1, 1, "Window")));
    }

    @Override
    public void buildRoof() {
        house.add(new LeafShape(new Triangle(6, 2, "GableRoof")));
    }

    @Override
    public House getHouse() {
        return house;
    }
}
