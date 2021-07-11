package gduf.javaee.service;

import gduf.javaee.po.Electric;

public interface ElectricService {
    Electric selectElectricByeno(String eno);
    void electricRecharge(String eno,int eremain);
    void updateElectric(String eno,int eremain);
    void createElectric(Electric electric);
}
