package abr.usecases;

import abr.entities.Music;
import abr.ports.MusicRepositoryPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class FindMusicsUseCaseTests {

    private final MusicRepositoryPort musicRepository = mock(MusicRepositoryPort.class);
    private final FindMusicsUseCase useCase = new FindMusicsUseCase(musicRepository);

    @Test
    void findMusicsUseCaseTest(){
        List<Music> mockedMusics = List.of(
                new Music().setName("Brasília Amarela"),
                new Music().setName("Hotel Califórnia")
        );
        when(musicRepository.findAll()).thenReturn(mockedMusics);
        List<Music> musics = useCase.execute();
        Assertions.assertEquals(2, musics.size());
        Assertions.assertTrue(musics.stream().anyMatch(it->it.getName().equals("Hotel Califórnia")));
    }
}
