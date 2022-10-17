package Kodlama_io.DataAccess;

import Kodlama_io.Entities.Category;

public class JDBCCategoryDal implements CategoryDal {
    @Override
    public void add(Category category) {
        System.out.println("Added to database with JDBC : "+category.getName());
    }
}
