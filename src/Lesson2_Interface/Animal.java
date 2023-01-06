package Lesson2_Interface;

public interface Animal {
    /*
     * Interface chỉ khai báo hàm, KHÔNG triển khai thân hàm.
     * Các class khi thực thi(implements) Interface, bắt buộc phải triển khai
        các p/thức được khai báo trong Interface
     * Các class thực thi Interface, đối tượng của class đó cũng được có
        kiểu của Interface: Bird/Cat/Dog đều là Animal.
     */
    public void an();
    public void keu();
    public void diChuyen();
}
