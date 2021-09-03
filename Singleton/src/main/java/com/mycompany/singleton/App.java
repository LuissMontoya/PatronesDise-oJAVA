
package com.mycompany.singleton;

import model.Conexion;

/**
 *
 * @author Luiss
 */
public class App {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
		//Instanciación por constructor prohíbido por ser "private"
		//Conexion c = new Conexion();
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}
    
}
