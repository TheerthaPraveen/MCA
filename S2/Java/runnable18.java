import java.util.*;

class fibinocci implements Runnable {
    int n;
    fibinocci(int limit) {
        n = limit;
    }

    public void run() {
        int a = 0, b = 1, c;
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci: " + a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}

class even implements Runnable {
    int start, end;
    even(int a, int b) {
        this.start = a;
        this.end = b;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
        }
    }
}

public class runnable18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fibonacci range: ");
        int n = sc.nextInt();
        System.out.print("Enter the start range of even: ");
        int start = sc.nextInt();
        System.out.print("Enter the end range of even number: ");
        int end = sc.nextInt();

        Thread f = new Thread(new fibinocci(n));
        Thread e = new Thread(new even(start, end));

        f.start();
        e.start();
    }
}
