package objectclass.bag;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> objects= new ArrayList<>();
    private Object cursor;

    public void putItem(Object item){
        objects.add(item);
    }

    public boolean isEmpty(){
        return objects.isEmpty();
    }

    public int size(){
        return objects.size();
    }

    public void beforeFirst(){
        cursor =objects.get(0);
    }

    public boolean hasNext(){
        if(cursor.equals(objects.get(objects.size()-1))){
            return false;
        }
        return true;
    }

    public Object next(){
        if(hasNext()){
        cursor =objects.get(objects.indexOf(cursor)+1);
        return this;
        }
        return null;
    }

    public boolean contains(Object item){
        return objects.contains(item);
    }

    public int getCursor(){
        return objects.indexOf(cursor);
    }
}

