import java.util.ArrayList;
import java.util.List;

public class PinaColada extends Cocktail {
    public PinaColada(int prix, ArrayList<String> list){
        super(7, new ArrayList<String>() {
            {
                add("rhum blanc");
                add("rhum ambré");
                add("jus d'ananas");
                add("lait de coco");
            }
        });
    }
}