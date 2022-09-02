package IntList;

public class SquareTest {
    public static void main(String[] args) {
        IntList myList = IntList.of(0, 3, 1, 4, 2, 5);
        IntList myList1 = IntList.of(0, 1, 2, 3);
        IntList.evenodd(myList);
        System.out.println(myList);

    }
}
