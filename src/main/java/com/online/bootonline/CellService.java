package com.online.bootonline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
    public class CellService {
    @Autowired
    CellRepository cellRepository;

    public Cell createCell(Cell cell){
        return cellRepository.save(cell);
    }
    public Cell updateCell(Cell cell){
        return cellRepository.save(cell);
    }
    public void deleteCell(Cell cell){
         cellRepository.delete(cell);

    }

    public List<Cell> getAllCells(){
        List<Cell> list = new ArrayList<>();
        cellRepository.findAll().forEach(new Consumer<Cell>() {
            @Override
            public void accept(Cell cell) {
                list.add(cell);
            }
        });
        return list;
    }
}