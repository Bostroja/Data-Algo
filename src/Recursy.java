public class Recursy {
    static long ops;
    /** Recursive loop
     *
     */
    static void loop(int i, int max){
        if (i > max) return;
        System.out.print(i+ " ");
        loop(i+1, max);
    }

    /**
     * Fibonacci
     * vilket är det n:te talet i sekvensen
     */
    static int fib(int n){
        ops++;
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    static long[] fibCache = new long[1000];
    static long fastFib(int n){
        ops++;
        if (n <= 1) return n;
        if (fibCache[n] != 0) return fibCache[n];
        long ret = fastFib(n-1) + fib(n-2);
        fibCache[n] = ret;
        return ret;
    }


}
