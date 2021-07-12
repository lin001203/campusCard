package gduf.javaee.service;

import gduf.javaee.po.Record;

import java.util.List;

public interface RecordService {
    Record findRecordByReid(String reid);
    List<Record> findAllRecord();
    List<Record> findRecordByCid(String rno);//根据卡号查询交易记录
    void addRecord(Record record);
    void deleteRecords(String[] reidArray);
}
