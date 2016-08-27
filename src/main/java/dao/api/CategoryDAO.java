package dao.api;

import dao.entity.Category;

import java.util.List;

public interface CategoryDAO {

    Category findCategoryById(int id);

    Category findCategoryByName(String name);

    List<Category> findAllCategories();

}
