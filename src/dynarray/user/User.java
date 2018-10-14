package dynarray.user;

import dynarray.DynList;

public class User {

    public static void main(String[] args) {
        
        DynList dynArray1 = new DynList();
        DynList dynArray2 = new DynList(100);
        
        dynArray2.add(2);
        dynArray2.add(5);
        
        DynList dynArray3 = new DynList(dynArray2);
    }
}
