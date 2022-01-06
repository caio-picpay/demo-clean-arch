package abr.ports;

import abr.entities.Music;

import java.util.List;

public interface MusicRepositoryPort {
    void create(Music music);

    int count();

    List<Music> findAll();
}
