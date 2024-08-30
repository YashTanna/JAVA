package iterator_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagemant {

    private ArrayList<User> list = new ArrayList<>();

    public void addUser(User u){
        list.add(u);
    }

    public User getUser(int index){
        return list.get(index);
    }

    public MyIterator getIterator(){
        return new MyIteratorImp(list);
    }

}
