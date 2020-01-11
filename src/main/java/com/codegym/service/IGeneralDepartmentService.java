package com.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGeneralDepartmentService<E> {
    Iterable<E> findAll();

    E findById(Long id);

    void save(E e);

    void remove(Long id);
}
