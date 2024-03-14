--3.Найти производителя с самой большой средней ценой за товары. Вывести имя производителя и среднюю стоимость.
SELECT manufacturer.`name` AS `manufacturer_name`, AVG(prices.`value`) AS `average_value`
FROM `prices`
JOIN `goods` ON goods.`id` = prices.`goods_id`
JOIN `suppliers` ON suppliers.`id` = goods.`supplier_id`
JOIN `manufacturer` ON manufacturer.`id` = suppliers.`manufacturer_id`
GROUP BY goods.`supplier_id`
ORDER BY AVG(prices.`value`) DESC LIMIT 1;