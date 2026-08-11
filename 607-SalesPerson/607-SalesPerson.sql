-- Last updated: 11/08/2026, 16:05:20
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN
(
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c
        ON c.com_id = o.com_id
    WHERE c.name = 'RED'
);