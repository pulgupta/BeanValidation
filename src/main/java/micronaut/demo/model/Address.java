package micronaut.demo.model;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@Introspected
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @NotNull
    String houseNumber;
    String city;
}
