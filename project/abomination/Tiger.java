package project.abomination;

public class Tiger extends Exhibit {
    private static final Tiger TIGER = new Tiger();
    
    private Tiger() {
        description = "********************Tiger Exhibit Schedule******************\n";
        
    }

    public static Tiger getInstance() {
        return TIGER;
    }
}