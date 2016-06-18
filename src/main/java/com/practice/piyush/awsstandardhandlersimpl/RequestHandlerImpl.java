package com.practice.piyush.awsstandardhandlersimpl;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.log4j.Logger;

/**
 * This class implements the RequestHandler<I,O> interface which aws provides.
 */
public class RequestHandlerImpl implements RequestHandler<RequestInput, Student> {

    public Student handleRequest(RequestInput input, Context context) {
        Logger logger = Logger.getLogger(RequestHandlerImpl.class);

        Student student = new Student();
        student.setName(input.getName());
        student.setAge(input.getAge());
        student.setCity(input.getCity());
        student.setState(input.getState());
        student.setCourse(input.getDegrees()[0]);

        logger.info("Logging the student details :::: " + student);

        return student;
    }
}
