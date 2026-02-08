package com.PerumalRaj.Item.Model.Controller;

import com.PerumalRaj.Item.Model.Common.ApiResponse;
import com.PerumalRaj.Item.Model.Service.ItemService;
import com.PerumalRaj.Item.Model.dto.ItemRequest;
import com.PerumalRaj.Item.Model.dto.ItemResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService service;

    @PostMapping
    public ResponseEntity<ApiResponse<ItemResponse>> addItem(@Valid @RequestBody ItemRequest request){

        ItemResponse response=service.addItem(request);

        return ResponseEntity.ok(
                new ApiResponse<>("Item Created Succesfully ", response));

    }

    @GetMapping("/{id}")
    public  ResponseEntity<ApiResponse<ItemResponse>> getById(@PathVariable Long id){

        ItemResponse response=service.getById(id);

        return  ResponseEntity.ok(
                new ApiResponse<>("Fetched id Succesfully", response)
        );

    }
}
