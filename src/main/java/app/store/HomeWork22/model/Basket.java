package app.store.HomeWork22.model;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class Basket {
    private final List<Integer> items = new ArrayList<>();

    public List<Integer> addItems(List<Integer> ids) {
        items.addAll(ids);
        return items;
    }

    public List<Integer> getItems() {
        return items;
    }
}
