package abr.usecases;

import abr.entities.Music;
import abr.ports.MusicRepositoryPort;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FindMusicsUseCase {

    private final MusicRepositoryPort musicRepository;

    List<Music> execute(){
        return musicRepository.findAll();
    }
}
