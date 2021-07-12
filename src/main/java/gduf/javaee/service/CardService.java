package gduf.javaee.service;

import gduf.javaee.po.Card;

import java.util.List;

public interface CardService {
    List<Card> selectCard();
    Card selectCardByCid(String cid);
    void createCard(Card card);
    void updateCardBalance(String cid,float money);
    void updateCardStatus(String cid,boolean status);
}
