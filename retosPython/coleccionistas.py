#RETO FINAL CICLO 1 MISION TIC ------------SILVIA MESINO MENCO-----------------


#Funcion que obtiene los generos no repetidos de una lista de generos musicales

def generos (lista_generos):
    lista_sin_rep=[]
    contador=0
    for genero in lista_generos:
        if genero in lista_sin_rep:
            contador += 1
        else:
            lista_sin_rep.append(genero)
            contador += 1
    print (lista_sin_rep)
    return lista_sin_rep


#Funcion que devuelve la posición de un genero dado en la lista de generos

def album_que_no_tengo (posicion_genero,lista_generos,genero_dado):
    lista_posiciones=[]
    posicion=0

    while posicion < len (posicion_genero):

        indice=posicion_genero[posicion]
        if lista_generos[indice]==genero_dado:
            lista_posiciones.append(indice)
        
        posicion +=1
        
    print(lista_posiciones)
    return lista_posiciones


#Funcion que devuelve las canciones que no he escuchado de una lista de canciones

def no_he_escuchado (otras_canciones, mis_canciones):
    no_escuchadas=[]
    contador=0
    
    for cancion in otras_canciones:
        
        if cancion in mis_canciones:
            contador +=1
        else:
            no_escuchadas.append(cancion)
            contador +=1
    print(no_escuchadas)
    return no_escuchadas


'''Devuelve el numero de canciones que se pueden intercambiar
   entre dos coleccionistas'''

def para_intercambiar (otras_canciones, mis_canciones):
    intercambiar=0
    contador1=0
    contador2=0

    for cancion in mis_canciones:
        if cancion not in otras_canciones:
            contador1 += 1
            
    for cancion in otras_canciones:
        if cancion not in mis_canciones:
            contador2 += 1
            
    print (min (contador1, contador2))
    return min (contador1, contador2)


#Inicializamos variables para evaluar las funciones creadas

posicion_genero=[0,3,6,8]
lista_generos=['boleros', 'rock', 'boleros', 'boleros', 'baladas', 'baladas', 'merengue',
               'baladas', 'boleros', 'salsa', 'vallenato', 'rancheras', 'vallenato']
genero_dado='boleros'
otras_canciones=['Gracias a la vida', 'A Dios le pido', 'Bendita tu luz', 'Bésame mucho',
                 'Matador', 'Bailando', 'Pedro navaja']
mis_canciones=['A Dios le pido', 'Querida', 'Yolanda', 'Bésame mucho', 'La bamba',
               'La flaca', 'Matador', 'Gracias a la vida']


#Ejecutando las funciones para imprimir resultados
generos(lista_generos)
album_que_no_tengo (posicion_genero,lista_generos,genero_dado)
no_he_escuchado (otras_canciones, mis_canciones)
para_intercambiar (otras_canciones, mis_canciones)  
    
