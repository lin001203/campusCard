package gduf.javaee.mapper;

import gduf.javaee.po.Manager;

import java.util.List;

public interface ManagerMapper {
    Manager selectManagerByMid(String mid);
    List<Manager> selectManagers();
    void updateManager(Manager manager);
    void deleteManagerByMid(String mid);
}
