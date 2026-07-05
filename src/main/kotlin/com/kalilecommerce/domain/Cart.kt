package com.kalilecommerce.com.kalilecommerce.domain

import com.kalilecommerce.product.domain.Product
import java.util.UUID

interface Cart {
    val id: UUID
    val buyer: Buyer
    val items: List<Product>
}
