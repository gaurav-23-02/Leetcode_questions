package hashmap;

import linked_list.implementation;

import java.util.LinkedList;

public class implementaion {
    static class MyHashMap<K, V>{
        public static final int DEFAULT_CAPACITY =4;
        public static final float DEFAULT_LOAD_FACTOR= 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//the number of entries in map
        private LinkedList<Node>[] buckets ;
        private void intBucketLists(int N){
            buckets = new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        private int HashFun(K key){
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }
        public int size(){
            return 0;

        }
        public void put(K key, V value){
            int bi =HashFun(key);

        }
//        public V get(K key){
//
//        }
//        public V remove(K key){
//
//        }
    }
    public static void main(String[] args) {
        MyHashMap<String , Integer> mp =new MyHashMap<>();
        MyHashMap<String,String> mp2 = new MyHashMap<>();
    }
}
