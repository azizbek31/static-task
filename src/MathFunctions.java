public class MathFunctions {
    static double pi;
    static double e;

    public MathFunctions(double num1, double num2) {
        pi = num1;
        e = num2;
    }

    public void circleSurface(int radius){
        System.out.println(pi * Math.pow(radius, 2));
    }

    public void power(int num){
        System.out.println(Math.pow(e, num));
    }

    public void triangleSurface(int a, int b, int c){
        int p = (a + b + c) / 2;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
