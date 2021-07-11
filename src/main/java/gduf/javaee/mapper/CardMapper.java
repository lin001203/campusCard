package gduf.javaee.mapper;

import gduf.javaee.po.Card;
import org.springframework.stereotype.Repository;

@Repository
public interface CardMapper {
    Card selectCardByCid(String cid);
}
