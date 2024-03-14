--2.Найти товары с нулевым остатком. Вывести имя товара и его цену.
SELECT goods.`name` AS `good_name`, prices.`value` AS `price`
FROM `quantity`
JOIN `goods` ON goods.`id` = quantity.`goods_id`
JOIN `prices` ON prices.`goods_id` = goods.`id`
WHERE quantity.`value` = 0;