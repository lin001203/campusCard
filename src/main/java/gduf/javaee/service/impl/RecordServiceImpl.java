package gduf.javaee.service.impl;

import gduf.javaee.mapper.RecordMapper;
import gduf.javaee.po.Record;
import gduf.javaee.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

    @Override
    public Record findRecordByReid(String reid) {
        return recordMapper.selectRecordByReid(reid);
    }

    @Override
    public List<Record> findAllRecord() {
        return recordMapper.selectRecords();
    }

    @Override
    public List<Record> findRecordByCid(String cid) {
        return recordMapper.selectRecordByCid(cid);
    }

    @Override
    public void addRecord(Record record) {
        recordMapper.insertRecord(record);
    }

    @Override
    public void deleteRecords(String[] reidArray) {
        for(int i=0;i<reidArray.length;i++)
            recordMapper.deleteRecordByReid(reidArray[i]);
    }
}
