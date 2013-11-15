package edu.cmu.courses.simplemr.mapreduce;

public class Pair<K, V> implements Comparable<Pair> {
    private K key;
    private V value;

    public Pair(K key, V value){
        setKey(key);
        setValue(value);
    }

    public void setKey(K key){
        this.key = key;
    }

    public void setValue(V value){
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    @Override
    public int compareTo(Pair o) {
        if(key.hashCode() == o.getKey().hashCode()){
            return value.hashCode() - o.getValue().hashCode();
        }
        return key.hashCode() - o.getKey().hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Pair){
            return key.equals(((Pair) o).getKey()) && value.equals(((Pair) o).getValue());
        }
        return false;
    }
}