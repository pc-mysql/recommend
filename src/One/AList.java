package One;

/** Array based list.
 *  @author Josh Hug
 */

//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5

/* Invariants:
 addLast: The next item we want to add, will go into position size
 getLast: The item we want to return is in position size - 1
 size: The number of items in the list should be size.
*/

public class AList {

    public static void main(String[] args) {
        AList aList = new AList();
        for (int i = 0; i < 10000; i++) {
            aList.addLast(10);
        }
    }
    private int[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = new int[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (size == items.length-1) {
            int[] a = new int[items.length + 1];
            System.arraycopy(items, 0, a, 0, items.length);
            items = a;
            size += 1;
            items[size] = x;
        }
        else{
        items[size] = x;
        size = size + 1;}
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        int x = getLast();
        size = size - 1;
        return x;
    }
    public static int[] insert(int[] arr, int item, int position) {
        int temp[];
        temp = new int[arr.length + 1];
        System.arraycopy(arr,0,temp,0,position);
        temp[position] = item;
        System.arraycopy(arr,0,temp,0,position);
        return temp;
    }


} 