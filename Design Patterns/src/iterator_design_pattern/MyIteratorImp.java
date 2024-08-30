package iterator_design_pattern;

import java.util.List;

public class MyIteratorImp implements MyIterator{

    int index = 0;
    int length;
    List<User>list;

    MyIteratorImp(List<User> list){
        this.list = list;
        this.length = list.size();
    }
    @Override
    public boolean hasNext() {
        if(index >= length)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        User user = list.get(index);
        index++;
        return user;
    }
}
