import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import sklearn
import scipy


arr = np.array([1, 2, 3, 4, 5])
df = pd.DataFrame({"Number": arr})

print(df)

sns.lineplot(data=df)
plt.show()