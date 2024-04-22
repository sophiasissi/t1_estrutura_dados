import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv('dados.csv')

plt.figure(figsize=(10, 6))

# Gráfico - Bubble Sort
plt.plot(data['Tempo BubbleSort (ms)'], data['Tamanho do Vetor'], label='Bubble Sort')

# Gráfico - Insertion Sort
plt.plot(data['Tempo InsertionSort (ms)'], data['Tamanho do Vetor'], label='Insertion Sort')

# Gráfico - Selection Sort
plt.plot(data['Tempo SelectionSort (ms)'], data['Tamanho do Vetor'], label='Selection Sort')

plt.xlim(0, 1500000)
plt.xlabel('Tamanho do Vetor')
plt.ylabel('Tempo (ms)')
plt.title('Tempos de Execução em função do Tamanho')
plt.legend()
plt.grid(True)
plt.show()