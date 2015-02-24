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

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 * 
 * 
 * @author Andrés Paz
 * 
 * @version 0.1, Febrero 2015
 */
public class Calculadora {

	/**
	 * 
	 */
	private JFrame ventana;
	/**
	 * 
	 */
	private JTextField textFieldPantalla;
	/**
	 * 
	 */
	private ControladorEventosNumeros controladorEventosNumeros;
	/**
	 * 
	 */
	private ControladorEventosOperaciones controladorEventosOperaciones;

	/**
	 * Inicia la aplicación.
	 * 
	 * @param args Parámetros de ejecución.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora calculadora = new Calculadora();
					calculadora.ventana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Crea la aplicación.
	 */
	public Calculadora() {
		controladorEventosNumeros = new ControladorEventosNumeros(this);
		controladorEventosOperaciones = new ControladorEventosOperaciones(this);
		initialize();
	}

	/**
	 * Inicializa el contenido de la ventana.
	 */
	private void initialize() {
		ventana = new JFrame();
		ventana.setBounds(120, 120, 225, 225);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(null);

		JPanel panelPantalla = new JPanel();
		panelPantalla.setBounds(0, 0, 207, 49);
		ventana.getContentPane().add(panelPantalla);
		panelPantalla.setLayout(null);
		
		textFieldPantalla = new JTextField();
		textFieldPantalla.setEditable(false);
		textFieldPantalla.setBounds(6, 6, 154, 37);
		panelPantalla.add(textFieldPantalla);
		textFieldPantalla.setColumns(10);
		
		JButton buttonBorrar = new JButton(Controles.BORRAR.getTexto());
		buttonBorrar.addActionListener(this.controladorEventosNumeros);
		buttonBorrar.setBounds(159, 11, 48, 29);
		panelPantalla.add(buttonBorrar);
		
		JPanel panelControles = new JPanel();
		panelControles.setBounds(0, 49, 207, 140);
		ventana.getContentPane().add(panelControles);
		panelControles.setLayout(null);

		JButton buttonCero = new JButton(Controles.CERO.getTexto());
		buttonCero.setActionCommand(Controles.CERO.getTexto());
		buttonCero.addActionListener(this.controladorEventosNumeros);
		buttonCero.setBounds(6, 103, 48, 29);
		panelControles.add(buttonCero);

		JButton buttonUno = new JButton(Controles.UNO.getTexto());
		buttonUno.setActionCommand(Controles.UNO.getTexto());
		buttonUno.addActionListener(this.controladorEventosNumeros);
		buttonUno.setBounds(6, 70, 48, 29);
		panelControles.add(buttonUno);
		
		JButton buttonDos = new JButton(Controles.DOS.getTexto());
		buttonDos.setActionCommand(Controles.DOS.getTexto());
		buttonDos.addActionListener(this.controladorEventosNumeros);
		buttonDos.setBounds(54, 70, 48, 29);
		panelControles.add(buttonDos);
		
		JButton buttonTres = new JButton(Controles.TRES.getTexto());
		buttonTres.setActionCommand(Controles.TRES.getTexto());
		buttonTres.addActionListener(this.controladorEventosNumeros);
		buttonTres.setBounds(102, 70, 48, 29);
		panelControles.add(buttonTres);
		
		JButton buttonCuatro = new JButton(Controles.CUATRO.getTexto());
		buttonCuatro.setActionCommand(Controles.CUATRO.getTexto());
		buttonCuatro.addActionListener(this.controladorEventosNumeros);
		buttonCuatro.setBounds(6, 38, 48, 29);
		panelControles.add(buttonCuatro);
		
		JButton buttonCinco = new JButton(Controles.CINCO.getTexto());
		buttonCinco.setActionCommand(Controles.CINCO.getTexto());
		buttonCinco.addActionListener(this.controladorEventosNumeros);
		buttonCinco.setBounds(54, 38, 48, 29);
		panelControles.add(buttonCinco);
		
		JButton buttonSeis = new JButton(Controles.SEIS.getTexto());
		buttonSeis.setActionCommand(Controles.SEIS.getTexto());
		buttonSeis.addActionListener(this.controladorEventosNumeros);
		buttonSeis.setBounds(102, 38, 48, 29);
		panelControles.add(buttonSeis);

		JButton buttonSiete = new JButton(Controles.SIETE.getTexto());
		buttonSiete.setActionCommand(Controles.SIETE.getTexto());
		buttonSiete.addActionListener(this.controladorEventosNumeros);
		buttonSiete.setBounds(6, 6, 48, 29);
		panelControles.add(buttonSiete);
		
		JButton buttonOcho = new JButton(Controles.OCHO.getTexto());
		buttonOcho.setActionCommand(Controles.OCHO.getTexto());
		buttonOcho.addActionListener(this.controladorEventosNumeros);
		buttonOcho.setBounds(54, 6, 48, 29);
		panelControles.add(buttonOcho);
		
		JButton buttonNueve = new JButton(Controles.NUEVE.getTexto());
		buttonNueve.setActionCommand(Controles.NUEVE.getTexto());
		buttonNueve.addActionListener(this.controladorEventosNumeros);
		buttonNueve.setBounds(102, 6, 48, 29);
		panelControles.add(buttonNueve);
		
		JButton buttonPunto = new JButton(Controles.PUNTO.getTexto());
		buttonPunto.setActionCommand(Controles.PUNTO.getTexto());
		buttonPunto.addActionListener(this.controladorEventosNumeros);
		buttonPunto.setBounds(54, 103, 48, 29);
		panelControles.add(buttonPunto);
		
		JButton buttonSuma = new JButton(Controles.SUMA.getTexto());
		buttonSuma.addActionListener(this.controladorEventosOperaciones);
		buttonSuma.setBounds(150, 103, 48, 29);
		panelControles.add(buttonSuma);
		
		JButton buttonResta = new JButton(Controles.RESTA.getTexto());
		buttonResta.addActionListener(this.controladorEventosOperaciones);
		buttonResta.setBounds(150, 70, 48, 29);
		panelControles.add(buttonResta);
		
		JButton buttonMultiplicacion = new JButton(Controles.MULTIPLICACION.getTexto());
		buttonMultiplicacion.addActionListener(this.controladorEventosOperaciones);
		buttonMultiplicacion.setBounds(150, 38, 48, 29);
		panelControles.add(buttonMultiplicacion);

		JButton buttonDivision = new JButton(Controles.DIVISION.getTexto());
		buttonDivision.addActionListener(this.controladorEventosOperaciones);
		buttonDivision.setBounds(150, 6, 48, 29);
		panelControles.add(buttonDivision);

		JButton buttonResultado = new JButton(Controles.RESULTADO.getTexto());
		buttonResultado.addActionListener(this.controladorEventosOperaciones);
		buttonResultado.setBounds(102, 103, 48, 29);
		panelControles.add(buttonResultado);
	}
	
	/**
	 * 
	 * @return
	 */
	protected String obtenerTextoDePantalla() {
		return this.textFieldPantalla.getText();
	}
	
	/**
	 * 
	 * @param texto
	 */
	protected void cambiarTextoDePantalla(String texto) {
		this.textFieldPantalla.setText(texto);
	}
	
	/**
	 * 
	 */
	protected void limpiarTextoDePantalla() {
		this.textFieldPantalla.setText("");
	}
	
}
