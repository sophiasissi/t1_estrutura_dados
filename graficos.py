import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv('dados.csv')

plt.figure(figsize=(10, 6))

# Gráfico - Bubble Sort
plt.plot(data['Tamanho do Vetor'], data['Tempo Bubble (ms)'], label='Bubble Sort')

# Gráfico - Insertion Sort
plt.plot(data['Tamanho do Vetor'], data['Tempo Insertion (ms)'], label='Insertion Sort')

# Gráfico - Selection Sort
plt.plot(data['Tamanho do Vetor'], data['Tempo Selection (ms)'], label='Selection Sort')

plt.xlabel('Tamanho do Vetor')
plt.ylabel('Tempo (ms)')
plt.title('Comparação de Tempos de Ordenação')
plt.legend()
plt.grid(True)
plt.show()
