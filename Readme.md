# Conversor de Divisas

Este programa es un conversor de divisas que permite realizar conversiones entre diferentes monedas de manera interactiva. A través de un menú, el usuario puede seleccionar la conversión que desea realizar,
ingresar los valores y obtener los resultados.

## Características
- Convierte entre las siguientes divisas:
  - Dólar (USD) y Peso Colombiano (COP)
  - Dólar (USD) y Real Brasileño (BRL)
  - Dólar (USD) y Peso Argentino (ARS)
- Opción para convertir otras divisas no listadas directamente en el menú.
- Sistema interactivo basado en consola.

## Requisitos
- Java Development Kit (JDK) 8 o superior.

## Instrucciones de Uso

1. **Compilación**:
   - Abre una terminal y dirígete al directorio donde se encuentra el archivo principal (`Principal.java`).
   - Compila el programa utilizando el siguiente comando:
     ```bash
     javac Principal.java
     ```

2. **Ejecución**:
   - Una vez compilado, ejecuta el programa con el siguiente comando:
     ```bash
     java Principal
     ```

3. **Interacción con el programa**:
   - Al iniciar el programa, verás un menú con las opciones disponibles para conversión.
   - Introduce el número correspondiente a la conversión que deseas realizar y presiona **Enter**.
   - Ingresa los valores solicitados (como la cantidad a convertir) según las instrucciones en la consola.
   - El programa mostrará el resultado de la conversión.

4. **Opciones del menú**:
   - **1**: Convertir de Dólar (USD) a Peso Colombiano (COP).
   - **2**: Convertir de Peso Colombiano (COP) a Dólar (USD).
   - **3**: Convertir de Dólar (USD) a Real Brasileño (BRL).
   - **4**: Convertir de Real Brasileño (BRL) a Dólar (USD).
   - **5**: Convertir de Dólar (USD) a Peso Argentino (ARS).
   - **6**: Convertir de Peso Argentino (ARS) a Dólar (USD).
   - **7**: Convertir otra divisa no listada directamente en el menú.
   - **8**: Salir del programa.

5. **Salir del programa**:
   - Para salir, selecciona la opción **8** en el menú. El programa finalizará la ejecución de manera segura.

## Notas
- Asegúrate de tener conexión a Internet si el programa utiliza una API para obtener tasas de cambio actualizadas.
- El programa requiere las clases adicionales `ConsultaDivisa` y `ConvercionDivisa` para funcionar correctamente. Verifica que estos archivos estén en el mismo directorio o configurados adecuadamente.

## Ejemplo de Uso
```text
********************************

Ingrese la conversión de divisa que desea realizar:
1. Dólar a Peso Colombiano
2. Peso Colombiano a Dólar
3. Dólar a Real Brasileño
4. Real Brasileño a Dólar
5. Dólar a Peso Argentino
6. Peso Argentino a Dólar
7. Convertir otra divisa
8. Salir del programa
********************************
> 1
Ingrese la cantidad en USD: 100
Resultado: 100 USD = 450,000 COP
```

## Autor
Desarrollado por [Juan Orozco “JuanKo”].
