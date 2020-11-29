package com.mang.example.lombok.app.store.controller;

import com.mang.example.lombok.app.store.domain.Store;
import com.mang.example.lombok.app.store.service.StoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/store")
@Log4j2
public class StoreController {

    private final StoreService storeService;

    @GetMapping(value = "/list")
    private ResponseEntity list(@RequestParam(required = false, name = "searchKeyWord") String searchKeyWord) {
        List<Store> storeList = searchKeyWord == null || searchKeyWord.equals("")
                ? storeService.findAll()
                : storeService.findAllByCompanyName(searchKeyWord);
        return ResponseEntity.ok(storeList);
    }

    @PostMapping(value = "/add")
    private ResponseEntity add(@RequestBody Store storeVO) {
        log.debug(storeVO.toString());
        return ResponseEntity.ok(storeService.save(storeVO));
    }

}
