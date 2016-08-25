import dao.entity.Product;
import dao.impls.ProductApp;

public class Main {

    public static void main(String[] args) {
        ProductApp dao = new ProductApp();
        dao.create(new Product());
    }
}
