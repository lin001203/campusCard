package gduf.javaee.mapper;

import gduf.javaee.po.Electric;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricMapper {
    Electric selectElectricByEno(String eno);
    void createElectric(Electric electric);
    void updateElectric(@Param("eno") String eno, @Param("eremain") int eremain);
}
