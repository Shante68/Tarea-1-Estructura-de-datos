

# 🌳 Árbol Binario de Búsqueda en Java

Este proyecto implementa un **Árbol Binario de Búsqueda (Binary Search Tree, BST)** en Java, con operaciones básicas como **inserción**, **búsqueda**, **eliminación** y **recorridos** (inorden, preorden y postorden).


El **árbol binario de búsqueda** es una estructura de datos jerárquica en la que cada nodo cumple las siguientes propiedades:

* El **subárbol izquierdo** contiene solo nodos con valores menores que el nodo actual.
* El **subárbol derecho** contiene solo nodos con valores mayores que el nodo actual.
* No existen valores duplicados.

Esta implementación utiliza recursión para realizar las operaciones principales del árbol.

---

## ⚙️ Funcionalidades principales

### 1. **Insertar un valor**

Permite agregar un nuevo valor al árbol manteniendo la propiedad del BST.



### 2. **Buscar un valor**

Devuelve el nodo que contiene el valor buscado o `null` si no existe.



### 3. **Eliminar un valor**

Permite eliminar nodos considerando los tres casos posibles:



### 4. **Recorridos**

El árbol se puede recorrer en tres órdenes distintos:



---

## 🧠 Estructura del código

El programa está compuesto por dos partes principales:

* **Clase interna `Node`**
  Representa un nodo del árbol, con atributos `value`, `left` y `right`.

* **Clase principal `BinarySearchTree`**
  Implementa los métodos de inserción, búsqueda, eliminación y recorridos.




