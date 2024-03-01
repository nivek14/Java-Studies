import pandas as pd

def double(x):
    return x * 2

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:

    salary = employees['salary']
    new_salary = salary.apply(double)
    employees['salary'] = new_salary

    return employees