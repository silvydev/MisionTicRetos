#RETO1: GRUPO P49 FASES PLAN DE VACUNACIÓN ---SILVIA MESINO MENCO---

#DEFINIMOS LA FUNCIÓN PRINCIPAL->MAIN
def main():
  global cantidad_astrazeneca
  cantidad_astrazeneca=int(input("Por favor ingrese cantidad Astrazeneca"))

#DEFINIMOS LA FUNCIÓN PARA REALIZAR LOS CALCULOS

def calculo_estimacion(cantidad_astrazeneca):
  global fase
  cantidad_pfizer=(cantidad_astrazeneca * 2) + 4
  cantidad_janssen=int((cantidad_astrazeneca + cantidad_pfizer)/5)

  if  cantidad_janssen>=0 and cantidad_janssen <= 20:
    fase="uno"
  elif  cantidad_janssen>=21 and cantidad_janssen <= 30:
    fase="dos"
  elif  cantidad_janssen>=31 and cantidad_janssen <= 50:
    fase="tres"
  else:
    fase="cuatro"

  
  return cantidad_astrazeneca, cantidad_pfizer,cantidad_janssen

#INICIALIZAMOS VARIABLES
cantidad_astrazeneca=0
cantidad_pfizer=0
cantidad_janssen=0
fase=""


#INGRESA DATOS
main()

#IMPRIME DATOS
print (calculo_estimacion(cantidad_astrazeneca))
print(fase)



  
