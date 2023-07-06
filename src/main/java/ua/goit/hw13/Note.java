package ua.goit.hw13;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Note {

    private long id;

    private String title;

    private String content;
}
