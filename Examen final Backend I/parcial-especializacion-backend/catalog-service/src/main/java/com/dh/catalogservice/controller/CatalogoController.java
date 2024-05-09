package com.dh.catalogservice.controller;

import com.dh.catalogservice.model.Genre;
import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.model.Serie;
import com.dh.catalogservice.service.CatalogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/catalog")
public class CatalogoController {
    private CatalogService catalogService;
    public CatalogoController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }
    @GetMapping("/{genre}")
    public ResponseEntity<Genre> getCatalogByGenre (@PathVariable String genre) {
        return ResponseEntity.ok(catalogService.getCatalogByGenre(genre));
    }
    @PostMapping("/movies/save")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(catalogService.saveMovie(movie));
    }
    @PostMapping("/series/save")
    public ResponseEntity<Serie> saveSerie(@RequestBody Serie serie) {
        return ResponseEntity.ok(catalogService.create(serie));
    }
}

