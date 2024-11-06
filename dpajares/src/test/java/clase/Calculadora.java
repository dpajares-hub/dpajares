package clase;

public class Calculadora {
    // ... otros métodos ...

    public long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
