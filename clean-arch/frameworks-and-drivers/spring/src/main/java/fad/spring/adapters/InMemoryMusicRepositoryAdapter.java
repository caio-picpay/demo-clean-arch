package fad.spring.adapters;

import abr.entities.Music;
import abr.ports.MusicRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryMusicRepositoryAdapter implements MusicRepositoryPort {

    private final List<Music> musics = new ArrayList<>();

    @Override
    public void create(Music music) {
        musics.add(music);
    }

    @Override
    public int count() {
        return musics.size();
    }

    @Override
    public List<Music> findAll() {
        return musics;
    }
}
