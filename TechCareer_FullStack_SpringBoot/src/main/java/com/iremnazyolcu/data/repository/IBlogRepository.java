package com.iremnazyolcu.data.repository;

// JpaRepository
// CrudRepository
// PagingAndSortingRepository

import com.iremnazyolcu.data.entity.BlogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends CrudRepository<BlogEntity, Long> {

    // buraya query'ler atacağız :
    // Delivered Query
    BlogEntity findBlogEntityByBlogEntityEmbeddableHeader(String header);

}