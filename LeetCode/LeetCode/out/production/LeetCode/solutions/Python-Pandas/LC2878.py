import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:

    count = [len(players), len(players.columns)]
    return count