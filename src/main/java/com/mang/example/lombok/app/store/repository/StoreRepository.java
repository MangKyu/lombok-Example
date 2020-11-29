package com.mang.example.lombok.app.store.repository;

import com.mang.example.lombok.app.store.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {

    List<Store> findAllByCompanyNameLike(String searchKeyWord);

}
