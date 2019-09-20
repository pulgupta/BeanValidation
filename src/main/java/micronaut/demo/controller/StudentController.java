package micronaut.demo.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import micronaut.demo.model.Student;

import javax.validation.constraints.NotBlank;

@Controller("/student")
public class StudentController {

    /**
     * While creating a student I am not setting ID
     * This has caused a validation error and now we can check in our application
     * if the bean data is valid or not.
     * @param id
     * @param name
     * @return
     */
    @Get
    public Student createStudent(@QueryValue @NotBlank String id,
                                 @QueryValue @NotBlank String name) {
        return Student.builder().name(name).build();
    }

}
