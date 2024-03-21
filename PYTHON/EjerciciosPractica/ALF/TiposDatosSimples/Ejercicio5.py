# Escribir un programa que pregunte al usuario por el número de horas trabajadas
# y el coste por hora. Después debe mostrar por pantalla la paga que le corresponde.

horas = int(input("Ingrese la cantidad de horas que trabaja: "))
costo_por_hora = int(input("Ingrese el valor por hora: "))
pago = horas * costo_por_hora

print(f"Su salario es: {pago}")