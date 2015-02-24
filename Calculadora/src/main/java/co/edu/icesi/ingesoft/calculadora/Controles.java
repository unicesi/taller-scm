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

/**
 * @author Andrés Paz
 * 
 * @version 0.1, Febrero 2015
 */
public enum Controles {

	/**
	 * 
	 */
	CERO("0"),
	/**
	 * 
	 */
	UNO("1"),
	/**
	 * 
	 */
	DOS("2"),
	/**
	 * 
	 */
	TRES("3"),
	/**
	 * 
	 */
	CUATRO("4"),
	/**
	 * 
	 */
	CINCO("5"),
	/**
	 * 
	 */
	SEIS("6"),
	/**
	 * 
	 */
	SIETE("7"),
	/**
	 * 
	 */
	OCHO("8"),
	/**
	 * 
	 */
	NUEVE("9"),
	/**
	 * 
	 */
	PUNTO("."),
	/**
	 * 
	 */
	SUMA("+"),
	/**
	 * 
	 */
	RESTA("-"),
	/**
	 * 
	 */
	MULTIPLICACION("x"),
	/**
	 * 
	 */
	DIVISION("÷"),
	/**
	 * 
	 */
	RESULTADO("="),
	/**
	 * 
	 */
	BORRAR("C");
	
	/**
	 * 
	 */
	private String texto;
	
	/**
	 * 
	 * @param texto
	 */
	private Controles(String texto) {
		this.texto = texto;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getTexto() {
		return this.texto;
	}
	
	/**
	 * 
	 * @param texto
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static Controles obtenerPorTexto(String texto) throws IllegalArgumentException {
		for (Controles control : values()) {
			if (control.getTexto().equals(texto)) {
				return control;
			}
		}
		throw new IllegalArgumentException(texto + " is not a valid database.");
	}
}
