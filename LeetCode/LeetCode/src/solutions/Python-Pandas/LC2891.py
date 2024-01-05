import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:

    df = pd.DataFrame(animals)
    df = df[df['weight'] > 100].sort_values(by='weight', ascending=False)
    final_df = pd.DataFrame(df, columns =['name'])
    return final_df