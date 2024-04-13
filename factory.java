import java.util.*;
interface Furniture{
    int getPrice();
}
class Table implements Furniture{
    public int getPrice(){
        System.out.println("the price of table furniture is:");
        return 50000;
    }
}
class Chair implements Furniture{
    public int getPrice(){
        System.out.println("the price of chair furniture is:");
        return 20000;
    }
}
class Bed implements Furniture{
    public int getPrice(){
        System.out.println("the price of bed furniture is:");
        return 90000;
    }
}
public class customer{
   public static void main(String[] args){
        System.out.println("To find out the price of furniture enter any of the below string:1 Table,2 Chair, 3 Bed");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        switch(a){
            case "table":Furniture cs1=customerfactory.getfurniture("table");
                      int price1=cs1.getPrice();
                      System.out.println(price1);
                      break;
            case "chair":Furniture cs2=customerfactory.getfurniture("chair");
                      int price2=cs2.getPrice();
                      System.out.println(price2); 
                      break;
            case "bed":Furniture cs3=customerfactory.getfurniture("bed");
                      int price3=cs3.getPrice();
                      System.out.println(price3);  
                      break;
        }
    }
}
class customerfactory{
    public static Furniture getfurniture(String FType){
        if(FType.trim().equalsIgnoreCase("table")){
            return new Table();
        }
        else if(FType.trim().equalsIgnoreCase("chair")){
            return new Chair();
        }
        else if(FType.trim().equalsIgnoreCase("bed")){
            return new Bed();
        }
        else{
            return null;
        }
        
    }
}
