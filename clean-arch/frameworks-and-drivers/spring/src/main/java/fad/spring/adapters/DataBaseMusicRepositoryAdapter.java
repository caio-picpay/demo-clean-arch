package fad.spring.adapters;

import abr.entities.Music;
import abr.ports.MusicRepositoryPort;
import fad.spring.data.MusicEntity;
import fad.spring.data.MusicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
@AllArgsConstructor
public class DataBaseMusicRepositoryAdapter implements MusicRepositoryPort {

    private final MusicRepository musicRepository;

    @Override
    public void create(Music music) {
        MusicEntity entity = MusicEntity
                .builder()
                .id(music.getId())
                .name(music.getName())
                .build();
        musicRepository.save(entity);
    }

    @Override
    public int count() {
        return (int) musicRepository.count();
    }

    @Override
    public List<Music> findAll() {
        return StreamSupport
                .stream(musicRepository.findAll().spliterator(), false)
                .map(it -> Music
                        .builder()
                        .id(it.getId())
                        .name(it.getName())
                        .build())
                .collect(Collectors.toList());
    }
}
