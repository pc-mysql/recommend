package randomizedtest;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    @Test
    public void  testThreeAddThreeRemove() {
        BuggyAList<Integer> objectBuggyAList = new BuggyAList<Integer>();

        for (int i=0;i<4;i++) {
            objectBuggyAList.addLast(i);
        }
        for (int i=0;i<4;i++) {
            objectBuggyAList.removeLast();
        }
        assertEquals(objectBuggyAList,objectBuggyAList);
    }


    @Test
    public void testfour() {
        AListNoResizing<Integer> L = new AListNoResizing<>();

        int N = 500;
        for (int i = 0; i < N; i += 1) {
-            int operationNumber = StdRandom.uniform(0, 2);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                System.out.println("size: " + size);
            }
        }
    }

}
