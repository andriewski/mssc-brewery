package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;

    @NotBlank(message = "beerName should not be blank")
    private String beerName;

    @NotBlank(message = "beerStyle should not be blank")
    private String beerStyle;

    @Positive(message = "upc should be positive")
    private Long upc;
}
