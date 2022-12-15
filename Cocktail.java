import java.util.*;

public class Cocktail {
    public int Price;
    public List<String> IngredientList;

    public Cocktail(int prix, List<String> liste){
        this.Price = prix;
        this.IngredientList = liste;
    }

    public int getPrice(){
        return Price;
    }

    public void setPrice(int price){
        this.Price = price;
    }

    public List<String> getIngredientList(){
        return IngredientList;
    }

    public void setIngredientList(List<String> list){
        this.IngredientList = list;
    }
}
