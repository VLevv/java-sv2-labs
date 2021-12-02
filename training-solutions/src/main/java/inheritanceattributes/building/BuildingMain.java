package inheritanceattributes.building;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("Ház",400,2);
        SchoolBuilding schoolBuilding = new SchoolBuilding(3);
        System.out.println(building.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
