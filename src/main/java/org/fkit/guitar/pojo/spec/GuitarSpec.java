package org.fkit.guitar.pojo.spec;

import org.fkit.guitar.pojo.Builder;
import org.fkit.guitar.pojo.Type;
import org.fkit.guitar.pojo.Wood;

public class GuitarSpec{
	
	private Builder builder;
	
	private String model;

	private Type type;
	
	private Wood backWood;
	
	private Wood topWood;
	
	private int numStrings;


	public GuitarSpec() {
		super();
	}

	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
	}


	public boolean matches(GuitarSpec otherSpec) {
	    if (otherSpec.builder!=null && builder != otherSpec.builder)
	      return false;
	    if(otherSpec.getModel()!=null && otherSpec.getModel().trim().length()>0 && !otherSpec.getModel().toLowerCase().equals(model!=null?model.toLowerCase():null))
	      return false;
	    if (otherSpec.type!=null && type != otherSpec.type)
	      return false;
	    if (otherSpec.numStrings>0 && numStrings != otherSpec.numStrings)
	      return false;
	    if (otherSpec.backWood!=null&&backWood != otherSpec.backWood)
	      return false;
	    if (otherSpec.topWood!=null && topWood != otherSpec.topWood)
	      return false;
	    return true;
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

}
