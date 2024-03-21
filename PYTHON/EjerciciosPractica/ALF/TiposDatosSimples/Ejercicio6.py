# Escribir un programa que lea un entero positivo n introducido por ele usuario y después
# muestre en pantalla la suma de todos lo enteros desde 1 hasta n.La suma de los n primeros
# enteros positivos puede ser calcilada de la siguiente forma: suma = ((n(n+1))/2)


n = int(input("Ingrese un numero n: "))
suma = ((n*(n+1))/2)

print(f"La sumatoria desde el uno hasta el numero introducido es de: {suma}")