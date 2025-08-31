public class MudHouseBuilder implements HouseBuilder {
    private House house;

    public MudHouseBuilder() {
        this.house = new House("Mud");
    }

    @Override
    public void buildFoundation() {
        house.add(new LeafShape(new Rectangle(5, 1, "StoneFoundation")));
    }

    @Override
    public void buildWalls() {
        house.add(new LeafShape(new Rectangle(5, 4, "MudWalls")));
        house.add(new LeafShape(new Rectangle(1, 1, "SmallWindow")));
    }

    @Override
    public void buildRoof() {
        house.add(new LeafShape(new Triangle(5, 2, "ThatchedRoof")));
    }

    @Override
    public House getHouse() {
        return house;
    }
}
