package observer;

public class CarOs implements OS{
    private String color;

    public void lastUpdate(){
        System.out.println(color);
    }

    public void printLastUpdate(){
        System.out.println(color);
    }
    @Override
    public void update(String color) {
        if(!this.color.equals(color)){
            setColor(color);
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}
