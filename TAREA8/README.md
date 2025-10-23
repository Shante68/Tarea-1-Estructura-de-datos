
El objetivo es aplicar los conceptos teóricos de las Tablas Hash para crear un programa que administre una colección de objetos (en este caso, `Libro`). El programa realiza las operaciones básicas de inserción, búsqueda y eliminación sobre un `HashMap`.

---

## 1. Conceptos Teóricos 

Una **Tabla Hash** es una estructura de datos que optimiza la inserción, búsqueda y eliminación, logrando una eficiencia promedio de $O(1)$ (tiempo constante)

* **Pares Llave-Valor:** Almacena datos en pares de `llave-valor`.
* **Función Hash:** Utiliza un proceso llamado *Hashing*. Este proceso toma una `llave` y, mediante una **función hash**, la convierte en un índice (o "slot") dentro de un arreglo].
* **Colisiones:** Ocurre un problema cuando dos llaves distintas generan el mismo índice.
* **Resolución de Colisiones:** La técnica más común, y la que usa Java, es el **Encadenamiento Separado (Separate Chaining)**. ]En este método, cada "slot" del arreglo no contiene un solo elemento, sino que apunta a una **lista ligada** donde se almacenan todos los elementos que colisionaron en ese mismo índice.



---

## 2. Implementación Práctica (El Código Java)

El proyecto vincula la teoría con la práctica de la siguiente manera:

### Clases del Proyecto

1.  **`Libro.java`**: Representa el **Valor** (`value`) que queremos almacenar. Es una clase POJO (Plain Old Java Object) con atributos como `isbn`, `titulo` y `autor`.
2.  **`DemoHashMap.java`**: Contiene la lógica principal (`main`) y la implementación del `HashMap`.



L
