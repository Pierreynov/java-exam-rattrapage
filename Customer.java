import java.util.*;
import java.io.*;

public class Customer {
    public int Budget ;
    public Order MyOrder ;
    public List<Cocktail> FavoriteOrder;
    public Customer (int budget,List<Cocktail> l){
        Order MyOrder = new Order();
        this.FavoriteOrder = l;
    }

    public int getBudget (){
        return Budget;
    }

    public void setBudget(int budget){
        this.Budget = budget;
    }

    public Order getMyOrder(){
        return MyOrder;
    }

    public void setMyOrder(Order ex){
        this.MyOrder = ex ;
    }

    public List<Cocktail> getFavoriteOrder(){
        return FavoriteOrder;
    }

    public void setFavoriteOrder(List<Cocktail> l){
        this.FavoriteOrder = l ;
    }

    public void BestOrder(){
        int x= 0 ;
        for(int i=0; i< FavoriteOrder.size(); i++){
            x += FavoriteOrder.get(i).Price;
        }

        if (x <= this.Budget){
            MyOrder.CocktailList = FavoriteOrder;
            MyOrder.TotalPrice = x;
            System.out.println(" Bonsoir, je voudrais commander les cocktails suivants s'il vous plait : ");
            for (int i=0 ; i < this.MyOrder.CocktailList.size(); i++){
                System.out.println(((Object)this).getClass().getSimpleName());
            }
            System.out.println(".");

        }
    }

    public void Pay(){
        if (this.Budget - this.MyOrder.TotalPrice < 0){
            System.out.println("Vous n'avez pas assez d'argent pour payer, vous êtes exclu du bar.");
        }
        else {
            this.Budget -= this.MyOrder.TotalPrice;
            MyOrder.CocktailList.clear();
            MyOrder.TotalPrice = 0 ;
        }
        
    }



}
