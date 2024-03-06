package project.abomination;

public class Bear extends Exhibit {
    private static final Bear BEAR = new Bear();
    
    private Bear() {
        description = "Bear";
        
    }

    public static Bear getInstance() {
        return BEAR;
    }
}