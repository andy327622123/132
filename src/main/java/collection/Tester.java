package collection;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 3;


        ArrayList list = new ArrayList();
        list.add("Andy");
        list.add(123);





        //byte
        //Long
        //Short
        //Character
        //Integer


        list.add(true);
        Box1 box = new Box1();
        list.add(box);

        String name = (String) list.get(0);
        String kk = (String) list.get(1);


    }
}
