import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Age of Villagers!");
        System.out.println("Choose a village combination:");
        System.out.println("1. Brick house + Mango tree + Swimming pool");
        System.out.println("2. Mud house + Banana tree + Pond");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        VillageComponentFactory factory;
        String villageName;

        if (choice == 1) {
            factory = new BrickVillageFactory();
            villageName = "BrickVillage_Combo1";
        } else if (choice == 2) {
            factory = new MudVillageFactory();
            villageName = "MudVillage_Combo2";
        } else {
            System.out.println("Invalid choice. Defaulting to option 1.");
            factory = new BrickVillageFactory();
            villageName = "BrickVillage_Combo1";
        }

        // Build the chosen village
        Village village = buildVillage(villageName, factory);
        System.out.println("\n--- Your Chosen Village ---");
        village.display("");

        scanner.close();
    }

    // Director-like helper: uses Abstract Factory and Builder to assemble components.
    private static Village buildVillage(String villageName, VillageComponentFactory factory) {
        Village village = new Village(villageName);

        // Build house using builder (Builder pattern)
        HouseBuilder builder = factory.createHouseBuilder();
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
        House house = builder.getHouse();

        // Get tree and water source from factory (Abstract Factory)
        Tree tree = factory.createTree();
        WaterSource water = factory.createWaterSource();

        // Add to village (Composite)
        village.addElement(house);
        village.addElement(tree);
        village.addElement(water);
        return village;
    }
}