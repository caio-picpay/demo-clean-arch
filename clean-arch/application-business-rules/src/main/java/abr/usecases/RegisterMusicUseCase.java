package abr.usecases;

import abr.entities.Music;
import abr.ports.MusicCreatorPort;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class RegisterMusicUseCase {

    private final MusicCreatorPort musicCreator;

    Music execute(Music music){
        String musicId = UUID.randomUUID().toString();
        music.setId(musicId);
        musicCreator.create(music);
        return music;
    }
}
