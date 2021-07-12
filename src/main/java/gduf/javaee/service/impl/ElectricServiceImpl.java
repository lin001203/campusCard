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
    public Electric selectElectricByEno(String eno) {
        return electricMapper.selectElectricByEno(eno);
    }

    public void createElectric(Electric electric){
        electricMapper.createElectric(electric);
    }

    @Override
    public void updateElectric(Electric electric) {
        electricMapper.updateElectric(electric);
    }
}
