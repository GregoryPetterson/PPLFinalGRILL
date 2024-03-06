package project.abomination;

public class Bear extends Exhibit {
    private static final Bear BEAR = new Bear();
    
    private Bear() {
        description = "********************Bear Exhibit Schedule******************";
        
    }

    public static Bear getInstance() {
        return BEAR;
    }
}