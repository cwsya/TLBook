package org.cwsya.tlbook.controller;

import org.cwsya.tlbook.mapper.AdminMapper;
import org.cwsya.tlbook.domain.DO.AdminDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/test")
public class tser {
    @Autowired
    private AdminMapper adminMapper;

    @RequestMapping("/admin")
    public List<AdminDO> getAdminDO(){
        return adminMapper.selectList(null);
    }
}
