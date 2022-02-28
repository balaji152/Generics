public class Generics4a <K, V>{

    private K key;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    private V value;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }



    @Override
    public String toString() {
        return "Pair = " + key + value ;
    }

    public static void main(String[] args) {
        Generics4a <String, java.util.Date> pair = new Generics4a<>();
        pair.setKey("Today is ");
        pair.setValue(new java.util.Date());
        System.out.println(pair);
    }
}