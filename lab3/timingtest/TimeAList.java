package timingtest;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        int[] ints = new int[]{1000,2000,4000,8000,16000,32000,64000,128000};
        AList<Integer> Ns = new AList<>();
        AList<Double> time = new AList<>();
        AList<Integer> opCounts = new AList<>();

        for (int anInt : ints) {
            Stopwatch sw = new Stopwatch();
            opCounts.addLast(anInt);
            Ns.addLast(anInt);
            AList<Integer> temp  = new AList<>();
            for (int i = 0; i < anInt; i++) {
                temp.addLast(0);
            }
            double v = sw.elapsedTime();
            time.addLast(v);
        }
        TimeAList.printTimingTable(Ns,time,opCounts);
        // TODO: YOUR CODE HERE
    }
}
