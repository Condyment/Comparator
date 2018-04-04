import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javafx.scene.paint.Color;

public class Food extends JButton {
	private int Nr_Crt;
	private String Denumire_articol;
	private int Cantitate;
	private double Pret;
	private String nume_poza;
	private ImageIcon icon;
	private BufferedImage image;
	private int buc_produs = 0;
	private String sbuc_produs;

	public Food(int Nr_Crt, String Denumire_articol, int Cantitate, double Pret, String nume_poza) {

		this.Nr_Crt = Nr_Crt;
		this.Cantitate = Cantitate;
		this.Pret = Pret;
		this.Denumire_articol = Denumire_articol;
		this.nume_poza = nume_poza;
		setText(this.Denumire_articol);
		// icon = new ImageIcon(getClass().getResource(this.nume_poza));
		// setIcon(icon);
		setBackground(java.awt.Color.white);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// g.drawString(Denumire_articol, 0, 0);

	}

	public int getNr_Crt() {

		return Nr_Crt;

	}

	public String getDenumire_articol() {
		return Denumire_articol;
	}

	public int getCantitate() {
		return Cantitate;
	}

	public double getPret() {
		return Pret;

	}

	public void setbuc_produs() {

		buc_produs++;
		sbuc_produs = "" + buc_produs;
		setText(sbuc_produs + Denumire_articol);
	}

	public int getbuc_produs() {

		return buc_produs++;

	}

	public void anotherthing() {

		buc_produs = 0;

	}
}
