-- Last updated: 11/08/2026, 16:08:33
# Write your MySQL query statement below
SELECT E2.name AS Employee
FROM Employee E1
JOIN Employee E2
    ON E1.id = E2.managerId
WHERE E2.salary > E1.salary;