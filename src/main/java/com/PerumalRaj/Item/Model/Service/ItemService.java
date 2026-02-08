package com.PerumalRaj.Item.Model.Service;

import com.PerumalRaj.Item.Model.Exception.ItemNotFoundException;
import com.PerumalRaj.Item.Model.Mapper.ItemMapper;
import com.PerumalRaj.Item.Model.Model.Item;
import com.PerumalRaj.Item.Model.dto.ItemRequest;
import com.PerumalRaj.Item.Model.dto.ItemResponse;
import com.PerumalRaj.Item.Model.repositary.ItemRepositary;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ItemService {

    private  final ItemRepositary repositary;
    private  final ItemMapper mapper;

     public ItemResponse addItem(ItemRequest request){
         log.info("Adding new item: {}",request.getName());
         Item item= mapper.toEntity(request);
         repositary.save(item);

         return mapper.toResponse(item);
     }

     public  ItemResponse getById(Long id){

         log.info("Fetching item{}", id);
         Item item=repositary.findById(id)
                 .orElseThrow(() -> new ItemNotFoundException(" Item not found :"+  id));

         return mapper.toResponse(item);
     }

}
