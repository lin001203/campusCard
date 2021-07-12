package gduf.javaee.service;

import gduf.javaee.po.Card;

public interface CardService {
    Card selectCardByCid(String cid);
    void createCard(Card card);
    void updateCardBalance(Card card);
    void updateCardStatus(Card card);
}
