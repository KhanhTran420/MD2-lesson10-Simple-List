import java.util.Arrays;

public class MyList<E> {
    // các thuộc tính
    // size: xác định các phần tử trong danh sách mặc định gán là 0;
    // DEFAULT_CAPACITY : lưu số phần tử tối đa trong danh sách mặc định là 10
    // mảng đối tượng elements chứa các phần tử trong danh sách

    // các Phương thức:
    //           Phương thức khởi tạo không tham số
    //           Phương thức thêm 1 phần tử ms vào danh sách: add()
    //           Phương thức thay đổi phần tử tối đa trong danh sách: ensureCapa()
    //           Phương thức truy cập 1 phần tử trong danh sách get()
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    // Tăng gấp đôi kích thước mảng chứa phần tử
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    //Cài đặt phương thức add()
    // Mục đích: thêm phàn tử vào cuối danh sách
    // Tham số đầu vào: Phần tử cần thêm vào danh sách

    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    // Cài đặt phương thức get() trả về phần tử vị trí thứ i trong danh sách
    // tham số đầu vào: Số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách

    public E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", size" + i);
        }
        return (E) elements[i];
    }
}
