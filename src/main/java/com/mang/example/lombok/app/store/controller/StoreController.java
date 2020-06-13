package com.mang.example.lombok.app.store.controller;

import com.mang.example.lombok.app.store.model.StoreVO;
import com.mang.example.lombok.app.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/store")
@Log4j2
public class StoreController {

    @Resource(name = "storeService")
    private StoreService storeService;

    @GetMapping(value = "/list")
    private ResponseEntity list(@RequestParam(required = false, name = "searchKeyWord") String searchKeyWord){
        List<StoreVO> storeList;
        if(searchKeyWord == null || searchKeyWord.equals("")){
            storeList = storeService.findAll();
        } else {
            storeList = storeService.findAllByCompanyName(searchKeyWord);
        }
        return ResponseEntity.ok(storeList);
    }

    @GetMapping(value = "/add")
    private ResponseEntity add(@RequestBody StoreVO storeVO){
        log.debug(storeVO.toString());
        return ResponseEntity.ok(storeService.save(storeVO));
    }


}
