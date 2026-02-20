# VariablesYOperadores
Este programa se realizó en Java con el propósito de comprender cómo funcionan las variables, los tipos de variables y los operadores.

## Funcionalidades
El programa tiene un menú con las siguientes opciones:
1. **Declaración de Variables** - Permite ingresar diferentes tipos de datos (int, double, String, boolean)
2. **Operaciones Matemáticas** - Realiza operaciones con distintos tipos numéricos (int, double, float, short, byte)
3. **Operaciones Lógicas** - Compara valores usando operadores de comparación y lógicos
4. **Clasificación de Edad** - Clasifica según rangos de edad
5. **Día de la Semana** - Muestra el día según un número del 1 al 7
6. **Verificación de Acceso** - Sistema de login con validación de usuario y contraseña

## Cómo ejecutar
1. Ingresar las credenciales:
   - Usuario: `Felipe Sandoval` o `Admin`
   - Contraseña: `Adm123` o `12345`

## Preguntas Teóricas
### ¿Para qué se utilizan los operadores lógicos en programación?

Se utilizan cuando necesitamos comparar dos valores o combinar varias condiciones. Por ejemplo, con AND (&&) podemos verificar que se cumplan dos cosas al mismo tiempo, como que el usuario sea correcto Y la contraseña también. Con OR (||) verificamos que se cumpla al menos una condición, como aceptar dos usuarios diferentes en el login.

### ¿Por qué es importante declarar correctamente el tipo de dato de una variable?

Es importante debido a que a la hora de realizar operaciones con un entero por ejemplo, no podemos dividir y que su resultado sea decimal. Entonces necesitamos asignar correctamente los tipos de datos. Además, cada tipo ocupa diferente espacio en memoria y tiene sus propias limitaciones. Si usamos el tipo incorrecto podemos tener errores o perder información.

## Justificación de Estructuras de Control

### Clasificación de Edad

**Estructura:** if-else

Se utiliza if-else debido a que se trabajan con intervalos de edad, si fuese un switch tendríamos que colocar uno para cada caso. Fue la manera más sencilla. Con if-else puedo poner condiciones como "mayor o igual a 12 Y menor que 18", mientras que con switch solo podría verificar valores exactos como 12, 13, 14, etc.

### Día de la Semana

**Estructura:** switch

Porque es la manera más práctica de hacerlo, 7 casos para los 7 días de la semana y un default por si se intenta ingresar un número que no corresponde. Es más limpio y fácil de leer que hacer 7 if-else seguidos.

### Verificación de Acceso

**Estructura:** if-else

Necesitamos if-else porque necesitamos comparar los valores que introduce el usuario con las claves en la "base de datos", comprobar si el usuario y contraseña pertenecen juntos y aparte son correctos. No podríamos hacer esto con un switch de una manera tan práctica, ya que necesitamos usar operadores lógicos (&&, ||) y comparar strings con .equals().
