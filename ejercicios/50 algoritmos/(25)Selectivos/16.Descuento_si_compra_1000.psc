Algoritmo Descuento_si_compra_1000
	Leer compra
	Si compra > 1000 Entonces
		descuento <- compra * 0.10
		total <- compra - decuento
	SiNo
		total <- compra 
	FinSi
	Escribir "El total a pagar es: ", total
 FinAlgoritmo
