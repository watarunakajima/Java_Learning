import java.util.Scanner;
import java.util.Map;
import java.util.HashMap.Entry;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;


public class Sort_Practice{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        HashMap<String,Integer> fruits = new HashMap<String,Integer>();
        
        for(int i=0; i<line; i++){
            fruits.put(sc.next(),sc.nextInt());
        }

        List<Entry<String, Integer>> entries = new ArrayList<Entry<String, Integer>>(fruits.entrySet());

        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> a, Entry<String, Integer> b) {
                return a.getValue().compareTo(b.getValue()); 
            }
        });

        for (Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
