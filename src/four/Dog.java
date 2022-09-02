package four;

import edu.princeton.cs.algs4.In;

import java.util.Collections;
import java.util.Comparator;

public class Dog implements Comparator<Dog> {
    private String name;
    private int size;

    public Dog(String n, int s) {
        name = n;
        size = s;
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }

//    @Override
    public int compareTo(Dog o ) {        //也就是继承了后面的东西，然后使用
        if (this.size < o.size) {
            return -1;
        } else if (this.size == o.size) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Dog abc = new Dog("0", 1);
        Dog abc1 = new Dog("1", 1);
        Dog abc2 = new Dog("2", 1);
        Dog[] dogs = {abc, abc1};
        In in = new In();


    }

    @Override
    public int compare(Dog o1, Dog o2) {
        return 0;
    }

//    @Override
//    public int compare(Dog o1, Dog o2) {
//        return 1;
//    }
}
class MaxMiner{
    public static OurComparable max(OurComparable[] items) {
        int maxvalue = 0;
        for (int i = 1; i < items.length; i++) {
            if (items[maxvalue].compareTo(items[i])>1) {
                maxvalue = i;
            }
        }
        return items[maxvalue];
    }
}

