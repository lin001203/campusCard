package gduf.javaee.po;

import lombok.Data;

@Data
public class Card {
    private String cid;
    private String uid;
    private float balance;
    private boolean status;
}
