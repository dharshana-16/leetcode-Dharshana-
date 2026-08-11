-- Last updated: 11/08/2026, 16:05:26
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;