package br.com.matheusmatos.temperatura.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.matheusmatos.temperatura.model.Temperatura;

public class TelaConversor {
	
	private JLabel labelCelsius;
	private JTextField textCelsius;
	private JButton buttonFahrenheit;
	private JButton buttonKelvin;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	
	public void criarTelaConversor(){
		
        JFrame tela = new JFrame();
		
		Dimension tamanho = new Dimension();
		tamanho.setSize(400, 700);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
	}

}