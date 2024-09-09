package br.com.libdolf.honkaistarrailapi.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Character {
    @Id
    private Long id;
    private String name;
    private Integer rarity;
    private String path;
    private String element;
    private LocalDateTime releaseDate;
    private String story;
    private String img;
    private String icon;
}
