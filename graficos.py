import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv('dados.csv')

plt.figure(figsize=(10, 6))
y = data['Tamanho do Vetor']

# Gráfico - Bubble Sort
plt.plot(data['Tempo BubbleSort (ms)'], y, label='Bubble Sort')

# # Gráfico - Insertion Sort
# plt.plot(data['Tempo InsertionSort (ms)'], y, label='Insertion Sort')

# # Gráfico - Selection Sort
# plt.plot(data['Tempo SelectionSort (ms)'], y, label='Selection Sort')

# plt.xlim(0, 1500000)
plt.xlabel('Tamanho do Vetor')
plt.ylabel('Tempo (ms)')
plt.title('Tempos de Execução em função do Tamanho')
plt.legend()
plt.grid(True)
plt.show()