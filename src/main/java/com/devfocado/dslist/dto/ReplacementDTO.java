package com.devfocado.dslist.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ReplacementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;

}
