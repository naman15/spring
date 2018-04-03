package beans;

import org.springframework.stereotype.Component;

@Component
public class CircleDO 
{
	private int id;
	
	public CircleDO(int id, String name) {
		this.id = id;
		this.name = name;
	}
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
