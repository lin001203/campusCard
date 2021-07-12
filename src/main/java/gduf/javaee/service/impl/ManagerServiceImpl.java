package gduf.javaee.service.impl;

import gduf.javaee.mapper.ManagerMapper;
import gduf.javaee.po.Manager;
import gduf.javaee.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    public List<Manager> findAllManager() {
        return managerMapper.selectManagers();
    }

    public Manager findManagerByMid(String mid) {
        return managerMapper.selectManagerByMid(mid);
    }

    public void deleteManagers(String[] midArray) {
        for(int i=0;i<midArray.length;i++)
            managerMapper.deleteManagerByMid(midArray[i]);

    }

    public void updateManager(Manager manager) {
        managerMapper.updateManager(manager);
    }
}
