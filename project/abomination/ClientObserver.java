package project.abomination;

import java.util.ArrayList;
import project.abomination.Administration.EnumDec;
import project.abomination.Administration.EnumExhibit;

public class ClientObserver {

    public Lion lion = new Lion();
    public Tiger tiger = new Tiger();
    public Bear bear = new Bear();

    public ArrayList<Exhibit> exhibits = new ArrayList<Exhibit>();


    public ClientObserver(Administration zooAdmin) {
        exhibits.add(new Bear());
        exhibits.add(new Lion());
        exhibits.add(new Bear());

        this.zooAdmin = zooAdmin;
        zooAdmin.registerObserver(this);
    }



}
