package micronaut.demo.client;


import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import micronaut.demo.model.Student;

import javax.validation.constraints.NotBlank;

@Client("/student")
public interface StudentClient {

    @Get
    public Student createStudent(@QueryValue @NotBlank String id, @QueryValue @NotBlank String name);
}
