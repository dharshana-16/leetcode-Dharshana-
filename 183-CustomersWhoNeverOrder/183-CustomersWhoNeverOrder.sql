-- Last updated: 11/08/2026, 16:08:22
# Write your MySQL query statement below
SELECT name as Customers
from Customers
where id not in(
    select customerId
    from Orders
);