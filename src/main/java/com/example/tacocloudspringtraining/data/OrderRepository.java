package com.example.tacocloudspringtraining.data;

import com.example.tacocloudspringtraining.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
