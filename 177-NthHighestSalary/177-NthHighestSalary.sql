-- Last updated: 11/08/2026, 16:08:42
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N = N-1;
  RETURN (
    SELECT DISTINCT salary
    FROM Employee
    ORDER BY Salary DESC
    LIMIT 1 OFFSET N
  );
END