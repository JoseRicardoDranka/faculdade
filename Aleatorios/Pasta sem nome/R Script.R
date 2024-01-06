sum(notas$Nota)/348
median(notas$Nota)
sort(notas$Nota)

library(lsr)

modeOf(notas$Nota)
maxFreq(notas$Nota)

media = mean(notas$Nota)
desvioAbsoluto = abs(notas$Nota - media)
absaoquadrado =desvioAbsoluto * desvioAbsoluto
abs = mean(desvioAbsoluto)
variancia = mean(absaoquadrado)
desviopadrao = sqrt(variancia)
print(abs)
print(variancia)
print(desviopadrao)
