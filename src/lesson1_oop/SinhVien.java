package lesson1_oop;

public class SinhVien extends Nguoi {
    /*
     * SinhVien được thừa hưởng toàn bộ thuộc tính và p/thức 
        của Nguoi
     * SinhVien chỉ được phép truy cập thuộc tính và p/thức 
        KHÔNG PRIVATE của Nguoi.
     * Đối tượng của SinhVien được phép có kiểu Nguoi.
     */
    

    /*
     * Override: Ghi đè
     * Class con có phương thức cùng tên, cùng tham số 
     * (giống với phương thức của class cha)
     */
    @Override
    public void xuatThongTin()
    {
        System.out.println("Hello Poly");
        super.xuatThongTin();
    }
}
