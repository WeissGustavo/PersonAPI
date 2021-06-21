package br.com.personapi.PersonAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClearanceType {

    THAUMIEL(5),
    TOPSECRET(4),
    SECRET(3),
    RESTRICTED(2),
    CONFIDENTIAL(1);

    private final int level;

}
