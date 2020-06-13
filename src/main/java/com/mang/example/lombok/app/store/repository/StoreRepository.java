package com.mang.example.lombok.app.store.repository;

import com.mang.example.lombok.app.store.model.StoreVO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository extends JpaRepository<StoreVO, Long> {

    List<StoreVO> findAllByCompanyNameLike(String searchKeyWord);

}
