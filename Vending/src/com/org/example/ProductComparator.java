/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.example;

import java.util.Comparator;

/**
 *
 * @author Manase
 */
class ProductComparator implements Comparator<ProductListing> {

    @Override
    public int compare(ProductListing firstItem, ProductListing secondItem) {
        return firstItem.getProduct().compareToIgnoreCase(secondItem.getProduct());
    }
}
