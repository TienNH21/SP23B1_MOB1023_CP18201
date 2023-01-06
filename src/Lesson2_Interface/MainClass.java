package Lesson2_Interface;

public class MainClass {
    public static void main(String[] args) {
//        Animal c; // Khai báo biến c có kiểu Cat
//        c = new Cat(); // Khởi tạo đối tượng Cat và gán vào biến c

        /*
         * static: tĩnh
         */
        Animal c = new Cat();
        Animal d = new Dog();
        Animal b = new Bird();
        Bird b1 = new Bird();
        Bird.soChan = 1;
        MainClass.nuoi(b);
    }
    
    public static void nuoi(Animal a)
    {
        a.an();
        a.diChuyen();
        a.keu();
    }
}
