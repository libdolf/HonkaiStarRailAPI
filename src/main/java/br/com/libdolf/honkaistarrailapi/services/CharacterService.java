package br.com.libdolf.honkaistarrailapi.services;

import br.com.libdolf.honkaistarrailapi.controllers.dtos.CharacterDTO;
import br.com.libdolf.honkaistarrailapi.repository.CharacterRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Page<CharacterDTO> findAllCharacters() {

    }
}
