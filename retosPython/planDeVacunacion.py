#RETO2: GRUPO P49 PREFERENCIAS PLAN DE VACUNACIÓN ---SILVIA MESINO MENCO---

print ("Por favor ingrese las vacunas siguiendo las convenciones a continuación:\n"
       " Pfizer (P), Moderna (M), AstraZeneca (A),\n"
       " Janssen (J), Sinovac (S), Sinopharm (I) y Sputnik V (U)")
vacunas_norte=input("Ingrese vacunas a aplicar zona norte")
vacunas_sur=input("Ingrese vacunas a aplicar zona sur")
preferencia_vacunas=input("Ingrese las vacunas de preferencia de los ciudadanos")


pv = 0
contadorn=0
contadors=0

while pv < len(preferencia_vacunas):

    
    if preferencia_vacunas[pv] in vacunas_norte:
        contadorn += 1
        
    if preferencia_vacunas[pv] in vacunas_sur:
        contadors += 1

    
    if contadorn > contadors:
        resultado="N"
    elif contadorn < contadors:
        resultado="S"
    else:
        resultado="E"
    print(resultado,end="")
    pv+=1


