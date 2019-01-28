import LinkList.CircleSingleLinkList;
import LinkList.ReverseSingleLinkList;
import Structure.SingleLinkList;

public class Main {

    public static void main(String[] args) {

        SingleLinkList v1 = new SingleLinkList(1);
        SingleLinkList v2 = new SingleLinkList(2);
        SingleLinkList v3 = new SingleLinkList(3);
        SingleLinkList v4 = new SingleLinkList(4);
        SingleLinkList v5 = new SingleLinkList(5);
        SingleLinkList v6 = new SingleLinkList(6);
        SingleLinkList v7 = new SingleLinkList(7);
        v1.setNext(v2);
        v2.setNext(v3);
        v3.setNext(v4);
        v4.setNext(v5);
        v5.setNext(v6);
        v6.setNext(v7);
        //v7.setNext(v6);

//        boolean result = CircleSingleLinkList.hasCircle(v1);
//        int length = CircleSingleLinkList.CircleLength(v1);
//        System.out.println(result);
//        System.out.println("length is " + length);

        SingleLinkList reversedValue = ReverseSingleLinkList.Reverse(v1);
        while (reversedValue.getNext() != null){
            System.out.println(" " + reversedValue.getValue());
            v1 = v1.getNext();
        }
    }
}
