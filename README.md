# Tarea4-Arquitectura_Sistema
Tecnología y atributos de calidad - Django
# Requisitos:clipboard:
- JDK 17
- Oracle Database XE Prior Release Archive

  


# Construido con :hammer:
+ Spring Tool Suite
+ SQL Developer



# Instrucciones:arrow_left: Windows

 Despues de haber instalado
 - Oracle Database XE Prior Release Archive(En el proceso de instalacion de este se registra una contraseña anotarla porque es importante)
 - Buscar Star Database y ejecutar
 - Luego abrir SQL Developer(aqui crean una nueva conexion le colocan un nombre y usan como credenciales Usuario:system,Contraseña:la mencionada al principio)
 - Una vez conectado desde el usuario system daremos clic derecho y luego en abrir hoja de trabajo sql y creamos el nuevo usuario con sus permisos.
 - Ejemplo:
 
    CREATE USER nombreDeUsuario IDENTIFIED BY claveDeUsuario;
    
    GRANT CONNECT, RESOURCE,DBA TO nombreDeUsuario;
    
    GRANT CREATE SESSION,GRANT ANY PRIVILEGE TO nombreDeUsuario;
    
    GRANT UNLIMITED TABLESPACE TO nombreDeUsuario;
 
 - Luego añadir nueva conexion le ponen un nombre e ingresan con el nombre de usuario y claves creadas
 - Luego ingresan por esa conexion dan en archivo abrir y buscan el .sql del proyecto luego en el sql reemplazan el usuario:MLTUTORIALES por el usuario creado en el paso   anterior deben seleccionar todo el contenido del sql y ejecutar la consulta.





## Ejecutar Aplicación ✔️
 - Por ultimo una vez abran el proyecto en spring tool suite en el apartado de src\main\resources\application.properties abren ese archivo y cambian el nombre de usuario y la clave por los creados y en el proyecto dan click derecho run as Spring Boot App y luego desde postman pueden realizar las pruebas del servicio rest cada una se encuentra en src\main\java\com\mltutoriales\controller\EmpleadoController.java
 - Cuando dejen de utilizar la base de datos cierran el sqldeveloper y buscan stop database y lo ejecutan.
