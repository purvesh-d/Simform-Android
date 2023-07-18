package com.example.androiddemoproject.revision.koans

// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
private fun findMostExpensiveProductBy(customer: Customer): Product? =
    customer.orders
        .filter { it.isDelivered }
        .flatMap { it.products }
        .maxByOrNull { it.price }

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
private fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int =
    customers.flatMap { it.getOrderedProducts() }.count { it == product }

private fun Customer.getOrderedProducts(): Sequence<Product> =
    orders.flatMap(Order::products).asSequence()