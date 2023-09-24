package ru.geekbrains.lesson4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class hashMapGB {


    static class hashMap{
        private HashMap<Integer, Object> hashmap = new HashMap<>();
        private static final Object obj = new Object();

        public void add(int elem){
            hashmap.put(elem, obj);
        }

        private void toString(HashMap<Integer, Object> hashmap) {
            for (Integer key: hashmap.keySet()) {
                System.out.println(hashmap.get(key));
            }
        }

        public void getId(int id){

            ArrayList<Integer> temp = new ArrayList<>();
            for (int elem: hashmap.keySet()) {
                temp.add(elem);
            }
            if(id > -1 && id < temp.size()){
                System.out.println(temp.get(id));
            }
            else {
                System.out.println("out of bounse");
            }
        }
    }


    public class MyHashMap<K,V>{
        private static final int INITIAL_CAPACITY = 16;
        private Entry<K, V>[] table;
        private int size;

        static class Entry<K,V> implements Map.Entry<K,V> {
            private final K key;
            private V value;
            private Entry<K,V> next;

            Entry(K key, V value){
                this.key = key;
                this.value = value;
                this.next = null;
            }

            @Override
            public K getKey() {
                return key;
            }

            @Override
            public V getValue() {
                return value;
            }

            @Override
            public V setValue(V value) {
                V oldvalue = this.value;
                this.value = value;
                return oldvalue;
            }
        }
        public MyHashMap(){
            table = new Entry[INITIAL_CAPACITY];
            size = 0;
        }
    }



    public static void main(String[] args) {
        hashMap example = new hashMap();
        example.add(1);
        example.add(15);
        System.out.println(example.toString());
    }
}
