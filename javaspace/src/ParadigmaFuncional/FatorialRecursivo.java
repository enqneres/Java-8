package ParadigmaFuncional;

public class FatorialRecursivo {
    public static long fatorial(final long num){
        if (num <= 1) {
            return 1;
        }else {
            return fatorial(num - 1) * num;
        }
    }
    public static void main(String[] args) {
        System.out.println("Fatorial = " + fatorial(10));
    }
}
