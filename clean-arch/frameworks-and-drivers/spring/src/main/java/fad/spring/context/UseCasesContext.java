package fad.spring.context;

import abr.usecases.FindMusicsUseCase;
import abr.usecases.RegisterMusicUseCase;
import fad.spring.adapters.InMemoryMusicRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesContext {

    @Bean
    RegisterMusicUseCase registerMusicUseCase(
            InMemoryMusicRepositoryAdapter inMemoryMusicRepositoryAdapter
    ){
        return new RegisterMusicUseCase(inMemoryMusicRepositoryAdapter);
    }

    @Bean
    FindMusicsUseCase findMusicsUseCase(
            InMemoryMusicRepositoryAdapter inMemoryMusicRepositoryAdapter
    ){
        return new FindMusicsUseCase(inMemoryMusicRepositoryAdapter);
    }
}
