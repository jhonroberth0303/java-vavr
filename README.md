# java-vavr
Este proyecto esta hecho con el fin de estudiar la libreria vavr 2023 scotiabank

# Conceptos basicos de programacion funcional

## Efectos secundarios
Una funcion o expresión tiene un efecto secundario si modifica algún estado fuera de su entorno local,
es decir, tiene una interacción observable con el mundo exterior ademas devolver un valor.

#### Cambiar objetoso variables 
#### Imprimir en consola
#### Escribir en un archivo
#### Escribir en una base de datos

## Transparencia referencial
Una funcion o una expresion, se llama referencialmente transparente si una llamada puede ser reemplazada 
por su valor sin afectar el comportamiento del programa.

#### Referencialmente transparente - Math.max(1, 2);
#### No es referencialmente transparente - Math.random();

## Valore inmutables
Son seguros a subprocesis y ejeciciones concurrentes de los hilos
Son inherentemente seguros para subprocesos y, por tanto, no necesitan estar sincronizados.
No necesita ser clonado.
No se necesita saber el historial completo del bloque de código y sus ejecuciones


## Estructuras de datos funcionales

