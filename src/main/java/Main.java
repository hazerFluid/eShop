import dao.entity.Product;
import dao.impls.ProductDAOImpl;

public class Main {

    public static void main(String[] args) {
        ProductDAOImpl dao = new ProductDAOImpl();
        dao.create(new Product());
    }
}
