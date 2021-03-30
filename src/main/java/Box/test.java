package Box;

import java.util.Scanner;

public class test {
    public static void main (String[] args){


    Scanner scanner = new Scanner(System.in);

    int length;
    int width;
    int height;
    int price;
        System.out.println("please enter how lengtht:");
        length = Integer.parseInt(scanner.next());
        System.out.println("please enter how width:");
        width = Integer.parseInt(scanner.next());
        System.out.println("please enter how height:");
        height = Integer.parseInt(scanner.next());
        if (length <= 10 && width <=10 && height <=10){
            System.out.println("Box 3 it is, price : 60");
        }
        else if (length <= 20 && width <=20 && height <=20){
            System.out.println("Box 5 it is, price : 90");
        }


}

}
