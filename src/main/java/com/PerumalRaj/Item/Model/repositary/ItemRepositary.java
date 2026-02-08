package com.PerumalRaj.Item.Model.repositary;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import com.PerumalRaj.Item.Model.Model.Item;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepositary {

    private  final List<Item> store=new CopyOnWriteArrayList<>();

    public  Item save(Item item){
        store.add(item);
        return  item;
    }

    public Optional<Item> findById(Long id){
        return  store.stream().filter( i -> i.getId().equals(id)).findFirst();
    }
}
