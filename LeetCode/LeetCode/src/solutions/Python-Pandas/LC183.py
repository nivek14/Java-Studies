import pandas as pd

def find_customers(customers: pd.DataFrame, orders: pd.DataFrame) -> pd.DataFrame:

    df = customers[~customers['id'].isin(orders['customerId'])]
    df = df.rename(columns={"name": "Customers"})
    final_df = pd.DataFrame(df['Customers'])
    return final_df