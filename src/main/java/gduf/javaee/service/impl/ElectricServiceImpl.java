package gduf.javaee.service.impl;

import gduf.javaee.mapper.ElectricMapper;
import gduf.javaee.po.Electric;
import gduf.javaee.service.ElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricServiceImpl implements ElectricService {
    @Autowired
    private ElectricMapper electricMapper;


    @Override
    public Electric selectElectricByeno(String eno) {
        return electricMapper.selectElectricByeno(eno);
    }

    @Override
    public void electricRecharge(String eno, int eremain) {
        electricMapper.electricRecharge(eno,eremain);
    }

    public void createElectric(Electric electric){
        electricMapper.createElectric(electric);
    }

    @Override
    public void updateElectric(String eno, int eremain) {
        electricMapper.updateElectric(eno,eremain);
    }
}
