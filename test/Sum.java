import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();

        List<Integer> nums = new ArrayList<Integer>();

        for (int i=0;i<x;i++) {
            nums.add(sc.nextInt());
        }
        System.out.println(nums);

        List<Integer> modifiedNums = nums.stream()
                .filter(n -> n>= 5)
                .collect(Collectors.toList());
        System.out.println(modifiedNums);

        int sum = 0;
        for (int num : modifiedNums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
