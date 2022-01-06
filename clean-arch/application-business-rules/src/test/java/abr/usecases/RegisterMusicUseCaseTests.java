package abr.usecases;

import abr.entities.Music;
import abr.ports.MusicRepositoryPort;
import mock.adapters.InMemoryMusicRepositoryAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
