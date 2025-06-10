# Práctica: Agenda de Contactos con Lista Enlazada

## 📌 Información General

- **Título:** Gestión de Contactos con Listas Enlazadas  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante1:** Carlos Antonio Gordillo Tenemaza
- **Estudiante2:** Esteban Vicente Pesantez Rea
- **Fecha:** 10/06/2025  
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto implementa un sistema en Java para gestionar una agenda de contactos utilizando una estructura de lista enlazada simple, siguiendo el patrón **Modelo-Vista-Controlador (MVC)**.

### 🔧 Componentes:

- `Model.Contact`: representa a un contacto con nombre y teléfono.
- `Model.Node`: representa un nodo de la lista enlazada.
- `Model.LinkedList`: estructura de datos para almacenar los contactos.
- `Controller.ContactManager`: maneja la lógica de agregar, buscar y eliminar contactos.
- `Controller.MenuController`: gestiona el menú de opciones del usuario.
- `View.ConsoleView`: permite la interacción por consola.
- `App.java`: clase principal que inicia la ejecución del sistema.

### 📋 Funcionalidades:

- Agregar un nuevo contacto.
- Buscar un contacto por nombre.
- Eliminar un contacto por nombre.
- Mostrar todos los contactos registrados.
- Navegación por menú interactivo.
- Soporte para datos genéricos (nombre y teléfono pueden ser cualquier tipo de dato).

---

## 🚀 Ejecución

Para compilar y ejecutar el programa:

1. Desde la carpeta raíz del proyecto, compila con:

    ```bash
    javac src/**/*.java -d bin
    ```

2. Luego ejecuta la clase principal:

    ```bash
    java -cp bin App
    ```

---

## 🧑‍💻 Ejemplo de Uso

```plaintext
--- MENU ---
1. Agregar contacto
2. Buscar contacto
3. Eliminar contacto
4. Mostrar todos los contactos
5. Salir
Selecciona una opcion: 1
Nombre: Ana
Teléfono: 0991234567

Contacto agregado.

--- MENU ---
2. Buscar contacto
Nombre del contacto a buscar: Anita

Contacto encontrado: Nombre: Anita, Telefono: 0991234567

--- MENU ---
3. Eliminar contacto
Nombre del contacto a eliminar: Anita

Contacto eliminado.

--- MENÚ ---
4. Mostrar todos los contactos
(no hay contactos en la lista)
