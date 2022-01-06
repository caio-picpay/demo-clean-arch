package abr.ports;

import abr.entities.Music;

public interface MusicRepositoryPort {
    void create(Music music);
    int count();
}
