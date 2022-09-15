public class Hero implements Cloneable{
	String name;
	int hp;
	Sword sword;
	
	public Hero clone(){
		Hero result = new Hero();
		result.name=this.name;
		result.hp=this.hp;
		result.sword=this.sword;
		return result;
	}
	public Hero() {
	//クローン用
	
	}
	public Hero(String name) {
		this.name=name;
		this.hp=100;
	}
	 public String getName() {
	        return this.name;
	    }

	 public void setName(String name) {
	        if (name == null) {
	            throw new IllegalArgumentException("名前がnullである。処理を中断。");

	        }
	        if (name.length() <= 1) {
	            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
	        }
	        if (name.length() >= 8) {
	            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
	        }
	        this.name = name;
	        System.out.println(this.name);
	    }

	 public void setSword(Sword sword) {
	        this.sword = sword;

	    }

	 public Sword getSword() {
	        return this.sword;
	    }
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", sword=" + sword + "]";
	}
	

}
