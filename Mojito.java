import java.util.ArrayList;
import java.util.List;

public class Mojito extends Cocktail {
    public Mojito(int prix, ArrayList<String> list){
        super(8, new ArrayList<String>() {
            {
                add("rhum");
                add("citron vert");
                add("eau gazeuse");
                add("menthe");
                add("sucre");
            }
        });
        

        


    }
    
}
