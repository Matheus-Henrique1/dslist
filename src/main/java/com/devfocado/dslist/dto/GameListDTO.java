package com.devfocado.dslist.dto;

import com.devfocado.dslist.entities.GameList;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

}
