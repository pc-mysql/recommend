package IntList;

import java.security.acl.LastOwnerException;
import java.util.HashMap;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** Returns the ith item of this IntList. */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    /** Method to return a string representation of an IntList */
    @Override
    public String toString() {
        if (rest == null) {
            // Converts an Integer to a String!
            return String.valueOf(first);
        } else {
            return first + " -> " + rest.toString();
        }
    }

    /**
     * Method to create an IntList from an argument list.
     * You don't have to understand this code. We have it here
     * because it's convenient with testing. It's used like this:
     *
     * IntList myList = IntList.of(1, 2, 3, 4, 5);
     * will create an IntList 1 -> 2 -> 3 -> 4 -> 5 -> null.
     *
     * You can pass in any number of arguments to IntList.of and it will work:
     * IntList mySmallerList = IntList.of(1, 4, 9);
     */
    public static IntList of(int ...argList) {
        if (argList.length == 0) {
            return null;
        }
        int[] restList = new int[argList.length - 1];
        System.arraycopy(argList, 1, restList, 0, argList.length - 1);
        return new IntList(argList[0], IntList.of(restList));
    }

    public void dSquareList(IntList L) {

    }


    public static IntList dcatenate(IntList A, IntList B) {
        //TODO:  fill in method
        //dcatenate() method modifies the original IntList A  ----> destructive method
        //return value : An IntList containing element of A followed by element of B
        if(A == null){
            return B;
        }
        IntList temp = A;
        while(temp.rest != null){
            temp = temp.rest;
        }
        temp.rest = B;
        return A;
    }

    public static IntList catenate(IntList A, IntList B) {
        //TODO:  fill in method
        //catenate() method does not modify the original IntList A ----> Non-destructive method
        //return value :  An IntList containing element of A followed by element of B
        if(A == null){
            return B;
        }
        IntList intList = new IntList(A.first,null);
        IntList temp = intList;
        IntList temp1 = B;
        while (temp1.rest != null) {
            temp = temp.rest;
            intList.rest = new IntList(temp.first, null);
            intList = intList.rest;
        }
        temp.rest = temp1;
        return temp;

    }

    public void insert(int x, int position) {
        IntList intList = this,pre=null;
        while (position-- > 0) {
            pre = intList;
            intList = intList.rest;
            if (intList == null) {
                break;
            }
        }
        pre.rest = new IntList(x,null);
        pre.rest.rest = intList;
    }

    public static void evenodd(IntList lst) {
        if (lst.rest == null || lst.rest.rest==null) { //如果不存在三个以上的树
            return;
        }
        IntList head1=lst.rest;
        IntList even = lst.rest;
        while (even.rest != null && even.rest.rest != null) {   //因为even本身就是走在前面的，所以可以互相指引，而不需要继续走了
            even.rest = even.rest.rest;
            head1 = head1.rest.rest;
            even = even.rest;

        }


        lst.rest = head1;

//        odd.rest = head.rest;

    }
}
