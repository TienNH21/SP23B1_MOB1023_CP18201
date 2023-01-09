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
        this.list.set(viTri, p);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public ArrayList<Product> select() {
        return this.list;
    }
    
}
