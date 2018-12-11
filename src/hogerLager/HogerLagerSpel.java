package hogerLager;

import java.util.Scanner;

public class HogerLagerSpel {

	private int teHoog;
	private int teLaag;
	private int gok;
	private boolean doorgaan;
	
	public HogerLagerSpel() {
		teHoog = 5_000;
		teLaag = 0;
		berekenGok();		
	}
	
	public void play() {
		System.out.println("De computer gokt: " + gok);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Voer in h/l (te hoog/te laag): ");
			String input = null;
			if (scanner.hasNext()) {
				input = scanner.nextLine();
			}
			
			if (input.equals("h")) {
				teHoog = gok;
				berekenGok();
				System.out.println("Te hoog! De computer gokt " + gok);
			}
			
			if (input.equals("l")) {
				teLaag = gok;
				berekenGok();
				System.out.println("Te laag! De computer gokt " + gok);

			}
			doorgaan = !input.equals("g");
		} while (doorgaan);
		
		scanner.close();
		
		System.out.println("Gefeliciteerd, het getal was: " + gok);
	}

	private void berekenGok() {
		gok = (teLaag + teHoog) / 2;
	}
	
}
