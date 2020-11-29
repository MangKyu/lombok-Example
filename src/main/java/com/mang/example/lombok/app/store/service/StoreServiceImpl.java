package com.mang.example.lombok.app.store.service;

import com.mang.example.lombok.app.store.domain.Store;
import com.mang.example.lombok.app.store.repository.StoreRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service("storeService")
public class StoreServiceImpl implements StoreService {

    @NonNull
    private StoreRepository storeRepository;

    @Override
    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    @Override
    public Store save(Store storeVO) {
        return storeRepository.save(storeVO);
    }

    @Override
    public Optional<Store> findById(Long id) {
        return storeRepository.findById(id);
    }

    @Override
    public List<Store> findAllByCompanyName(String searchKeyWord) {
        return storeRepository.findAllByCompanyNameLike(searchKeyWord);
    }

}
