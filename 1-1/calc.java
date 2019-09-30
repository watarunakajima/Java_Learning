import java.io.*;
import java.util.Scanner;
class calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        String ope;

        a   = sc.nextInt();//
        ope = sc.next();
        b   = sc.nextInt();//


        if(ope.equals("+")){
            a+=b;
        }else if(ope.equals("-")){
            a-=b;
        }else if(ope.equals("*")){
            a*=b;
        }else if(ope.equals("/")){
            a/=b;
        }
        System.out.println("ope=("+ope+")");
        System.out.println(a);

        sc.close();
    }
}