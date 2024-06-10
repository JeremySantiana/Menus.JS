# Sistemas de MENUS

Este proyecto es una aplicación JavaFX que demuestra cómo crear una interfaz gráfica con menús en Java. La aplicación incluye un menú de archivo, edición y ayuda con diversas opciones.

## Requisitos

- Java 8 o superior
- JavaFX
  
## Descripción

La aplicación presenta una ventana principal con una barra de menú que contiene los siguientes elementos:

- Menú *Archivo*:
  - Nuevo
  - Abrir
  - Guardar
  - Separador
  - Salir
- Menú *Editar*:
  - Cortar
  - Copiar
  - Pegar
- Menú *Ayuda*:
  - Acerca de

Al seleccionar cualquier opción del menú, se imprime un mensaje correspondiente en la consola.

## Estructura del Código

El código se estructura de la siguiente manera:

1. *Método `start`:
   - Inicializa la barra de menú utilizando el método crearBarraDeMenu.
   - Crea un BorderPane y agrega la barra de menú en la parte superior.
   - Configura la escena y la agrega al escenario principal.

2. `Método crearBarraDeMenu`:
   - Crea y configura los menús principales.
   - Añade los elementos de menú a cada menú principal.
   - Devuelve la barra de menú completa.

3. `Método crearMenuItem`:
   - Crea un MenuItem con el nombre y mensaje especificados.
   - Asigna una acción para imprimir el mensaje en la consola cuando se selecciona el elemento del menú.
   - Devuelve el MenuItem creado.

## Ejecución
![Captura de pantalla 2024-06-10 173513](https://github.com/JeremySantiana/Menus.JS/assets/169096282/b2a6f674-3720-44dd-ae43-7145c6405306)
![Captura de pantalla 2024-06-10 174112](https://github.com/JeremySantiana/Menus.JS/assets/169096282/109b2792-60a4-4a95-a2b3-f28436adfd50)
![Captura de pantalla 2024-06-10 173533](https://github.com/JeremySantiana/Menus.JS/assets/169096282/086b7986-9cfb-4c96-865a-ca030ba85112)
![Captura de pantalla 2024-06-10 173548](https://github.com/JeremySantiana/Menus.JS/assets/169096282/dbe74977-7176-4d3e-b0db-430bf240ce5a)
