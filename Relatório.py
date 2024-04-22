#Análise sobre o comportamento do *Bubblesort*:
# O método BubbleSort é o mais simples entre os demais, porém requer um número maior de comparações a serem feitas, não sendo o mais eficiente, considerando que cada elemento da posição j é comparado com o 
# elemento da próxima posição e dependendo se o número for maior que o número da próxima posição, o elemento é trocado de posição e assim por diante, até o final do vetor e será percorrido o vetor novamente 
# até todos os elementos ficarem ordenados. Podemos perceber pelo gráfico que como os vetores vão aumentando de tamanho, a execução se torna mais demorada, além de haver uma grande diferença de tempo entre 
# cada tamanho de vetor. 

####Análise sobre o comportamento do  Insertionsort: 
# O método InsertionSort é simples e eficiente, ele percorre o vetor da esquerda para a direita, deixando os elementos da esquerda ordenados enquanto percorre o vetor. Podemos perceber pelo gráfico que como os 
# vetores vão aumentando de tamanho, a execução se torna mais demorada, porém com uma pequena diferença de tempo entre os tamanhos dos vetores. 

####Análise sobre o comportamento do Selectionsort: 
# O método SelectionSort seleciona o primeiro elemento do vetor e compara esse com os números de sua direita, ao encontrar um número menor que ele, o número escolhido ocupa a posição do menor número e o número 
# escolhido passa a ser o menor que foi trocado, percorre até o final do vetor comparando os números repetindo o processo, porém se não encontrar nenhum valor menor que ele, é posicionado no lugar do primeiro 
# número escolhido, ou seja, a primeira posição do vetor e o próximo número a sua direita será o escolhido para fazer as comparações, assim até que o vetor esteja ordenado. Podemos perceber pelo gráfico que 
# como os vetores vão aumentando de tamanho, a execução se torna mais demorada, porém com diferenças de tempo condizentes com o tamanho dos vetores.   

####Análise do desempenho dos métodos entre eles: 
# O método BubbleSort foi o que demandou maior tempo de execução e realiza o maior número de comparações, ou seja, comparado com os demais métodos é ineficiente. 

# O método InsertionSort foi o que demandou menor tempo de execução e menor número de comparações realizadas, ou seja, é o mais eficiente entre os demais métodos.  

# O método SelectionSort teve um tempo de execução razoável, não sendo demorado e nem rápido , estando entre o tempo de execução do método BubbleSort e o InsertionSort, o número de comparações foi um número 
# alto, porém não tão alto quanto no método BubbleSort. 

# Portanto, dependendo do que necessita e do tamanho do vetor, deve escolher o que é melhor para as suas necessidades, porém deve ter em vista que o InsertionSort é o mais eficiente e o BubbleSort o 
# menos eficiente, neste caso. 
