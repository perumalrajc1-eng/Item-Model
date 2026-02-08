package com.PerumalRaj.Item.Model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ItemRequest {
    @NotNull(message = "id required")
    private  Long id;

    @NotBlank(message = "Name required")
    private String name;

    private  String description;
}
