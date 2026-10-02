package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SenderWithLargestWordCount {
    public static class Pair{
        String s;
        int val;
        Pair(String s,int val){
            this.s=s;
            this.val=val;
        }
    }
    public static String largestWordCount(String[] messages, String[] senders) {
        int[]messageCount=new int[messages.length];
        for(int i=0;i<messages.length;i++){
            String s=messages[i];
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    count++;
                }
            }
            messageCount[i]=count+1;
        }
        HashMap<String,Integer>map = new HashMap<>();
        for(int i=0;i<senders.length;i++){
            if(map.containsKey(senders[i])){
                map.put(senders[i],map.get(senders[i])+messageCount[i]);
            }
            else{
                map.put(senders[i],messageCount[i]);
            }

        }
        PriorityQueue<Pair>heap = new PriorityQueue<>((a,b)->{
            if(a.val!=b.val){
                return Integer.compare(b.val,a.val);
            }
            else{
                return b.s.compareTo(a.s);
            }
        });
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            heap.add(new Pair(entry.getKey(),entry.getValue()));
        }
        Pair x = heap.poll();
        return x.s;

    }
    public static void main(String[] args) {
        String[]messages = {"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"};
        String[]senders = {"Alice","userTwo","userThree","Alice"};
        System.out.println(largestWordCount(messages,senders));
    }
}
