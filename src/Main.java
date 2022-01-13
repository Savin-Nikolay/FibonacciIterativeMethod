public class Main {

    private static int fib(int n){
        int last = 0; //fib(0)
        int next = 1; //fib(1)
        for (int i = 0; i < n; i++){
            int oldLast = last;
            last = next;
            next = oldLast + last;
        }
        return last;

    }

    public static void main(String[] args) {
        System.out.println(fib(20));
        System.out.println(fib(40));
    }
}
