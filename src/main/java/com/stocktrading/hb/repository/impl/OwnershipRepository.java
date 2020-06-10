package com.stocktrading.hb.repository.impl;

import com.stocktrading.hb.domain.impl.Ownership;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.security.access.prepost.PostAuthorize;

import java.util.List;


public interface OwnershipRepository<T extends Ownership> {
    //@PostAuthorize("hasPermission(returnObject, 'isOwner')")
    T findOneById(String id);
    Page<T> findAllBy(TextCriteria criteria, Pageable pageable);
    Page<T> findByOwner(String owner, Pageable pageable);
    Page<T> findByOwner(String owner, TextCriteria criteria, Pageable pageable);
    List<T> findByOwner(String owner);
}
