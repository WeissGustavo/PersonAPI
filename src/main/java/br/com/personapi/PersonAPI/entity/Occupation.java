package br.com.personapi.PersonAPI.entity;

import br.com.personapi.PersonAPI.enums.ClearanceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Occupation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double salary;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private ClearanceType clearance;
}
