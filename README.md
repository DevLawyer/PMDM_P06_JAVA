# PMDM_P06_JAVA
Repository for the sixth project for PMDM subject.

BBDD con cuatro tablas

Relaciones.
A -> B -> C <- D

A	   B	      C		D
Abogado -> Cliente -> Asunto <- Órgano.

A Abogado
	PK Usuario
	Contraseña
	NIF
	Foto
	Fecha

B Cliente
	PK Código Cliente
	Nombre
	Apellido
	NIF
	Dirección
	Teléfono
	FK - Usuario

C Asuntos
	PK Código Asunto
	Descripción
	Fecha Alta
	Fecha Final
	Número Horas
	Precio Hora
	FK - Código Cliente
	FK - Código Órgano

D Órgano
	PK Código Órgano
	Nombre
	Dirección
	Teléfono

VISTA
JFrame.
JPanel Acceso.
JPanel Visualizar.
	Ver 1 a 1 lo de B relacionado con Usuario conectado A.
	JList que contiene los C que se relacionan con B.

JPanel Alta C. 
	PK_C = PK_A + PK_D + Cod_Correlativo.
	Las PK_A y PK_D deben ser desplegables.
	Cod autocompletado cuando selecciona PK_A y PK_D.

JPanel Propiedades.
	Datos del usuario.
	Deja meter o cambiar el NIF.
	Deja meter o cambiar la Foto.
	Deja meter o cambiar la fecha.

JPanel Acerca de.


MODELO
Una clase por cada tabla.


CONTROLADOR
Clase para abrir y cerrar la conexión métodos static para conectar y desconectar.

Según la consulta de la tabla todas abren y cierran el stm y rset.
	Una clase que devuelve el objeto del usuario cuando se valida.
	Una clase que modifica la BBDD con los campos nuevos.
	Consulta de C y D pueden ser una clase con las consultas prefedinidas para recuperar los campos que interesen y las PK para el autocompletado.
	Consulta de B consulta de 1 a 1 con la consulta en función del usuario, que tenga scroll. 
		Si en la consulta hay algo rset.next() se pone en before first y devuelve true, sino devuelve false.
		Métodos avanzar, retroceder, método getActual que devuelve objeto.

ERRORES
Clase prediseñados. 
	Contiene pares Cod_Err - Mensaje.
	Método getMensaje.
	
	En los catch del programa.
	Sout(fecha del sistema, mensaje de error del sistema)
	Guardar mensaje en un log.
	new MyExcepcion(Cod_Err.) Que salte ventana con el mensaje predefinido.

Clase gestionLogErrores.
	Con un método que recibe el mensaje y lo escribe en un fichero.
