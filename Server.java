public class Server {
    public String Name;
    public Server (String n){

    }

    public String getName(){
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public void ProcessOrder(Customer client){
        if(new java.util.Random().nextInt(5)==0){ 
            System.out.println("C'est pour la maison.");
            client.MyOrder.CocktailList.clear();
            client.MyOrder.TotalPrice = 0 ;

         }
        
        
        System.out.println("Serveur : Voici votre commande : ");
        for (int i=0 ; i < client.MyOrder.CocktailList.size(); i++){
            System.out.println(((Object)client).getClass().getSimpleName());
        }
        System.out.printf(".Cela fera %d euros s'il vous plaît.\n", client.MyOrder.TotalPrice);
        client.MyOrder.CocktailList.clear();
        client.MyOrder.TotalPrice = 0 ;

    }
}
