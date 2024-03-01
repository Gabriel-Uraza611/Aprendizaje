# PROGRAMA : GENERADOR DE CONTRASEÑAS
#* Integrante 1: Gabriel Uraza García - 2359594-3743
#* Integrante 2: David Ortega Ruiz - 2359530
#* Integrante 3: Sebastian Zacipa Marinez - 2359695
#? Docente: Luis German Toro Pareja
#* Grupo 51

#*Importacion de librerias
import random
import tkinter as tk
import customtkinter as ctk
from tkinter import messagebox
import hashlib
from PIL import Image, ImageTk

def password_generator(): #*Se crea la funcion que genera las contraseñas
    #? Se definen las varibales que seran globales
    global show
    global password
    global digits

    mayusculas = [ #? Se crea un lista que contiene todas las mayusculas
        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q',
        'R','S','T','U','V','W','X','Y','Z'
    ]
    
    minusculas = [ #? Se crea un lista que contiene todas las minusculas
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
        'r','s','t','u','v','w','x','y','z'
    ] 

    numeros = ['1','2','3','4','5','6','7','8','9'] #?Contiene los numeros

    especiales = ['@','/','?','!','#','-','_','$','&'] #?caracteres especiales

    #?Se crea una lista que contiene todas las posibles listas
    caracteres = [mayusculas, minusculas, numeros, especiales]

    #? Se crea la lista digits, la cual va a tener contenida a la contraseña
    #?Se asignan 4 posiciones donde si o si se tiene un caracter de cada lista
    digits = [
        random.choice(mayusculas), random.choice(minusculas),
        random.choice(numeros), random.choice(especiales)
    ]

    #? Se genera un bucle for que agrega otras 4 opciones aleatorias 
    for i in range(4):
        digits.append(random.choice(caracteres[i]))
    
    #? Se usa el metodo shuffle para mezclar las posiciones de los caracteres
    random.shuffle(digits)

    #?Se agregan los caracteres S o M y 7 u 8 al inicio y final 
    digits.insert(0, random.choice(['S','M'])) 
    digits.append(random.choice(['7','8']))

    #?Se convierte la contraseña en un cadena de texto
    password = ''.join(digits)

    #? Se hace para borrar la contraseña mostrada anteriormente, con el
    #? fin de que no se superpongan las contraseñas, por eso se llama a la
    #? funcion show password
    show_password()

    return password

show = None

def show_password(): #* Funcion que muestra la contraseña generada
    global show
    if show is not None:
        show.destroy()

    #? Se asigna password para q pueda ser mostrada en pantalla
    show = tk.Label(root, text=password, font=("Times New Roman", 24))
    show.place(relx=0.5, rely=0.35, anchor=tk.CENTER)

    #?Se llama a la funcion take decision para que le pregunte al usuario si
    #? desea guardar esta contraseña, generar otra o cerrar el programa
    take_decision()

def take_decision(): #*Funcion que pregunta al usuario que hacer
    #* Texto que pregunta si desea guardar la contraseña
    question_text = ctk.CTkLabel(
        root, text='¿Deseas guardar esta contraseña?',
        font=("Times New Roman", 15))
    question_text.place(relx=0.5, rely=0.42, anchor=tk.CENTER)

    #* Boton para generar otra contraseña
    new_password_button = ctk.CTkButton(
    root, text="Generar Otra", command=password_generator)
    new_password_button.place(relx=0.66, rely=0.5, anchor=tk.CENTER)
    new_password_button.configure(fg_color=("red", "red")) #? Color del boton

    #*Boton para guardar la contraseña
    save_password_button=ctk.CTkButton(
    root, text="Guardar Contraseña", 
    command = lambda: [comparison(), password_generator()]
    )#! Se le asignan dos funciones al boton save, para que genere una nueva
    #!Contraseña automaticamente despues de guardar la contraseña seleccionada
    #!Esto con el fin de que no se guarde la misma contraseña 2 veces
    save_password_button.place(relx=0.33, rely=0.5, anchor=tk.CENTER)
    save_password_button.configure(fg_color=("red", "red")) #? Color del boton
    
    #*Boton que permite cerrar el programa
    close_button = ctk.CTkButton(
    root, text="Cerrar", command=root.destroy)
    close_button.place(relx=0.5, rely=0.6, anchor=tk.CENTER)
    close_button.configure(fg_color=("red", "red")) #? Color del boton

def comparison(): #*Funcion que compara la contraseña con las contraseñas
    #* se llama a las contraseñas que estan guardadas en el txt
    with open('contraseñas.txt', 'r') as f:
        lines = f.readlines()
    #*Se crea una variable booleana que nos ayudara a comparar
    coincidences_found = False
    #?Se genera un bucle que recorra cada elemento de lineas y se usa el 
    #?metodo .strip() para quitar los \n
    for line in lines:
        line = line.strip()

    for i in range(len(lines)): #*Bucle que inicia la comparacion
        if line == '': #?Esto permite que se guarde por primera vez
            save_password()
        else:
            coincidences = 0 #?variable acumulativa 
            for j in range(10): #? 10 porque eso miden todas las contraseñas
                if digits[j] in lines[i]:
                #? Si hay un digito de la contraseña en alguna posicion del
                #?elemento i de la lista lineas
                    coincidences += 1 #?se agrega una coincidencia
                    if coincidences == 8: #? si se tienen 8 o mas 
                        coincidences_found = True #?toma el valor True
                        #! Se avisa que no se puede guardar la contraseña
                        messagebox.showwarning("Advertencia",
                        "No se pudo guardar tu contraseña")
                        break #!Se rompe el bucle j
            if coincidences_found: #! Si es True se rompe el bucle i
                break
    #! Si la variable booleana sigue siendo False, se  guarda las contraseña
    if not coincidences_found: 
        save_password()

def save_password(): #* Funcion que guarda la contraseña
    #? Primero se debe de codificar la cadena a el formato utf-8
    encoded_password = password.encode('utf-8')
    #? Se crea el hash obj que tiene el sha256
    hash_obj = hashlib.sha256()
    #?Se actualiza la contraseña codificada con el sha256
    hash_obj.update(encoded_password)
    #? La contraseña es incriptada
    encrypted_password = hash_obj.hexdigest()

    #? Se envia la contraseña encriptada al txt
    with open('contraseñas.txt', 'a') as archive:
        archive.write(encrypted_password + "\n")
    #? Se le informa al usuario que la contraseña fue guardada exitosamente
    messagebox.showinfo("Informacion", 
    "Tu contraseña ha sido guardada  correctamente")

def main():
    global root

    root = ctk.CTk() #* Se crea la ventana principal 'root' con ctk

    ctk.set_appearance_mode("Light") #*Se le asigna un modo claro a la ventana

    #*Se asigna el titulo de la ventana
    root.title('Banc Univalle - Generador de Contraseñas') 

    root.geometry('500x500') #*Se asigna un tamaño a la ventana

    #? Se usa resizable para que el usuario no pueda modificar el tamaño de la 
    #? ventana
    root.resizable(0, 0) 

    #?Se le pone un icono  a la ventana
    #! El formato de la imagen debe ser .ico
    root.iconbitmap('icono.ico')

    #? Se convierte una imagen png para q sea compatible con tkinter
    #! Todos los Archivos multimedia deben de estar en la carpeta dl programa 
    logo = Image.open('logo.png')
    logo = logo.resize((80,110)) #* Se le asigna el tamaño a la imagen
    logo_tk = ImageTk.PhotoImage(logo) #* Se convierte para usar en tkinter

    #? Se le asigna una posicion
    logo_label = tk.Label(root, image=logo_tk, width=100, height=100)
    logo_label.pack()
    logo_label.place(x=0, y=400)

    #? Esto hace que el cursor tome una forma distinta mientras este sobre la
    #? ventana
    root.config(cursor = 'hand2') 

    #* Se crea in titulo dentro de la ventana
    title_text = ctk.CTkLabel(
        root, text="GENERADOR DE CONTRASEÑAS",
    font=('Times New Roman',30)
    )

    #* el .pack() sirve para mostrar el widget generado dentro de la ventana
    title_text.pack()

    #* Se crea un texto de bienvenida para el usuario
    greeting_text = ctk.CTkLabel(
        root, text="""Bienvenido al generador de contraseñas de Banc Univalle.
    Porfavor de click al boton 'generar contraseña' para generar una nueva 
    contraseña, o click en 'cancelar' para cancelar el proceso""",
    font=('Times New Roman',15)
    )
    greeting_text.pack()

    #* Se genera el boton de generar contraseña
    generator_button = ctk.CTkButton(
        root, text="Generar constraseña", command=password_generator)
    generator_button.place(relx=0.333, rely=0.24, anchor=tk.CENTER)
    generator_button.configure(fg_color=("red", "red")) #? Color del boton

    #* Se genera el boton para cancelar el proceso
    cancel_button = ctk.CTkButton(
        root, text="Cancelar", command=root.destroy)
    cancel_button.place(relx=0.666, rely=0.24, anchor = tk.CENTER)
    cancel_button.configure(fg_color=("red", "red")) #? Color del boton

    root.mainloop() #! Bucle que permite que la ventana mantenga abierta

if __name__ == '__main__':
    main()