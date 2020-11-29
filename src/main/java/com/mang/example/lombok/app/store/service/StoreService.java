package com.mang.example.lombok.app.store.service;

import com.mang.example.lombok.app.store.domain.Store;

import java.util.List;
import java.util.Optional;

public interface StoreService {

    List<Store> findAll();

    Store save(Store storeVO);

    Optional<Store> findById(Long id);

    List<Store> findAllByCompanyName(String searchKeyWord);
}
