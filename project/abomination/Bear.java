package project.abomination;

public class Bear extends Exhibit {
     static Bear BEAR = new Bear();
    
    private Bear() {
        description = "********************Bear Exhibit Schedule******************";
        this.exhibit = null;
    }

    public static Bear getInstance() {
        return BEAR;
    }
}