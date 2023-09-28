package demo3;

/**
 * @author Administrator
 */
public class SqStack<R> {
    private R[] elementData;
    private int top;

    public SqStack(int size) {
        this.elementData = (R[]) new Object[size];
        top = 0;
    }

    public R pop(){
        if(top == 0){
            return null;
        }
        return elementData[--top];
    }

    public void push(R data){
        if(top == this.elementData.length){
            throw new IndexOutOfBoundsException("栈已满");
        }
        this.elementData[top] = data;
        top++;
    }

    public void display() {
        for (int i = top - 1; i >= 0; i--){
            System.out.print(this.elementData[i].toString() + " ");
        }
        System.out.println();
    }

    public R getTop(){
        if(top == 0){
            return null;
        }
        int index = top - 1;
        return elementData[index];
    }
}
