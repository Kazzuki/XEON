import character.Character;
import character.Emperor;
import character.Heroe;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	System.out.println("XENO START!");
	//CPとplayerの２つのデッキを作る、山札を作る
	System.out.println("先行です");
	System.out.println("１枚目：〇〇を持っています");

	Character[] decks = {
		new Emperor(),
		new Heroe()
	};

	for(Character deck : decks) {
		deck.explain();
	}

	}

}
