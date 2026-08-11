-- Last updated: 11/08/2026, 16:05:06
# Write your MySQL query statement below

SELECT *
FROM cinema c
WHERE c.id % 2 =1 
    AND 
    c.description != 'boring'
ORDER BY c.rating DESC;