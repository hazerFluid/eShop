import dao.HibernateUtil;
import dao.entity.Product;
import dao.exceptions.EntityException;
import dao.impls.ProductApp;

public class Main {

    public static void main(String[] args) {

        ProductApp pr = new ProductApp();

        pr.setEntityManager(HibernateUtil.getEntityManager());

        Product product = new Product();

        product.setInStock(20);
        product.setName("Twelve");
        System.out.println(product);

        try {

            pr.create(product);

        } catch (EntityException e) {
            e.printStackTrace();
        }
    }
}
