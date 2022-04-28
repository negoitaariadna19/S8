package observer;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer {
    private String updatePackage;
    private List<OS> observers;

    public UpdateServer(String updatePackage) {
        this.updatePackage = updatePackage;
        this.observers = new ArrayList<>();
    }

    public void addObserver(OS os){
        observers.add(os);
    }

    public void delObserver(OS os){
        observers.remove(os);
    }


    public void pushUpdates(){
        for (OS os: observers) {
            os.update(updatePackage);
        }
    }

}
