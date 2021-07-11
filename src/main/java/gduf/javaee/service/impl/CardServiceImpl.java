package gduf.javaee.service.impl;

import gduf.javaee.mapper.CardMapper;
import gduf.javaee.po.Card;
import gduf.javaee.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardMapper cardMapper;

    public Card selectCardByCid(String cid){
        return cardMapper.selectCardByCid(cid);
    }
}
