package com.GJJ.service;

import com.GJJ.entity.Htb105;
import com.GJJ.repository.Htb105Repository;
import com.GJJ.vo.Htb105VO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class Htb105Service {

    private final Htb105Repository repository;

    public Htb105Service(Htb105Repository repository) {
        this.repository = repository;
    }

    // 新增
    public Htb105VO insert(Htb105 htb105) {
        Htb105 saved = repository.save(htb105);
        Htb105VO vo = new Htb105VO();
        BeanUtils.copyProperties(saved, vo);
        return vo;
    }

    // 查询（Java 8 完美版）
    public Htb105VO select(String acct) {
        Optional<Htb105> opt = repository.findById(acct);

        // Java 8 只能用 isPresent，不能用 isEmpty
        if (!opt.isPresent()) {
            return null;
        }

        Htb105VO vo = new Htb105VO();
        BeanUtils.copyProperties(opt.get(), vo);
        return vo;
    }


    public Object selectJohn(String name) {
        Optional<Htb105> opt = repository.findByJohn(name);

        // Java 8 只能用 isPresent，不能用 isEmpty
        if (!opt.isPresent()) {
            // 查不到 → 直接返回提示文字
            return "无此人";
        }

        Htb105VO vo = new Htb105VO();
        BeanUtils.copyProperties(opt.get(), vo);
        return vo;
    }

    // 删除
    public void delete(String acct) {
        repository.deleteById(acct);
    }
}