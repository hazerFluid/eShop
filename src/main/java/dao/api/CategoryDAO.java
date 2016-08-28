package dao.api;

import dao.entity.Category;

import java.util.List;

public interface CategoryDAO extends GenericDAO<Category, Integer> {

    Category getCategoryById(int id);

    Category getCategoryByName(String name);

    List<Category> getAllCategories();

}
