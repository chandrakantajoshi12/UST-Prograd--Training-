
public class Calculator {
    public double sum(int a, int b) {
        return  a+b;
    }

    public double sub(int a, int b) {
        return  a-b;
    }

    public double multi(int a, int b) {
        return a*b;
    }

    public double div(int a, int b) {
        if (b == 0) {
            throw  new ArithmeticException("can not divided  by zero");
        }
        return a/b;
    }
}

