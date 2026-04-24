package com.GJJ.controller;

import com.GJJ.entity.Htb105;
import com.GJJ.service.Htb105Service;
import com.GJJ.vo.Htb105VO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HTB105")
public class Htb105Controller {

    private final Htb105Service service;

    public Htb105Controller(Htb105Service service) {
        this.service = service;
    }

    // 新增
    @PostMapping("/insert")
    public Htb105VO insert(@RequestBody Htb105 htb105) {
        return service.insert(htb105);
    }

    // 查询
    @GetMapping("/select")
    public Htb105VO select(@RequestParam String acct) {
        return service.select(acct);
    }

    // 删除
    @GetMapping("/delete")
    public String delete(@RequestParam String acct) {
        service.delete(acct);
        return "删除成功";
    }

    //自定义SQL调用，只查John得信息
    @GetMapping("/selectJohn")
    public Htb105VO selectJohn(@RequestParam String name) {
        return service.selectJohn(name);
    }

}