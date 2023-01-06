package Lesson2_Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    private ArrayList<Product> list = new ArrayList<>();

    @Override
    public void insert(Product p) {
        list.add(p);
    }

    @Override
    public void update(int viTri, Product p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int viTri) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Product> select() {
        return this.list;
    }
    
}
