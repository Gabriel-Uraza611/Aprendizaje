# Escribir un programa que pregunte al usuario una cantidad a invertir, el 
# interés anual y el número de años, y muestre por pantalla el capital obtenido 
# en la inversión.

cantidad = float(input("¿Cantidad a invertir? "))
interes = float(input("Interes porcentual anual?"))
años = int(input("Tiempoa  invertir en años"))
capital = cantidad*(interes/100+1)
print("Capitalfinal: " + str(capital))