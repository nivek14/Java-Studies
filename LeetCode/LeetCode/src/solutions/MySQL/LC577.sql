SELECT name, bonus FROM Bonus
RIGHT JOIN Employee
ON Employee.empId  = Bonus.empId
WHERE Bonus.bonus < 1000 OR Bonus.bonus IS NULL