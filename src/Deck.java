import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	List<Card> deck = new ArrayList<Card>();
	public static String[] kartenBezeichner = {"KREUZ_NEUN", "PIK_NEUN", "HERZ_NEUN", "KARO_NEUN", "KREUZ_BUBE", "PIK_BUBE", "HERZ_BUBE", "KARO_BUBE", "KREUZ_DAME", "PIK_DAME", "HERZ_DAME", "KARO_DAME", "KREUZ_KOENIG", "PIK_KOENIG", "HERZ_KOENIG", "KARO_KOENIG", "KREUZ_ZEHN", "PIK_ZEHN", "HERZ_ZEHN", "KARO_ZEHN", "KREUZ_ASS", "PIK_ASS", "HERZ_ASS", "KARO_ASS}
	
	
	
	public Deck() {
	
		int value;		
		for(int i=0; i < 48; i++) {
			
			if (i < 8) {
				value = 0;			
			} else if (i >= 8 && i <16) {
				value = 2;
			}else if (i >= 16 && i <24) {
				value = 3;
			}else if (i >= 24 && i <32) {
				value = 4;
			}else if (i >= 32 && i <40) {
				value = 10;
			}else if (i >= 40 && i <48) {
				value = 11;
			}
				
			Card karte = new Card(kartenBezeichner[i], value);
			
			//Alle Karten zweimal vorhanden
			deck.add(karte);
			deck.add(karte);
		}


		
	}
	
}
