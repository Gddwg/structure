package demo4;
/**
 * @author Administrator
 */
public class IQueue<T> {
    private Object[] queueElem;
    private int front;
    private int rear;

    public IQueue(int size) {
        this.queueElem = new Object[size];
    }

    public void offer(T x) throws Exception {
        if ((rear + 1) % queueElem.length == front) {
            throw new Exception("队列已满");
        } else {
            queueElem[rear] = x;
            rear = (rear + 1) % queueElem.length;
        }
    }

    public T poll() throws Exception {
        if (rear == front) {
            throw new Exception("队列空");
        } else {
            T x = (T) queueElem[front];
            front = (front + 1) % queueElem.length;
            return x;
        }
    }



}
