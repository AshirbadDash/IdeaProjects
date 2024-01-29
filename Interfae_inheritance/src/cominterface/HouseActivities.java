package cominterface;

public interface HouseActivities {

    abstract  void makeFood();
    abstract  void cleanHouse();
    abstract  void washClothes();
}

 interface  classroom{
    abstract void study();
    abstract void practice();
    abstract void sleep();
    abstract void repeat();

}
class room implements HouseActivities{

    @Override
    public void makeFood() {
        System.out.println("Room is making food");
    }

    @Override
    public void cleanHouse() {
        System.out.println("Room is cleaning house");
    }

    @Override
    public void washClothes() {
        System.out.println("Room is washing clothes");
    }


}
class kitchen extends room{

    @Override
    public void makeFood() {
        System.out.println("Kitchen is making food");
    }

    @Override
    public void cleanHouse() {
        System.out.println("Kitchen is cleaning house");
    }

    @Override
    public void washClothes() {
        System.out.println("Kitchen is washing clothes");
    }
}
class bathroom extends HouseActivities,classroom{

}