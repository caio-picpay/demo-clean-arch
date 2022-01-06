package abr.entities;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private String name;
    private List<Music> musics;
}
