package br.com.libdolf.honkaistarrailapi.controllers;

import br.com.libdolf.honkaistarrailapi.controllers.dtos.CharacterDTO;
import br.com.libdolf.honkaistarrailapi.services.CharacterService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/")
public class CharacterController {
    private final CharacterService service;

    public CharacterController(CharacterService service) {
        this.service = service;
    }

    @GetMapping("/characters")
    public ResponseEntity<Page<CharacterDTO>> findAllCharacters() {
        return ResponseEntity.ok(service.findAllCharacters());
    }

    @GetMapping()
    public ResponseEntity<?> findByParam(@RequestParam(required = false) Long id,
                                                @RequestParam(required = false) String name) {
        if (id != null) {
            return ResponseEntity.ok(service.findById(id));
        }
        return ResponseEntity.ok(service.findByName(name));
    }
}
