package dev.ansh.BookMyShow.controller;

import dev.ansh.BookMyShow.dto.TheatreRequestDTO;
import dev.ansh.BookMyShow.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping("/theatre")
    public ResponseEntity addTheatre(@RequestBody TheatreRequestDTO theatreRequestDTO){
        return ResponseEntity.ok(
                theatreService.saveTheatre(theatreRequestDTO.getName(),theatreRequestDTO.getAddress(),theatreRequestDTO.getCityId())

        );
    }
}
