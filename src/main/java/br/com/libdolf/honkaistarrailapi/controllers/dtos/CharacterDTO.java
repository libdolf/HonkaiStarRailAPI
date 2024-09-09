package br.com.libdolf.honkaistarrailapi.controllers.dtos;

import java.time.LocalDateTime;

public record CharacterDTO(
        Long id,
        String name,
        Integer rarity,
        String path,
        String element,
        LocalDateTime releaseDate,
        String story,
        String img,
        String icon
) {
}
