import pandas as pd

def bonus(x):
    return x * 2

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:

    salary = employees['salary']
    salary_bonus = salary.apply(bonus)
    employees['bonus'] = salary_bonus
    return employees