import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv('dados.csv')

x = data['Tamanho do Vetor']

# Gráfico - Insertion Sort
plt.plot(x, data['Tempo InsertionSort (ms)'], label='Insertion Sort')

plt.xlabel('Tamanho do Vetor')
plt.ylabel('Tempo (ms)')
plt.title('Tempos de Execução em função do Tamanho')
plt.legend()
plt.grid(True)
plt.show()