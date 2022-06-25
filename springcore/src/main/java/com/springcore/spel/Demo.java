package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{2+2}")
	private int x;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int y;
	
	@Value("#{8>4}")
	private boolean check;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", check=" + check + "]";
	}
	
	
	
	

}
