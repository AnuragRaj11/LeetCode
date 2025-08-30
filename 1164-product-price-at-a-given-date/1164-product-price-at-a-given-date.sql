SELECT product_id,
MAX(CASE WHEN change_date <= '2019-08-16' THEN new_price ELSE 10 END) AS price
FROM Products
GROUP BY product_id