package gduf.javaee.mapper;

import gduf.javaee.po.Electric;
import org.apache.ibatis.annotations.Param;

public interface ElectricMapper {
    Electric selectElectricByeno(String eno);
    void electricRecharge(@Param("eno") String eno, @Param("eremain") int eremain);
    void createElectric(Electric electric);
    void updateElectric(@Param("eno") String eno, @Param("eremain") int eremain);
}
