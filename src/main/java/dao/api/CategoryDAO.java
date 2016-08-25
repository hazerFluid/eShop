package dao.api;

import dao.entity.Category;
import java.util.List;

public interface CategoryDAO {

    void createCategory(Category category);
    void updateCategory(Category category);
    Category findCategoryById(Long id);
    List<Category> findAllCategories();

}
