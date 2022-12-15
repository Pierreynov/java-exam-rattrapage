import java.util.ArrayList;
import java.util.List;

public class Margarita extends Cocktail {
    public Margarita(int prix, ArrayList<String> list){
        super(6, new ArrayList<String>() {
            {
                add("tequila");
                add("triple sec");
                add("jus de citron vert");
            }
        });
        

        


    }
    
}
