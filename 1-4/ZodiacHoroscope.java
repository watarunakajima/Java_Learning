import java.util.Scanner;

public class ZodiacHoroscope{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int birthday = sc.nextInt();
        int yyyymmdd = sc.nextInt();
        
        sc.close();

        String zodiac = DetZodiac(birthday/10000);
        int fortune = DetFortune(birthday/10000,yyyymmdd);

        System.out.println(zodiac+"年のあなたの"+yyyymmdd/10000+"年"+yyyymmdd%10000/100+"月"+yyyymmdd%100+"日"+"の運勢は10段階中"+fortune+"です．");
        
    }
    public static String DetZodiac(int birthyear){
        String zodiac = "干支";
        switch (birthyear%12) {
            case 0:
                zodiac = "申";
                break;

            case 1:
                zodiac = "酉";
                break;

            case 2:
                zodiac = "戌";
                break;

            case 3:
                zodiac = "亥";
                break;

            case 4:
                zodiac = "子";
                break;

            case 5:
                zodiac = "丑";
                break;

            case 6:
                zodiac = "寅";
                break;

            case 7:
                zodiac = "卯";
                break;

            case 8:
                zodiac = "辰";
                break;

            case 9:
                zodiac = "巳";
                break;

            case 10:
                zodiac = "午";
                break;

            case 11:
                zodiac = "未";
                break;
            
            default:
                System.out.println("干支エラー");
                break;
        }
        return zodiac;
    
    }

    public static int DetFortune(int birthyear,int yyyymmdd){
        int x = birthyear * yyyymmdd % 10;
        return x+1;
    }
}
