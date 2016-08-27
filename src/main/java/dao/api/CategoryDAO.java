package dao.api;

import dao.entity.Category;

import java.util.List;

public interface CategoryDAO {

    Category getCategoryById(int id);

    Category getCategoryByName(String name);

    List<Category> getAllCategories();

}
