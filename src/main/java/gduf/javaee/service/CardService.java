package gduf.javaee.service;

import gduf.javaee.po.Card;

public interface CardService {
    Card selectCardByCid(String cid);
    void createCard(Card card);
    void updateCardBalance(String cid,float money);
    void updateCardStatus(String cid,boolean status);
}
