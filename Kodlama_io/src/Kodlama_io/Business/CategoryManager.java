package Kodlama_io.Business;

import Kodlama_io.Core.Logging.Logger;
import Kodlama_io.DataAccess.CategoryDal;
import Kodlama_io.Entities.Category;
import Kodlama_io.Entities.Course;

import java.util.ArrayList;
public class CategoryManager {
    private CategoryDal categoryDal;
    private Logger[] loggers;
    ArrayList<Category> categories = new ArrayList<Category>();

    public CategoryManager(CategoryDal categoryDal, Logger[] loggers) {
        this.categoryDal = categoryDal;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category c : categories) {
            if (c.getName().trim().equalsIgnoreCase(category.getName().trim())) {
                throw new Exception("There cannot be two same categories !");

            }
        }
            categories.add(category);
            categoryDal.add(category);
            for (Logger logger : loggers) {
                logger.log(category.getName());
            }
        }
    }
