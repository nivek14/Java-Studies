import pandas as pd

def fix_names(users: pd.DataFrame) -> pd.DataFrame:

    df = users['name'].str.lower()
    df = df.str.capitalize()
    df_final = df.to_frame()
    users['name'] = df_final['name']
    users = users.sort_values(by=['user_id'])
    return users