package LucasLevingston.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	public Botao(String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setFont(new Font("courier", Font.PLAIN, 25));
		setBackground(cor);
		setForeground(Color.white);
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
}
