import java.util.*;

public class  Order {
    public List<Cocktail> CocktailList;
    public int TotalPrice;
    public Order(){
        List<Cocktail> CocktailList = new ArrayList<Cocktail>();
        TotalPrice = 0 ;
    }

    public int getTotalPrice (){
        return TotalPrice;
    }

    public void setTotalPrice(int prix){
        this.TotalPrice = prix ;
    }

    public List<Cocktail> getCocktailList (){
        return CocktailList;
    }

    public void setCocktailList(List<Cocktail> liste){
        this.CocktailList = liste ;
    }

    public void AddCoktail(Cocktail coc){
        CocktailList.add(coc);
        TotalPrice += coc.Price;
    }
}
