class Generics4b<T>{

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private T value;

    @Override
    public String toString() {
        return "Pair = {" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        Generics4b<String> pair = new Generics4b<>();
        pair.setKey("1");
        pair.setValue("Hello");
        System.out.println(pair);
    }
}