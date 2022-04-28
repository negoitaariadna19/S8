package observer;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer {
    private String updatePackage;
    private List<OS> listObserver;

    public UpdateServer(String updatePackage) {
        this.updatePackage = updatePackage;
        this.listObserver=new ArrayList<>();
    }

    public void addObs(UpdateServer updateServer)
    {
listObserver.add((OS) updateServer);
    }
    public void delObs(UpdateServer updateServer)
    {
listObserver.add((OS) updateServer);
    }
    public void pushUpdates()
    {
        //parcurge lista si seteaza info pe fiecare obiect
for(OS os: listObserver)
{
//    os.update();
    System.out.println(os);
}

    }
}
