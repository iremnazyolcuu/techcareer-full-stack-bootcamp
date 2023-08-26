package com.iremnazyolcu.data.repository;

import com.iremnazyolcu.data.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


// CrudRepository yerine :
// JpaRepository ya da (bu tüm CRUD işlemlerini ve paging'i dahil eder)
// PagingAndSortingRepository'de kullanabiliriz

@Repository
// CrudRepository<entityName, pkType>
public interface ICategoryRepository extends CrudRepository<CategoryEntity, Long> {
}