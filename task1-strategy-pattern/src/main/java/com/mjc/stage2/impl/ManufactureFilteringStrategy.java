package com.mjc.stage2.impl;


import com.mjc.stage2.FilteringStrategy;
import com.mjc.stage2.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ManufactureFilteringStrategy implements FilteringStrategy {
    private final String manufacture;

    @Override
    public boolean filter(Product product) {
        if (manufacture == null) {
            return true;
        }

        return product.getManufacture().equalsIgnoreCase(manufacture);
    }

}
