package ie.atu.sw;

import java.time.LocalDate;

public record Ninja(long id,String name, LocalDate dob, int level) implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
	 return super.clone();
	}
}
