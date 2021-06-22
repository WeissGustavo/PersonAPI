package br.com.personapi.PersonAPI.dto.request;

import br.com.personapi.PersonAPI.enums.ClearanceType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OccupationDTO {
    private Long id;
    @NotEmpty
    @Size(max = 40)
    private String name;
    @NotEmpty
    private Double salary;
    @Enumerated(EnumType.ORDINAL)
    private ClearanceType clearanceType;
}
