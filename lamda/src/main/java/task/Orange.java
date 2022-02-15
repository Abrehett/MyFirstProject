package task;

import lombok.*;
//@Getter
//@Setter
//@ToString

@Builder // @Builder generatea an @AllArgsConstructor unless there is another @xConstructor

@Data
public class Orange {
    private int weight;
    private Color color;


}
