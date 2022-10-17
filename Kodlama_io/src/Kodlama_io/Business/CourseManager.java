package Kodlama_io.Business;
import Kodlama_io.Core.Logging.Logger;
import Kodlama_io.DataAccess.CourseDal;
import Kodlama_io.Entities.Course;
import java.util.ArrayList;


public class CourseManager {
    private CourseDal courseDal;
    private Logger[] loggers;
    ArrayList<Course> courses = new ArrayList<Course>();
    public CourseManager(CourseDal courseDal, Logger[] loggers){
        this.courseDal = courseDal;
        this.loggers = loggers;
    }
    public void add(Course course) throws Exception{
        if (course.getPrice()<0) {
            throw new Exception("Course price cannot be less than 0 !") ;
        }
       for (Course c : courses){
           if(c.getTitle().trim().equalsIgnoreCase(course.getTitle().trim())){
               throw new Exception("There cannot be two same courses !");

           }

       }
        courses.add(course);
        courseDal.add(course);
        for(Logger logger : loggers){
            logger.log(course.getTitle());
        }

    }
}
