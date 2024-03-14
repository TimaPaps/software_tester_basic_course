--4.Найти все товары производителей из Москвы. Вывести имена товаров, их цены и имена производителей.
SELECT goods.`name` AS `good_name`, prices.`value` AS `price`, manufacturer.`name` AS `manufacturer_name`
FROM `manufacturer`
JOIN `suppliers` ON suppliers.`manufacturer_id` = manufacturer.`id`
JOIN `goods` ON goods.`supplier_id` = suppliers.`id`
JOIN `prices` ON prices.`goods_id` = goods.`id`
WHERE manufacturer.`location` = 'Moscow';