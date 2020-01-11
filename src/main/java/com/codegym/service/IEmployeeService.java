package com.codegym.service;

import com.codegym.model.Department;
import com.codegym.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService extends IGeneralEmployeeService<Employee> {
    Iterable<Employee> findAllByDepartment(Department department);

    Page<Employee> findAllByDepartment_Name(String name, Pageable pageable);
}
