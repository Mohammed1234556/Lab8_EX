import java.util.Scanner;

/**
 * Created by Arabic on 08/03/22.
 */
public class Test {
    public static void main(String[] args) {
        DoublyLinkedList<String > n=new DoublyLinkedList<>();
        Scanner input=new Scanner(System.in);
        int cho=-1;
        System.out.println("1 add First 2 add Last 3 remov First 4 remov Last");
        while (cho!=0){
            System.out.printf("enter number the choues");
            cho=input.nextInt();
            switch (cho){
                case 1:
                    System.out.printf("input Name ");
                    n.addFirst(input.next());
                    break;
                case 2:
                    System.out.printf("input Name ");
                    n.addLast(input.next());
                    break;
                case 3:
                    System.out.println("remov number");

                    System.out.println(n.removeFirst());
                    break;
                case 4:
                    System.out.println("remov number");

                    System.out.println(n.removeLast());
                    break;
            }
            System.out.println(n.first());
            System.out.println(n.last());
            System.out.println(n.size()+"");
        }
    }
}
