package project.abomination;

public class Lion extends Exhibit {
    private static final Lion LION = new Lion();
    
    private Lion() {
        description = "********************Lion Exhibit Schedule******************";
        
    }

    public static Lion getInstance() {
        return LION;
    }
}