-- Last updated: 11/08/2026, 16:08:39
# Write your MySQL query statement below
SELECT 
score,
DENSE_RANK() OVER(ORDER BY score DESC) AS 'rank'
FROM Scores 
ORDER BY score DESC;