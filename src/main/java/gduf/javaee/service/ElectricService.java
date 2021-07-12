package gduf.javaee.service;

import gduf.javaee.po.Electric;

public interface ElectricService {
    Electric selectElectricByEno(String eno);//查询电费
    void updateElectric(String eno,int eremain);//充电费
    void createElectric(Electric electric);//添加电费信息
}
