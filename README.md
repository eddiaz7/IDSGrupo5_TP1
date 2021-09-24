# IDSGrupo5_TP1

Integrantes: 
Brau Fabián; Díaz Edwin ; Riboldi Rodrigo; Urresti Alejandro

------------------------------------------------------------------------------------
Versionado README
Version 1.0.0
  Version inicial sistema "Hola Munndo"

Version 1.1.0
  Version modificada con funcionalidaddes provienentes desde Reelase2

Version 1.2.0
  Version final con nuevas funcionalidades "Modificación A" y "Modificación B"

------------------------------------------------------------------------------------
Respuestas consignas TP1: 
2) Subir al repositorio un software de su elección (preferentemente en Java pero pueden utilizar el lenguaje y framework que deseen). Sobre este software:

b. ¿Cómo hacemos para no subir cambios de configuraciones locales? Configurar el repositorio para ignorar estos archivos. 
Rta: Para no subir los cambios de las configuraciones locales debemos editar el archivo .gitignore para agregar en el mismo los path de las carpetas que queremos ignorar, en este caso “.settings”

g. Llevar al entorno productivo Release 1. ¿Cómo lo hace siguiendo Gitflow? 
Rta: 
1) Merge de Release1 a master
2) Ir a la opción "Crear nuevo Release" en gitflow 
3) Seleccionar como Target "master" 
4) Crear un tag. "v1.0.0" 
5) Hacer un "Publish Release"


h. Lograr un merge de ambas ramas con master. Publicar una nueva versión. 

  Rta:
  1) Merge de Release2 a master
  2) Si no hay conflicto - Ir a la opción "Crear nuevo Release" en gitflow. Si hay conflito corregirlo y luego corregir y luego crear el "Crear nuevo Release"
  3) Seleccionar como Target "master" 
  4) Crear un tag. "v1.1.0" 
  5) Hacer un "Publish Release"


i. Crear otra rama para incorporar una nueva funcionalidad. 
  Rta: Se creó una rama de desarrollo (dev)

k. Llevar los cambios de la rama creada en el punto i a producción. ¿Cómo lo hace siguiendo Gitflow? Rta: Nosotros en este item no seguimos Gitflow, seguimos los siguientes pasos:
Rta:
1) Creamos rama "Release3"
2) Realizamos "Pull-request" desde "dev" directamentea a la rama "Release3", confirmamos PullRequest y  mergeamos
3) Realizamos "Pull-request" desde "Release3" directamentea a la rama "master"
4) Confirmamos Pull-Request en master
5) "Crear nuevo Release" en gitflow
6) Seleccionar como Target "master"
7) Crear un tag. "v1.2.0".
8)Hacer un "Publish Release"



¿Cómo podemos documentar con git? a. Realizar un readme para el código subido. ¿Qué documentarían allí? Versionar el README en el repositorio. Rta: Documentaríamos:

Descripción de las funcionalidades
Contexto donde fue desarrollado
Los problemas de desarrollo que se resolvieron
Guia de instalación
Autores de la documentación
b. Si un externo realiza una modificación, necesitamos entender el cambio realizado (PR o Pull Request). ¿Qué datos le pediría a esa persona que complete? ¿Qué nos ofrece GitHub para ayudarnos con esto? Al la persona que lo publicó le pediría:

¿cuál es el motivo que motivó el cambio?
¿qué problema intentó resolver y cómo?
¿quén solicitó el cambio? Github nos ofrece información detallada tanto del autor como del código de los cambios realizados, el momento en que lo hizo y sobre que rama del proyecto.
