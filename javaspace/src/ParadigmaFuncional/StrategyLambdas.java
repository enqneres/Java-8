package ParadigmaFuncional;
interface Strategy{
    double apply(double a, double b);
};

public class StrategyLambdas {
    public static double execute(double a, double b, Strategy strategy){
        return strategy.apply(a,b);
    }

    public static void main(String[] args) {
        System.out.println(execute(5,6, (a,b) -> a > b ? a : b));
        System.out.println(execute(5,6, (a,b) -> a < b ? a : b));
        System.out.println(execute(5,6, (a,b) -> (a + b) / 2));
    }
}
