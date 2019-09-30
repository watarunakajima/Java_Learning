import java.util.Scanner;

public class Olympic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int end = sc.nextInt();

        int year;
        for(int i = 0; i < 32; i++){
            year = 1896 + 4 * i;
            //System.out.println(year);
            if( (year >= start) && (year <= end)){
                if( ((i != 6) && (i != 12)) && (i != 13)){
                    System.out.printf("第%02d回 %4d年\n",i+1,year);
                }
            }
        }


        sc.close();
    }
}
