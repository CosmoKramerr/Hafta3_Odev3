package Kodlama_io.Business;

import Kodlama_io.Core.Logging.Logger;
import Kodlama_io.DataAccess.InstructorDal;
import Kodlama_io.Entities.Course;
import Kodlama_io.Entities.Instructor;

import java.util.Arrays;


public class InstructorManager {

    private InstructorDal instructorDal;
    private Logger[] loggers;
     public InstructorManager(InstructorDal instructorDal, Logger[] loggers){
         this.instructorDal = instructorDal;
         this.loggers = loggers;
     }

    public void add(Instructor instructor){
         instructorDal.add(instructor);
         for(Logger logger : loggers){
             logger.log(instructor.getFirstName()+" "+instructor.getLastName());
         }

    }




}
