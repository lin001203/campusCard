package gduf.javaee.mapper;

import gduf.javaee.po.Card;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardMapper {
    List<Card> selectCard();
    Card selectCardByCid(String cid);

    void createCard(Card card);
    void updateCardBalance(@Param("cid") String cid, @Param("money") float money);
    void updateCardStatus(@Param("cid") String cid, @Param("status") boolean status);
}
