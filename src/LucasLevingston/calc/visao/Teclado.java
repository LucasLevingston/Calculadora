package LucasLevingston.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import LucasLevingston.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener{
	
	private final Color cor_CinzaEscuro = new Color(68, 68, 68);
	private final Color cor_CinzaClaro = new Color(97, 99, 99);
	private final Color cor_Laranja = new Color(242, 163, 60);

	public Teclado() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		setLayout(layout);
		//Linha 1
		c.gridwidth = 2;
		adicionarBotao("AC", cor_CinzaEscuro, c, 0, 0);
		c.gridwidth = 1;
		adicionarBotao("+/-", cor_CinzaEscuro, c, 2, 0);
		
		adicionarBotao("/", cor_Laranja, c, 3, 0);
		
		//Linha 2
		c.gridwidth = 1;
		adicionarBotao("7", cor_CinzaClaro, c, 0, 1);
		adicionarBotao("8", cor_CinzaClaro, c, 1, 1);
		adicionarBotao("9", cor_CinzaClaro, c, 2, 1);
		adicionarBotao("*", cor_Laranja, c, 3, 1);
		
		//Linha 3
		adicionarBotao("4", cor_CinzaClaro, c, 0, 2);
		adicionarBotao("5", cor_CinzaClaro, c, 1, 2);
		adicionarBotao("6", cor_CinzaClaro, c, 2, 2);
		adicionarBotao("-", cor_Laranja, c, 3, 2);
		
		//Linha 4
		adicionarBotao("1", cor_CinzaClaro, c, 0, 3);
		adicionarBotao("2", cor_CinzaClaro, c, 1, 3);
		adicionarBotao("3", cor_CinzaClaro, c, 2, 3);
		adicionarBotao("+", cor_Laranja, c, 3, 3);
		
		//Linha 5
		c.gridwidth = 2;
		adicionarBotao("0", cor_CinzaClaro, c, 0, 4);
		c.gridwidth = 1;
		adicionarBotao(",", cor_CinzaClaro, c, 2, 4);
		adicionarBotao("=", cor_Laranja, c, 3, 4);
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao,c);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
		
	}
}
