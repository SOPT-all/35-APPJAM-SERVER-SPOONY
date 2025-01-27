package com.spoony.spoony_server.domain.post.repository;

import com.spoony.spoony_server.domain.post.entity.CategoryEntity;
import com.spoony.spoony_server.domain.post.enums.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    Optional<CategoryEntity> findByCategoryId(Long postId);

    List<CategoryEntity> findByCategoryType(CategoryType categoryType);
}
