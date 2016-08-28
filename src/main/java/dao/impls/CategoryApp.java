package dao.impls;

import dao.api.CategoryDAO;
import dao.entity.Category;

import javax.persistence.Query;
import java.util.List;

public class CategoryApp extends GenericDAOImpl<Category, Integer> implements CategoryDAO {

    public CategoryApp(Class<Category> aClass) {
        super(aClass);
    }

    @Override
    public Category getCategoryById(int id) {

        Query query =  entityManager.createQuery("select c from Category c where c.id = :id");
        query.setParameter("id", id);
        return (Category) query.getSingleResult();

    }

    @Override
    public Category getCategoryByName(String name) {

        Query query =  entityManager.createQuery("select c from Category c where c.name = :name");
        query.setParameter("name", name);
        return (Category) query.getSingleResult();

    }

    @Override
    public List<Category> getAllCategories() {

        Query query =  entityManager.createQuery("select c from Category c");
        return query.getResultList();

    }
}
