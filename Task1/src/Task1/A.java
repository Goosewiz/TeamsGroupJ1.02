package Task1;

import java.util.Date;

public abstract class A {
	public String varA1 = "aaa";
	public int varA2;
	public void setVarA2(int var) {
		if (var<0)
			varA2 = 0;
		else if (var>99)
			varA2 = 99;
		else
			varA2 = var;
	}
	public int foo(Date dt) {
		return 0;
	}
	public void buzz() {		
	}
}
