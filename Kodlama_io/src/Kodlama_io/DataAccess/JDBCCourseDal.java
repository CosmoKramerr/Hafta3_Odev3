package Kodlama_io.DataAccess;

import Kodlama_io.Entities.Course;

public class JDBCCourseDal implements CourseDal {
    @Override
    public void add(Course course) {
        System.out.println("Added to database with JDBC : "+course.getTitle());

    }
}
