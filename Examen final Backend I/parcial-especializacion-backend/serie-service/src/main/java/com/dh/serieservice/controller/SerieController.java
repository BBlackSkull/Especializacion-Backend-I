package com.dh.serieservice.controller;

import com.dh.serieservice.model.Serie;
import com.dh.serieservice.queue.SerieSender;
import com.dh.serieservice.service.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/series")
public class SerieController {

    private final SerieService serieService;
    private final SerieSender senderSerie;
    @GetMapping("/{genre}")
    public ResponseEntity<List<Serie>> getSerieByGenre(@PathVariable String genre) {
        return ResponseEntity.ok().body(serieService.getSerieByGenre(genre));
    }
    @PostMapping("/save")
    public ResponseEntity<Serie> create(@RequestBody Serie serie) {
        senderSerie.send(serie);
        return ResponseEntity.ok().body(serieService.create(serie));
    }
}
