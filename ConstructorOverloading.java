class Test {
    int a, b;
    double p, q, r;

    Test(int m, int n) {
        a = m;
        b = n;
        System.out.println("Sum of 2 int numbers = " + (a + b));
    }

    Test(double m, double n, double o) {
        p = m;
        q = n;
        r = o;
        System.out.println("Sum of 3 double numbers = " + (p + q + r));
    }
}

class ConstructorOverloading {
    public static void main(String[] args) {
        Test obj1 = new Test(6, 9);             
        Test obj2 = new Test(3.7, 1.5, 6.5);    
    }
}