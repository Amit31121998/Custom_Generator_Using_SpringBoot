package com.amit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.amit.entity.OrderDetailsEntity;

public interface OrderDetailsRepository extends CrudRepository<OrderDetailsEntity, Serializable>{

}
