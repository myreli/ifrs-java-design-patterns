package model;

/**
 * @author myreli
 *
 */
public class Person {

	private String 	legalDocument;
	private String 	name;
	private Integer	age;
	
	/**
	 * @param legalDocument
	 * @param name
	 * @param age
	 */
	public Person(String legalDocument, String name, Integer age) {
		super();
		this.legalDocument = legalDocument;
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the legalDocument
	 */
	public String getLegalDocument() {
		return legalDocument;
	}

	/**
	 * @param legalDocument the legalDocument to set
	 */
	public void setLegalDocument(String legalDocument) {
		this.legalDocument = legalDocument;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [legalDocument=" + legalDocument + ", name=" + name + ", age=" + age + "]";
	}
	
		
	
}
