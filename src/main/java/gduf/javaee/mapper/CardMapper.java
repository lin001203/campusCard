package gduf.javaee.mapper;

import gduf.javaee.po.Card;

import java.util.List;

public interface CardMapper {
    Card selectCardByCid(String cid);
    List<Card> selectCards();
    void insertCard(Card card);
    void updateCard(Card card);
    void deleteCardByCid(String cid);
}
