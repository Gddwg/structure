package demo1;


public class SqList<R> {
    private R[] ElementData;
    private int len;

    public SqList(int len) {
        this.len = 0;
        this.ElementData = (R[]) new Object[len];
    }

    public void insert(int index,R data) throws Exception {
        if(this.len == this.ElementData.length){
            throw new Exception("表满了");
        }else if(index >= 0 && index < ElementData.length){
            for (int i = ElementData.length - 1; i > index; i--) {
                ElementData[i] = ElementData[i - 1];
            }
            ElementData[index] = data;
            len++;
            return;
        }
        throw new IndexOutOfBoundsException("索引越界");
    }

    public int getFirstIndex(R data){
        for (int i = 0; i < len; i++) {
            if(ElementData[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    public boolean remove(int index){
        if(index >= 0 && index < ElementData.length){
            for (int i = index; i < ElementData.length - 1; i++) {
                ElementData[i] = ElementData[i + 1];
            }
            ElementData[ElementData.length - 1] = null;
            len--;
        }
        return false;
    }

    public R set(int index,R data){
        // TODO 修改
        ElementData[index] = data;
        return null;
    }

    public int size() {
        return len;
    }

    public void add(R data) {
        if(this.len == this.ElementData.length){
            try {
                throw new Exception("表满了");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            ElementData[len] = data;
            len++;
            System.out.println(len);
        }
    }

    public R get(int index){
        return ElementData[index];
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sb.append(ElementData[i]);
            if(i != len -1){
                sb.append(",");
            }
        }
        return "SqList{"+ sb + '}';
    }
}
