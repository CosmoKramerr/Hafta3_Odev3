package Kodlama_io.DataAccess;

import Kodlama_io.Entities.Course;

public class HibernateCourseDal implements CourseDal {
    @Override
    public void add(Course course) {
        System.out.println("Added to database with Hibernate : "+course.getTitle());

    }
}
