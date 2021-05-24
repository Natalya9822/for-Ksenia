package FuncInterfaces;

import java.util.function.Predicate;

interface NewInterface{
    double calculate(int x);
}

class LambdaDemo{
    public static void main(String[] args) {
        NewInterface ni = x -> (double) x/2;
        NewInterface ni1 = (x) -> 2*x;

        System.out.println(ni.calculate(9));
        System.out.println(ni1.calculate(10));

        Predicate<String> pr = x -> x.length() > 10;
        System.out.println(pr.test("Java"));
    }
}