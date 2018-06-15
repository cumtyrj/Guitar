package org.fkit.guitar.pojo;

import org.fkit.guitar.pojo.spec.GuitarSpec;

public class Guitar implements java.io.Serializable{

	private static final long serialVersionUID = 325952505698299172L;

	private String id;
	
	private Double price;
	
	private Builder builder;
	
	private String model;

	private Type type;
	
	private Wood backWood;
	
	private Wood topWood;
	
	private int numStrings;
	
	private GuitarSpec spec;
	
	public Guitar(){
		
	}
	public Guitar(String id, Double price, Builder builder, String model, Type type, Wood backWood, 
			Wood topWood,int numStrings) {
		super();
		this.id=id;
		this.price=price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
		this.spec=new GuitarSpec(builder,model,type,backWood,topWood,numStrings);
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	public int getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public GuitarSpec getSpec() {
		//return new GuitarSpec(builder,model,type,backWood,topWood,numStrings);
		return spec;
	}
	public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
}
