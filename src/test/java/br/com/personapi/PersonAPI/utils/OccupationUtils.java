package br.com.personapi.PersonAPI.utils;

import br.com.personapi.PersonAPI.dto.request.OccupationDTO;
import br.com.personapi.PersonAPI.entity.Occupation;
import br.com.personapi.PersonAPI.enums.ClearanceType;

public class OccupationUtils {

    private static final String OCUUPATION_NAME = "Security";
    private static final Double OCCUPATION_SALARY = 200.00;
    private static final ClearanceType OCCUPATION_CLEARANCE = ClearanceType.THAUMIEL;
    private static final Long OCCUPATION_ID = 1L;



    public static OccupationDTO createFakeDTO() {
        return OccupationDTO.builder()
                .name(OCUUPATION_NAME)
                .salary(OCCUPATION_SALARY)
                .clearance(OCCUPATION_CLEARANCE)
                .id(OCCUPATION_ID)
                .build();
    }

    public static Occupation createFakeEntity() {
        return Occupation.builder()
                .name(OCUUPATION_NAME)
                .salary(OCCUPATION_SALARY)
                .clearance(OCCUPATION_CLEARANCE)
                .id(OCCUPATION_ID)
                .build();
    }
}
