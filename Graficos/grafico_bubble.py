import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv('dados.csv')

x = data['Tamanho do Vetor']

# Gráfico - Bubble Sort
plt.plot(x, data['Tempo BubbleSort (ms)'], label='Bubble Sort')

plt.xlabel('Tamanho do Vetor')
plt.ylabel('Tempo (ms)')
plt.title('Tempos de Execução em função do Tamanho')
plt.legend()
plt.grid(True)
plt.show()