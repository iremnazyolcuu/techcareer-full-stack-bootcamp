package com.iremnazyolcu.data.repository;

import com.iremnazyolcu.data.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICategoryRepository extends CrudRepository<CategoryEntity,Long> {

    // Delivered Query (Kendi sorgumu yazdım)
    Optional<CategoryEntity> findByCategoryName(String categoryName);
}
