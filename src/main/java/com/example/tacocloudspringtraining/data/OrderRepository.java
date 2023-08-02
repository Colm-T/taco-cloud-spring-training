package com.example.tacocloudspringtraining.data;

import com.example.tacocloudspringtraining.model.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder tacoOrder);
}
