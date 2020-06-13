package com.mang.example.lombok.app.store.service;

import com.mang.example.lombok.app.store.model.StoreVO;

import java.util.List;
import java.util.Optional;

public interface StoreService {

    List<StoreVO> findAll();

    StoreVO save(StoreVO storeVO);

    Optional<StoreVO> findById(Long id);

    List<StoreVO> findAllByCompanyName(String searchKeyWord);
}
