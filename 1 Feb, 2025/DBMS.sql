-- Problem: Customers Who Never Order

-- SELECT c.name AS Customers 
-- FROM Customers c
-- LEFT JOIN Orders o
-- ON c.id = o.customerId
-- WHERE o.id IS NULL;

SELECT name AS Customers
FROM Customers 
LEFT JOIN Orders 
ON Customers.id = Orders.customerId
WHERE Orders.id IS NULL; -- Filters out only those customers who do not placed any order, Orders.id is the primary key of Orders table and must be NULL if no order exists...

-- Ye table bnegi left join se...
-- +----+-------+----------+------------+
-- | id | name  | order_id | customerId |
-- +----+-------+----------+------------+
-- | 1  | Joe   | 2        | 1          |
-- | 2  | Henry | NULL     | NULL       |
-- | 3  | Sam   | 1        | 3          |
-- | 4  | Max   | NULL     | NULL       |
-- +----+-------+----------+------------+
