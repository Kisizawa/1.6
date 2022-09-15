public class Sword implements Cloneable{
private String name;

public Sword(String name) {
    this.name = name;

}
public Sword() {
	
}
public Sword clone() {
	Sword result = new Sword();
	result.name=this.name;
	return result;
}


public String getName() {
    // TODO Auto-generated method stub
    return this.name;
}

public void setName(String name) {
    // TODO Auto-generated method stub
    this.name = name;

}

@Override
public String toString() {
	return "Sword [name=" + name + "]";
}


}
