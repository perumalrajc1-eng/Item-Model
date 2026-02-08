package com.PerumalRaj.Item.Model.Mapper;

import com.PerumalRaj.Item.Model.Model.Item;
import com.PerumalRaj.Item.Model.dto.ItemRequest;
import com.PerumalRaj.Item.Model.dto.ItemResponse;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item toEntity(ItemRequest request){
        return  new Item(request.getId(),request.getName(),request.getDescription());
    }

    public ItemResponse toResponse(Item item){
        return new ItemResponse(item.getId(),item.getName(),item.getDescription());
    }
}
