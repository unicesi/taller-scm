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
import java.util.Stack;

import javax.swing.JOptionPane;

import co.edu.icesi.ingesoft.calculadora.operaciones.ControladorOperaciones;

/**
 * 
 * 
 * @author Andrés Paz
 * 
 * @version 0.1, Febrero 2015
 */
public class ControladorEventosOperaciones implements ActionListener {

	/**
	 * 
	 */
	private Calculadora calculadora;
	/**
	 * 
	 */
	private Stack<String> pila;
	
	/**
	 * 
	 * @param calculadora
	 */
	public ControladorEventosOperaciones(Calculadora calculadora) {
		this.calculadora = calculadora;
		this.pila = new Stack<String>();
	}
	
	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String numero = calculadora.obtenerTextoDePantalla();
		String operacion = e.getActionCommand();
		switch (Controles.obtenerPorTexto(operacion)) {
		case SUMA:
		case RESTA:
		case MULTIPLICACION:
		case DIVISION:
			if ((numero != null) && !numero.equals("")) {
				this.pila.push(numero);
				this.pila.push(operacion);
				this.calculadora.limpiarTextoDePantalla();
			} else {
				if(pila.size() == 0){
					JOptionPane.showMessageDialog(null, "Viejo tiene que poner un número", 
							"Asado", JOptionPane.ERROR_MESSAGE);
				}
				
				else{
				
				this.pila.pop();
				this.pila.push(operacion);
				}
			}
			break;
			
		case RESULTADO:
			String resultado = ControladorOperaciones.calcularResultado(pila);
			this.calculadora.cambiarTextoDePantalla(resultado);
			break;

		default:
			break;
		}
		
	}

}
