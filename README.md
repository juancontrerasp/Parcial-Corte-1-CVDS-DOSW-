# Parcial-Corte-1-CVDS-DOSW-

---

## Juan Pablo Contreras

---

## 1. Generalidades del sistema

![DiagramaContexto](Parcial-Corte-1-CVDS-DOSW/docs/imagenes/DiagramaContexto.png)


## 2. Funcionalidades en el caso

   - El usuario debe poder crear nuevos reportes
   - El usuario debe poder consultar los reportes que haya creado
   - El usuario debe poder añadir nuevas características visuales

### Casos de Uso

![CasosDeUso](Parcial-Corte-1-CVDS-DOSW/docs/imagenes/CasosDeUso.png)


## 3. Diagrama de clases - solución

![DiagramaDeClases](Parcial-Corte-1-CVDS-DOSW/docs/imagenes/DiagramaDeClases.png)

### Principios solid que estoy aplicando

####    1. Single Responsability Principle

El S principle se implementó para que las clases estén abiertas a extensión mas no a modificación, lo implementé en cada clase 

####    2. Open Closed Principle

Nuevamente estoy usando este principio en todos los componentes ya que todas las clases están hechas para poder ser extendidas pero no modificadas. 

####    3. Interface Segregation

Estoy usando este principio en todos los componentes heredados ya que el usuario no depende de métodos que no usa, lo hice diviendo correctamente cada método en cada clase y asegurándome que no sea obligatorio usar métodos no necesarios.

## 4. Patrones de diseño

### 1.  Builder

#### Tipo: Creacional

#### Argumentación

Usé el patrón builder ya que en los requerimientos se pedía permitir que el usuario construya los reportes paso a paso, en el diagrama se puede ver en la clase ReportBuilder la cual extiende a ReportDecorator y tiene implementación de 3 clases concretas

### 2. Decorator

#### Tipo: Estructural

#### Argumentación

Usé el patrón Decorator ya que en los requerimientos se pide poder agregar una funcionalidad extra a un objeto ya construido sin cambiar su definición original, en el diagrama de clases se puede ver en la clase abstracta ReportDecorator la cual tiene 3 clases que la implementan.


# 5. Evidencias Datos de Salida