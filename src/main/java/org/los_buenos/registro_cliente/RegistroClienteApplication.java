package org.los_buenos.registro_cliente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistroClienteApplication implements  CommandLineRunner {

	//profesionalizar nuestro sout con un logger
	private static final Logger logger =LoggerFactory.getLogger(RegistroClienteApplication.class);
	String salto = System.lineSeparator();

	public static void main(String[] args) {
		//antes de iniciar
		logger.info("Iniciando la aplicacion");
		SpringApplication.run(RegistroClienteApplication.class, args);
		// al finalizar
		logger.info("Aplicacion finalizada");
	}

	@Override
	public void run(String... args) throws Exception{
registroClientesApp();

	}
	private void registroClientesApp(){
		logger.info("Bienvenido a la web de registro cliente");
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir){
			var opcion = mostrarMenu(consola);
			salir = ejecutarOpciones(consola, opcion);
			logger.info(salto);
		}
	}
	private int mostrarMenu(Scanner consola){
		looger.info("""
		Aplicacion
		1. listar
		2.agregar
		3. editar
		4. eliminar
		5. buscar
		6. salir
		""");
		var opcion = Integer.parseInt(consola.nextline());
		return opcion;
	}
	private boolean ejecutarOpciones (Scanner consola, int opcion){
		return false;
	}
}
