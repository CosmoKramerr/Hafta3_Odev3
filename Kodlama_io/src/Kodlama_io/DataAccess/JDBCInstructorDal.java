package Kodlama_io.DataAccess;

import Kodlama_io.Entities.Instructor;

public class JDBCInstructorDal implements InstructorDal {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Added to database with JDBC : "+instructor.getFirstName()+" "+instructor.getLastName());
    }
}
