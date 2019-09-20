package micronaut.demo.model;

import io.micronaut.core.annotation.Introspected;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * The idea is to validate the beans using micronaut
 * Things where this can help is
 * Avoid Null checks
 * Avoiding checking valid object creation
 * Avoiding data validation checks
 * Avoiding checking if the API has returned valid JSON
 * @author pulgupta
 */
@Data
@Builder
@Introspected
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @NotNull
    String id;
    String name;
    @NotNull
    @Valid
    Address address;
}
