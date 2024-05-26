Conversor de Monedas
Este proyecto es una aplicación Java que permite convertir entre diferentes monedas utilizando el tipo de cambio actual obtenido de una API en línea.

Descripción
La aplicación consta de tres clases principales:

ClienteTipoCambio: Esta clase se encarga de realizar una solicitud HTTP a una API en línea que proporciona los tipos de cambio más recientes. Utiliza la clase HttpClient de Java para realizar la solicitud de forma asíncrona.

ConversorMoneda: Esta clase se encarga de parsear la respuesta JSON de la API de tipos de cambio y proporciona métodos para realizar conversiones de moneda.

Principal: Esta clase contiene el método main y maneja la interacción con el usuario a través de la línea de comandos. Permite al usuario seleccionar las monedas a convertir y muestra los resultados de las conversiones.

Funcionamiento
El programa comienza realizando una solicitud a una API en línea para obtener los tipos de cambio más recientes. Luego, muestra un menú de opciones al usuario, donde puede seleccionar las monedas que desea convertir. Una vez que el usuario elige las monedas y proporciona la cantidad a convertir, el programa calcula y muestra el resultado de la conversión.

Uso
Para utilizar esta aplicación, sigue estos pasos:

Clona este repositorio en tu máquina local.
Abre el proyecto en tu entorno de desarrollo Java preferido.
Ejecuta la clase Principal.java.
Sigue las instrucciones en la consola para realizar conversiones de moneda.
Contribuir
Si deseas contribuir a este proyecto, sigue estos pasos:

Haz un fork del repositorio.
Crea una rama para tu nueva característica (git checkout -b feature/nueva-caracteristica).
Haz tus cambios y realiza los commits (git commit -am 'Agrega nueva característica').
Sube tus cambios a tu repositorio en GitHub (git push origin feature/nueva-caracteristica).
Abre un pull request y describe los cambios propuestos.
Créditos
Este proyecto fue creado por José Mateo López Cifuentes.
