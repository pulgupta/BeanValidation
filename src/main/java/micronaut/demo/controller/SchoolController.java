package micronaut.demo.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.validator.Validator;
import micronaut.demo.client.StudentClient;
import micronaut.demo.model.Student;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import java.util.Set;

@Controller("/school")
public class SchoolController {

    @Inject
    Validator validator;

    @Inject
    StudentClient client;

    @Get
    public HttpResponse<Student> getSchoolStudents() {
        Student student = client.createStudent("1234", "John");
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        if(violations.isEmpty())
            return HttpResponse.ok(student);
        else
            return HttpResponse.badRequest();
    }

}
