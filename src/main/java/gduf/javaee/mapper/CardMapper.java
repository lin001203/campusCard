package gduf.javaee.mapper;

import gduf.javaee.po.Card;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CardMapper {
    Card selectCardByCid(String cid);

    void createCard(Card card);
    void updateCardBalance(@Param("cid") String cid, @Param("money") float money);
    void updateCardStatus(@Param("cid") String cid, @Param("status") boolean status);
}
