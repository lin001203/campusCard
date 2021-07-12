package gduf.javaee.controller;

import gduf.javaee.po.Record;
import gduf.javaee.po.User;
import gduf.javaee.service.RecordService;
import gduf.javaee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RecordController {

    @Autowired
    private RecordService recordService;

    @RequestMapping("/recordlist")
    public String recordList(Model model) {
        List<Record> list = recordService.findAllRecord();
        model.addAttribute("recordList", list);//
        return "record/recordlist";
    }

    @RequestMapping(value="/recordpreinsert",method= RequestMethod.GET)
    public String recordPreinsert() {
        return "record/recordadd";
    }

    @RequestMapping(value="/recordinsert", method=RequestMethod.POST)
    public String recordInsert(Record record){
        recordService.addRecord(record);
        return "redirect:recordlist";
    }

    @RequestMapping(value="/recorddelete", method=RequestMethod.POST)
    public String recordDelete(String[] reidArray) {
        recordService.deleteRecords(reidArray);
        return "redirect:recordlist";
    }

    @RequestMapping(value="/recordselectbyreid")
    public String recordSelectbyReid(String reid,Model model) {
        Record record=recordService.findRecordByReid(reid);
        List<Record> list = new ArrayList<Record>();
        list.add(record);
        model.addAttribute("recordList", list);
        return "record/recordlist";
    }

    @RequestMapping(value="/recordselectbycid", method=RequestMethod.POST)
    public String recordSelectbyCid(String cid,Model model) {
        List<Record> list=recordService.findRecordByCid(cid);
        model.addAttribute("recordList", list);
        return "record/recordlist";
    }
}
