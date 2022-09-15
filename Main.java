
public class Main {

	public static void main(String[] args) {
		Hero h1=new Hero("minato");
		
		Sword s = new Sword("はがねのけん");
		
		
		h1.setSword(s);
		System.out.println(h1.getSword().getName());
		System.out.println("クローン作製");
		Hero h2=h1.clone();
		Sword s2=s.clone();
		h2.setSword(s2);
		System.out.println("コピー元つまりH1勇者の装備変更");
		h1.getSword().setName("ひのきのぼう");
		System.out.println("h1h2の装備を表示する");
		System.out.println("h1:"+h1.getSword().getName()+"h2:"+h2.getSword().getName());
		

	}

}
