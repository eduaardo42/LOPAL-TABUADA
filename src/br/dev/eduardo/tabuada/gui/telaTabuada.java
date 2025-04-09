package br.dev.eduardo.tabuada.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class telaTabuada {

	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private JScrollPane scrollTabuada;
	private String tituloDaTela;

	public void criarTela(String tituloDaTela) {
		
		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle(tituloDaTela);
		tela.setSize(270, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		
		//obtendo a referencia do painel de conteudo da tela
		Container container = tela.getContentPane();
		
		//criar o label multiplicando
		
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(20, 20, 140, 30);
		
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 60, 50, 30);
		
		//criar o label MinMultiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador: ");
		labelMinMultiplicador.setBounds(20, 60, 140, 30);
		
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 60, 50, 30);
		
		//Criar o label MaxMultiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador: ");
		labelMaxMultiplicador.setBounds(20, 100, 140, 30);
		
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 100, 50, 30);
		
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		//adicionando os componente no painel de cpnteúdo jframe
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMultiplicando);
		container.add(textMinMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		
		
		//Tornar a tela visível "DEVE!!!" ser a ultima instrução
		tela.setVisible(true);
	}

	private void exibirTabuada() {

	}

	private void limparTabuda() {

	}

}
