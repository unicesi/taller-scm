/*
 * Copyright © 2015 Universidad Icesi
 * 
 * This file is part of Calculadora.
 * 
 * Calculadora is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU General 
 * Public License as published by the Free Software 
 * Foundation, either version 3 of the License, or (at your 
 * option) any later version.
 * 
 * Calculadora is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied 
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
 * PURPOSE. See the GNU General Public License for more 
 * details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with The SLR Support Tools. If not, see 
 * <http://www.gnu.org/licenses/>.
 */
package co.edu.icesi.ingesoft.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * 
 * @author Andrés Paz
 * 
 * @version 0.1, Febrero 2015
 */
public class ControladorEventosNumeros implements ActionListener {

	/**
	 * 
	 */
	private Calculadora calculadora;
	
	/**
	 * 
	 * @param calculadora
	 */
	public ControladorEventosNumeros(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String textoAnterior = calculadora.obtenerTextoDePantalla();
		String textoNuevo = e.getActionCommand();
		String textoCompleto = "";
		switch (Controles.obtenerPorTexto(textoNuevo)) {
		case CERO:
		case UNO:
		case DOS:
		case TRES:
		case CUATRO:
		case CINCO:
		case SEIS:
		case SIETE:
		case OCHO:
		case NUEVE:
			textoCompleto = textoAnterior + textoNuevo;
			calculadora.cambiarTextoDePantalla(textoCompleto);
			break;
			
		case PUNTO:
			if (!textoAnterior.contains(Controles.PUNTO.getTexto())) {
				textoCompleto = textoAnterior + textoNuevo;
			} else {
				textoCompleto = textoAnterior;
			}
			calculadora.cambiarTextoDePantalla(textoCompleto);
			break;

		case BORRAR:
			this.calculadora.limpiarTextoDePantalla();
			break;
		default:
			break;
		}
		
	}

}
