package at.jku.ce;

public class DomainFactory {
	
	public static DomainObject createDomainObject(String name, String comment) {
		return new DomainObject(name, comment);
	}
}
