package gduf.javaee.po;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String cid;
    private String uid;
    private float balance;
    private boolean status;
}
