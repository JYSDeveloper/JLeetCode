package Structure;

public class SingleLinkList<T> {
    private T value;
    private SingleLinkList next;

    public SingleLinkList(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SingleLinkList getNext() {
        return next;
    }

    public void setNext(SingleLinkList next) {
        this.next = next;
    }
}
