package gduf.javaee.service.impl;

import gduf.javaee.mapper.CardMapper;
import gduf.javaee.po.Card;
import gduf.javaee.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardMapper cardMapper;

    public List<Card> selectCard(){
        return cardMapper.selectCard();
    }

    public Card selectCardByCid(String cid){
        return cardMapper.selectCardByCid(cid);
    }

    public void createCard(Card card){
        cardMapper.createCard(card);
    }

    @Override
    public void updateCardBalance(String cid, float money) {
        cardMapper.updateCardBalance(cid,money);
    }

    @Override
    public void updateCardStatus(String cid, boolean status) {
        cardMapper.updateCardStatus(cid,status);
    }

}
