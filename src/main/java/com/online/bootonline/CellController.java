package com.online.bootonline;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CellController {
    @Autowired
    CellService cellService;
  /*  @RequestMapping(value={"/","/home"}, method=RequestMethod.GET )
    public String home(){
        return "home";
    }*/

@RequestMapping(value = "/cell", method= RequestMethod.GET)
    public List<Cell> getAllCells(){
        return cellService.getAllCells();

    }
    @RequestMapping(value="/cell", method=RequestMethod.POST)
    public void createCell (@RequestBody Cell cell){
        cellService.createCell(cell);
    }

    @RequestMapping(value="/cell/{id}", method=RequestMethod.DELETE)
    public void deleteCell(@PathVariable int id) {
        cellService.deleteCell(id);
    }
    @RequestMapping(value="/cell", method=RequestMethod.PUT)
    public void updateCell (@RequestBody Cell cell){
        cellService.updateCell(cell);
    }
}