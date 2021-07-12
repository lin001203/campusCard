package gduf.javaee.mapper;

import gduf.javaee.po.Record;

import java.util.List;

public interface RecordMapper {
    Record selectRecordByReid(String reid);
    List<Record> selectRecordByCid(String cid);
    List<Record> selectRecords();
    void insertRecord(Record record);
    void deleteRecordByReid(String reid);
}
