package fad.spring.controllers;

import abr.entities.Music;
import abr.usecases.FindMusicsUseCase;
import abr.usecases.RegisterMusicUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/music")
public class MusicController {

    private final FindMusicsUseCase findMusicsUseCase;
    private final RegisterMusicUseCase registerMusicUseCase;

    @PostMapping
    void createMusic(@RequestBody Music music){
        registerMusicUseCase.execute(music);
    }

    @GetMapping
    List<Music> findMusics(){
        return findMusicsUseCase.execute();
    }
}
