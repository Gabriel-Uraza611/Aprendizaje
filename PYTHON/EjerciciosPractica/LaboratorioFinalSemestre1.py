
#*Nombre : Gabriel Uraza García
#*Codigo : 2359594-3743
#*Monitor : Alejandro Sierra Betancourt
#*Laboratorio 5

#!Importacion de librerias
import numpy as np  #? Numpy para arreglos
from tabulate import tabulate #? tabulate para tablas
import time #? time para controlar el tiempo entre prints
from colorama import init, Fore, Back, Style #? colorama para color en consola

#!Funciónes type racer
#!Estas funciones permitiran mostrar el texto en la consola de forma progresiva
#!para darle un efecto similar al del dialogo de un rpg, esto es simplemente
#!por estetica del manejo del codigo en consola

def typeracer_print(text): #?typeracer para prints
    for character in text: #*bucle que recorre los caracteres del str
        #? 'end' para imprimir sin salto y flush fuerza la impresión inmediata 
        #? en la consola
        print(character, end='', flush=True)
        time.sleep(0.03) #*tiempo en el que se imprime cada caracter
    print() #*Genera un salto de linea

def typeracer_input(message): #?Typeracer para inputs
    for character in message:
        print(character, end='', flush=True)
        time.sleep(0.02)
    entry = input() #?esto hace que no sea solo un print sino un input
    return entry #?retorna el dato recolectado en forma de string
    #! Si los datos recogidos son int, se tendran que castera com int cuando
    #! sean usados, ya que siempre se tomara el input como str

#! Fucion que genera la matriz

def money_calculator(a, b): #*Recibe 2 parametros para generar la matriz segun los datos
    #?Se generan los arreglos empty con tipo de dato = objeto para que el
    #?arreglo reciba cualquier clase de dato
    payroll = np.empty((b,2), dtype= object) #! arreglo nominas
    #! se le agrega un +1 para crear la final en donde van los titulos 
    #! Se le agrega un +2 para la columna de salario y la de empleados

    data = np.empty((a + 1, b +2), dtype=object) #! arreglo salarios

    #* Se genern dos 'titulos' en la matriz que indica la columna de empleados
    #* al comienzo y la columna de salario al final
    data[0][0] = 'Empleados'
    data[0][-1] = 'Salario'

    for i in range(b): #? El bucle escribe como 'titulo' semana (numero de la
    #? semana) segun la columna correspondiente, ej semana 1, semana 2 etc...
        data[0][i + 1] = f'Semana {i+1}'

    for j in range(a): #*En este bucle se comienza a recorrer la matriz
        typeracer_print(f'empleado {j+1}') #* Se imprime el No. empleado
        name = typeracer_input('Ingrese su nombre: ').title()#*Input nombre
        data[j+1][0] = name #? Se agrega el nombre en la matriz siempre en 
        #? la columna 0, solo se cambia la posicion de la fila con j+1, se le
        #?agrega 1 ya que en la fila 0 esta el titulo 'empleados'
        hours = 0 #* Variable acumulativa horas
        for k in range(b):#? Bucle anidado que pregunta segun las semanas
            #* Toma el valor de hora por semana x
            hour = typeracer_input(
                f'Ingrese la cantidad de horas trabajadas en la semana {k+1}: '
            )
            data[j+1][k+1] = int(hour) #* Se agrega a la columna de semana x
            hours += int(hour) #? Se acumula en hora en horas

            #!Como la matriz se creo con empty, cada valor es = None, por lo
            #! tanto, si hay un none, le decimos a la matriz que este None 
            #!Sera = 0, esto con el fin de poder acumular las horas, ya que
            #! no se pueden sumar int con None Objects

            if payroll[k][1] == None:
                payroll[k][1] = 0
                payroll[k][1] += int(hour) * 10_000 #!Esto es para la nomina
            elif payroll[k][1] != 0:
                payroll[k][1] += int(hour) * 10_000 #?valor acumulativo
            payroll[k][0] =  f'Semana {k+1}' #? Indicador de semanas en nomina
        data[j+1][-1] = hours * 10_000 #!Esto es para los salarios

    #? Se crea un print que indica el titulo de la tabla que se mostrara
    salary_text = \
    '____________________________SALARIOS__________________________________'

    #? Se usa la libreria colorama para dar color al titulo y a la tabla
    typeracer_print(Style.BRIGHT + Fore.CYAN + salary_text)

    #* Se imprime la tabla
    print(tabulate(data,  tablefmt='fancy_grid'))

    #? Se crea un print que indica el titulo de la tabla que se mostrara
    payroll_text = \
    '_____________________________NOMINA__________________________________'
    #? Se usa la libreria colorama para dar color al titulo y a la tabla
    typeracer_print(Style.BRIGHT + Fore.MAGENTA + payroll_text)

    #* Se imprime la tabla
    print(tabulate(
        payroll, headers=['Semanas','NominaXsem'], tablefmt='fancy_grid')
    )

def main(): #*Funcion principal 'main'

    #? Se genera un texto introductorio al programa
    greeting_text = '''Bienvenido a nuestro sistema de pago de nominas, a 
continuaciónse le haran una serie de preguntas con el fin de calcular el 
salario total de los empleados y mostrar cuanto se gasta la empresa en pago de 
nomina por semana'''

    #? Se usa colorama para dar color al texto y se imprime con la funcion
    #?typeracer
    typeracer_print(Style.BRIGHT + Fore.GREEN + greeting_text)
    
    #? Se genera la variable que recolecta el numero de empleados
    employees = typeracer_input('Ingrese la cantidad de empleados: ')
    
    #?Se genera la variable que recolecta el numero de semanas trabajadas
    weeks = typeracer_input('Ingrese la cantidad de semanas trabajadas: ')
    
    #? Se llama a la funcion que calculara el valor de los salarios, la nomina
    #? y los mostrara en una tabla
    money_calculator(int(employees), int(weeks))

    #*Se inserta un texto de despedida al final de la ejecucion del programa
    farewell_text = \
    'Espero que nuestro servicio haya sido de tu agrado. \n \
¡Que tengas un excelente día! '

    typeracer_print(Style.BRIGHT + Fore.GREEN + farewell_text)


if __name__ == '__main__':
    #*Se llama a la funcion principal
    main()




































































