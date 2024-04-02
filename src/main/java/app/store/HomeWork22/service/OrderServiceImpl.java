package app.store.HomeWork22.service;

import app.store.HomeWork22.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return basket.addItems(ids);
    }

    @Override
    public List<Integer> getItems() {
        return basket.getItems();
    }
}