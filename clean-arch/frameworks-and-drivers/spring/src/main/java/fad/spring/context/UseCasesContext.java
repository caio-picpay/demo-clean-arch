package fad.spring.context;

import abr.usecases.FindMusicsUseCase;
import abr.usecases.RegisterMusicUseCase;
import fad.spring.adapters.DataBaseMusicRepositoryAdapter;
import fad.spring.adapters.InMemoryMusicRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesContext {

    @Bean
    RegisterMusicUseCase registerMusicUseCase(
            InMemoryMusicRepositoryAdapter inMemoryMusicRepositoryAdapter,
            DataBaseMusicRepositoryAdapter dataBaseMusicRepositoryAdapter
    ){
        return new RegisterMusicUseCase(dataBaseMusicRepositoryAdapter);
    }

    @Bean
    FindMusicsUseCase findMusicsUseCase(
            InMemoryMusicRepositoryAdapter inMemoryMusicRepositoryAdapter,
            DataBaseMusicRepositoryAdapter dataBaseMusicRepositoryAdapter
    ){
//        return new FindMusicsUseCase(inMemoryMusicRepositoryAdapter);
        return new FindMusicsUseCase(dataBaseMusicRepositoryAdapter);
    }
}
