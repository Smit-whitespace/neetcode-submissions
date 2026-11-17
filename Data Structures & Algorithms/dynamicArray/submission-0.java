class DynamicArray {

    private ArrayList<Integer> arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity=capacity;
        this.arr= new ArrayList<>(capacity);
        this.size=0;
    }

    public int get(int i) {
        return arr.get(i);
    }

    public void set(int i, int n) {
        arr.set(i,n);
    }

    public void pushback(int n) {
        if (size==capacity)
        {    resize();}
        arr.add(n);
        size++;
    }

    public int popback() {
        int val =arr.remove(size - 1);
        size--;
        return val;
    }

    private void resize() {
        capacity *= 2;
        ArrayList<Integer> newArr = new ArrayList<>(capacity);
        newArr.addAll(arr);
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
