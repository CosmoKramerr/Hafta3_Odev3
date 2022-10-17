package Kodlama_io.DataAccess;

import Kodlama_io.Entities.Category;

public class HibernateCategoryDal implements CategoryDal {
    @Override
    public void add(Category category) {
        System.out.println("Added to database with hibernate : "+ category.getName());
    }
}
