package Lesson12_MultiThreading;

public class MainClass {
    public static void main(String[] args) {
        MyRunnable cv1 = new MyRunnable("Kê bàn"),
            cv2 = new MyRunnable("Lau bảng");
        
        Thread duc = new Thread(cv1),
            tai = new Thread(cv2);
        
        duc.start();
        tai.start();
    }
}
