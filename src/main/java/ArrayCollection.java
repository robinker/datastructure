public class ArrayCollection implements Collection {
    private Object[] elementData;
    private int size;

    public ArrayCollection(int c){
        this.elementData = new Object[c];
        this.size = 0;
    }

    public void add(Object element) {
        if(element == null)
            throw new IllegalArgumentException();
        elementData[size++] = element;
    }

    public void remove(Object element) {
        int i = indexOf(element);
        if(i != -1){
            elementData[i] = elementData[--size];
            elementData[size] = null;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    public int size() {
        return this.size;
    }

    private int indexOf(Object element){
        for(int i = 0; i < size; i ++){
            if(elementData[i].equals(element))
                return i;
        }
        return -1;
    }
}
