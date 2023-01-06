package Lesson2_Interface;

public class MainClass {
    public static void main(String[] args) {
//        Animal c; // Khai báo biến c có kiểu Cat
//        c = new Cat(); // Khởi tạo đối tượng Cat và gán vào biến c

        Animal c = new Cat();
        Animal d = new Dog();
        Animal b = new Bird();
        nuoi(b);
    }
    
    public static void nuoi(Animal a)
    {
        a.an();
        a.diChuyen();
        a.keu();
    }
}
