package com.mang.example.lombok.app.store.service;

import com.mang.example.lombok.app.store.model.StoreVO;
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
    public List<StoreVO> findAll() {
        return storeRepository.findAll();
    }

    @Override
    public StoreVO save(StoreVO storeVO) {
        return storeRepository.save(storeVO);
    }

    @Override
    public Optional<StoreVO> findById(Long id) {
        return storeRepository.findById(id);
    }

    @Override
    public List<StoreVO> findAllByCompanyName(String searchKeyWord) {
        return storeRepository.findAllByCompanyNameLike(searchKeyWord);
    }

}
