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

        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
        Box b = boxes.get(0);


    }
}
