//import java.util.Scanner;
//import java.util.Map;
import java.util.Map.Entry;
//import java.util.HashMap;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.*;
//import java.utii.List.ArrayList;



public class SortPractice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        HashMap<String,Integer> fruits = new HashMap<String,Integer>();
        
        for(int i=0; i<line; i++){
            fruits.put(sc.next(),sc.nextInt());
        }
        System.out.println();
        List<Entry<String, Integer>> entries = new ArrayList<Entry<String, Integer>>(fruits.entrySet());

        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> a, Entry<String, Integer> b) {
                int num = a.getValue().compareTo(b.getValue());
            if(num == 0){
                    num = -1;
                }
                return num; 
            }
        });

        for (Entry<String, Integer> e : entries) {
            //System.out.println(e.hashCode());
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
