import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    hlp=employees.head(3)
    return hlp