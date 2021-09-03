
package Impl;

import Inter.IConexion;

/**
 *
 * @author Luiss
 */
public class ConexionVacia implements IConexion {
    
	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICÓ PROVEEDOR");		
	}

}