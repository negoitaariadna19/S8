package observer;

public class CarOs implements OS{
private String lastUpdate;

    @Override
    public void update() {

    }
    public void setLastUpdate()
    {
        System.out.println("Updateuri");
    }
    public void printLastUpdate()
    {
        System.out.println("update");
    }


}
