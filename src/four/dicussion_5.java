package four;

public class dicussion_5 {
    public static void main(String[] args) {
        A1 y = new B1();
        B1 z = new B1();
        System.out.println(z.fish(z));
        System.out.println(y.fish(y));
        System.out.println(z.fish(z) == y.fish(z));
    }
}
class A1 {
    int fish(A1 other) {
        return 1;
    }

    int fish(B1 other) {
        return 2;
    }
}

class B1 extends A1 {
    @Override
    int fish(B1 other) {
        return 3;
    }
}
