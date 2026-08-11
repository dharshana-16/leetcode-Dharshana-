-- Last updated: 11/08/2026, 16:05:41
# Write your MySQL query statement below
SELECT Employee.name,Bonus.bonus FROM Employee
LEFT JOIN Bonus ON Employee.empId= Bonus.empID
WHERE bonus < 1000 OR Bonus IS NULL;