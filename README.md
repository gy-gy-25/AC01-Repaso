# AC01-Repaso

Actividad de repaso de Kotlin para practicar variables, conversiones de tipos,
entrada por consola, expresiones `when`, plantillas de texto y null safety.

## Descripción

El programa, disponible en [`src/Main.kt`](src/Main.kt), realiza las siguientes
operaciones:

1. Muestra el nombre de un técnico y su número de revisiones.
2. Convierte el número de revisiones de `Int` a `Double`.
3. Solicita una temperatura por consola y la clasifica:
   - Menor de `40`: `SECO`.
   - Entre `40` y `70`, ambos incluidos: `ÓPTIMO`.
   - Mayor de `70`: `HÚMEDO`.
4. Practica el tratamiento de valores nulos mediante el operador safe call
   (`?.`) y el operador Elvis (`?:`).

## Requisitos

- IntelliJ IDEA con el plugin de Kotlin.
- Kotlin/JVM.
- JDK compatible con la configuración del proyecto.

## Ejecución

1. Abre el proyecto `AC01-Repaso` en IntelliJ IDEA.
2. Abre el archivo `src/Main.kt`.
3. Ejecuta la función `main`.
4. Introduce una temperatura numérica cuando aparezca el mensaje:

   ```text
   Dime temperatura:
   ```

## Ejemplo de ejecución

```text
Nombre del técnico: Juan Pérez | Número de revisiones: 10
10.0
Dime temperatura:
55
ÓPTIMO
null
20
```