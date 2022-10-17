import Kodlama_io.Business.CategoryManager;
import Kodlama_io.Business.CourseManager;
import Kodlama_io.Business.InstructorManager;
import Kodlama_io.Core.Logging.DBLogger;
import Kodlama_io.Core.Logging.EmailLogger;
import Kodlama_io.Core.Logging.FileLogger;
import Kodlama_io.Core.Logging.Logger;
import Kodlama_io.DataAccess.*;
import Kodlama_io.Entities.Category;
import Kodlama_io.Entities.Course;
import Kodlama_io.Entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new EmailLogger(), new DBLogger(), new FileLogger()};

        Course course = new Course("Java", "15/09/2022", 0);
        Course course1 = new Course("JavaScript", " 10/07/2021", 0);
        CourseManager courseManager = new CourseManager(new JDBCCourseDal(), loggers);
        courseManager.add(course);
        courseManager.add(course1);

        Category category = new Category("Programming");
        Category category1 = new Category("All");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDal(), loggers);
        categoryManager.add(category);
        categoryManager.add(category1);

        Instructor instructor = new Instructor("Engin", "Demirog", new Course[]{course, course1});
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDal(), loggers);
        instructorManager.add(instructor);
        Instructor instructor1 = new Instructor("Ahmet Can", "Cingoz", new Course[]{course1});
        instructorManager.add(instructor1);


    }
}
