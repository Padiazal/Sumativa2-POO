LlanquihueTourApp
Descripción del Sistema
Este sistema ha sido desarrollado para la agencia Llanquihue Tour con el objetivo de resolver la problemática de gestión manual de su red de colaboradores. La aplicación permite automatizar el registro y consulta de guías, operadores y proveedores mediante un módulo que integra la lectura de archivos externos y el manejo de estructuras dinámicas en Java.

El diseño se basa en el paradigma de Programación Orientada a Objetos (POO), asegurando un código mantenible, escalable y con una separación clara de responsabilidades.

Estructura del Proyecto (Organización Modular)
Siguiendo las buenas prácticas de desarrollo, el código se ha organizado en los siguientes paquetes lógicos:
com.llanquihue.model: Contiene la clase Colaborador, que representa la entidad del dominio. Se han aplicado principios de encapsulamiento mediante atributos privados y métodos accesores.
com.llanquihue.data: Incluye el GestorColaboradores, que actúa como el motor del sistema. Se encarga de la manipulación de la colección ArrayList y la integración con la librería Apache POI.
com.llanquihue.ui: Contiene la clase Main, que sirve como punto de entrada y coordina la visualización de los resultados por consola.
Tecnologías y Librerías
Java JDK 17: Lenguaje principal de desarrollo.
Maven: Utilizado para la gestión del ciclo de vida del proyecto y dependencias.
Apache POI (5.2.5): Librería fundamental para la lectura del archivo de datos colaboradores.xlsx.
Funcionalidades Principales
Carga Automatizada: El sistema transforma filas de un archivo Excel directamente en objetos Java de tipo Colaborador.
Gestión de Colecciones: Uso de ArrayList para almacenar y recorrer los datos de forma dinámica.
Búsqueda y Filtrado: Implementación de algoritmos de búsqueda por nombre y filtrado por rol profesional para optimizar las tareas administrativas de la agencia.
Manejo de Errores: Uso de bloques try-catch para asegurar la robustez del sistema durante la lectura de archivos.
Instrucciones para la Ejecución
Para visualizar el correcto funcionamiento del sistema, siga estos pasos:
Verifique que el archivo colaboradores.xlsx esté presente en la carpeta src/main/resources.
En el IDE (IntelliJ IDEA), realice una recarga de dependencias de Maven para activar la librería Apache POI.
Ejecute la clase Main ubicada en el paquete ui. Los resultados del listado completo, la búsqueda y el filtrado se desplegarán ordenadamente en la consola.
Espero que esta estructura cumpla con los estándares técnicos solicitados para esta evaluación sumativa. Quedo atento a sus observaciones
