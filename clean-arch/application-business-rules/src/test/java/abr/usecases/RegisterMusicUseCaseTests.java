package abr.usecases;

import abr.entities.Music;
import abr.ports.MusicRepositoryPort;
import mock.adapters.InMemoryMusicRepositoryAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class RegisterMusicUseCaseTests {

    @Test
    void inMemoryMusicCreationTest() {
        MusicRepositoryPort musicRepository = new InMemoryMusicRepositoryAdapter();
        RegisterMusicUseCase useCase = new RegisterMusicUseCase(musicRepository);

        Music music = new Music();
        music.setName("Brasília Amarela");
        Music createdMusic = useCase.execute(music);
        Assertions.assertNotNull(createdMusic.getId());
        Assertions.assertEquals(1, musicRepository.count());
    }

    @Test
    void mockMusicCreationTest(){
        MusicRepositoryPort musicRepository = mock(MusicRepositoryPort.class);
        when(musicRepository.count()).thenReturn(1);
        RegisterMusicUseCase useCase = new RegisterMusicUseCase(musicRepository);

        Music music = new Music();
        music.setName("Hotel California");
        Music createdMusic = useCase.execute(music);
        Assertions.assertNotNull(createdMusic.getId());
        Assertions.assertEquals(1, musicRepository.count());
    }
}
