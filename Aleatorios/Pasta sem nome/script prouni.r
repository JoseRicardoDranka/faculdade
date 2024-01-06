notasSemNa = na.omit(cursos_prouni$nota_integral_ampla)
library(lsr)

mean(notasSemNa)#media
median(notasSemNa)#mediana
modeOf(cursos_prouni$nota_integral_ampla)#moda
maxFreq(cursos_prouni$nota_integral_ampla)#frequencia da moda
min(notasSemNa)#minimo
max(notasSemNa)#maximo
range(notasSemNa)#amplitude
IQR(notasSemNa)# amplitude interquartil
desvioAbs = abs(notasSemNa -media ) #desvioabsoluto
desvioquadradomedia =(desvioAbs * desvioAbs) #desvio quadrado da media
variancia = mean (desvioquadradomedia) #variancia
desviopadraomedia = mean(desvioAbs)
 print(desvioAbs)
 print(desvioquadradomedia)
 print(variancia)
 print(desviopadraomedia)