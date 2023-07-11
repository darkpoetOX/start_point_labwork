import java.util.ArrayList;
import java.util.List;

public class ShoppingTrolley {

    List<String> list = new ArrayList<>();

    public ShoppingTrolley(){
        this.list = list;
    }

    public void addItem(String item){
        list.add(item);
    }

    public int countItem(){
        return list.size();
    }

    public boolean itemExists(String item){
        return list.contains(item); //the 'contains' method is from the List package and checks if an item exists in list
    }
}
