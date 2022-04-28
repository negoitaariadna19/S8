package observer;

public class main {
    public static void main(String[] args) {
        OS car1 = new CarOs();
        OS car2 = new CarOs();
        UpdateServer updateServer = new UpdateServer("Update nou");
        updateServer.addObserver(car1);
        updateServer.addObserver(car2);

        updateServer.pushUpdates();
    }
}
