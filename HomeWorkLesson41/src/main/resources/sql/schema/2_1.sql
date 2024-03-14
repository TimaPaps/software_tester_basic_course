--1.Найти самый дорогой товар. Вывести имя товара и его цену.
SELECT goods.`name` AS `good_name`, prices.`value` AS `max_price`
FROM `prices`
JOIN `goods` ON goods.`id` = prices.`goods_id`
WHERE prices.`value` = (SELECT MAX(prices.`value`) FROM `prices`);

-- еще один вариант с тем же результатом
SELECT goods.`name` AS `good_name`, MAX(prices.`value`) AS `max_price`
FROM `prices`
JOIN `goods` ON goods.`id` = prices.`goods_id`
GROUP BY prices.`value`
ORDER BY prices.`value` DESC LIMIT 1;