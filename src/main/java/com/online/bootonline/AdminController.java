package com.online.bootonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public void createAdmin (@RequestBody AdminLogin login){
        adminService.createAdmin(login);
    }


    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public List<AdminLogin> getAllLogins(){
        return adminService.getAllLogins();

    }/* @RequestMapping(value = "/loginone", method= RequestMethod.GET)
    public AdminLogin getadmin(@RequestBody AdminLogin login){
        return adminService.getadmin(login);

    }*/

    @RequestMapping(value="/login", method=RequestMethod.DELETE)
    public void deleteAdmin(@RequestBody AdminLogin adminLogin) {
        adminService.deleteAdmin(adminLogin);
    }
    @RequestMapping(value="/login", method=RequestMethod.PUT)
    public void updateAdmin (@RequestBody AdminLogin login){
        adminService.updateAdmin(login);
    }
}

