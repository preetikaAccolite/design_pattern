class Government{
    private static Government instance;
    private Government(){
        
    }
    public static Government getInstance(){
        if(instance==null){
            instance=new Government();
        }
        return instance;
    }
    public void manageEconomy(){
        System.out.println("government is responsible for managing the economy");
    }
     public void managejustice(){
        System.out.println("government is responsible for managing the judicial system");
    }
}
public class singleton{
    public static void main(String args[]){
        Government g=Government.getInstance();
        g.manageEconomy();
        g.managejustice();
    }
}
