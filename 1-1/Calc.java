import java.util.Scanner;

class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        String ope;

        a = sc.nextInt();//
        ope = sc.next();
        b = sc.nextInt();//


        switch (ope) {
            case "+":
                a += b;
                break;
            case "-":
                a -= b;
                break;
            case "*":
                a *= b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0で割ることはできません");
                }
                a /= b;
                break;
        }
        System.out.println("ope=(" + ope + ")");
        System.out.println(a);

        sc.close();
    }
}
