Algoritmo costo_de_estacionamiento
	leer horas
	si horas = 1 Entonces
		total <- 20
	SiNo
		total <- 20 + (horas + 1) * 15
	FinSi
	Escribir "el costo es: ", total
FinAlgoritmo
