package micronaut.demo.model;

import io.micronaut.test.annotation.MicronautTest;
import io.micronaut.validation.validator.Validator;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class StudentTest {

    @Inject
    Validator validator;

    @Test
    public void checkIfValidationsAreWorking() {
        System.out.println("Tests Started");
        Address address = Address.builder()
                .city("Delhi")
                .build();
        Student student = Student.builder()
                .name("Pulkit")
                .build();
        assertEquals("Pulkit", student.getName());
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        violations.stream().map(s -> s.getPropertyPath() + " " +  s.getInvalidValue())
                .forEach(System.out::println);
        assertEquals(2, violations.size());

    }

}