package Kodlama_io.DataAccess;

import Kodlama_io.Entities.Instructor;

public class HibernateInstructorDal implements InstructorDal {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Added to database with Hibernate : "+instructor.getFirstName()+" "+instructor.getLastName());

    }
}
