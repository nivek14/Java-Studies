import pandas as pd

def meltTable(report: pd.DataFrame) -> pd.DataFrame:

    report = report.melt(id_vars=['product'])
    report = report.rename(columns={"variable": "quarter", "value": "sales"})
    return report