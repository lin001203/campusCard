package gduf.javaee.service;

import gduf.javaee.po.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> findAllManager();
    Manager findManagerByMid(String mid);
    void deleteManagers(String[] midArray);
    void updateManager(Manager manager);
}
