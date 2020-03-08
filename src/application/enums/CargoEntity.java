package application.enums;

import java.util.Date;

public class CargoEntity {
	private Integer id;
	private AnalistLevel analistLevel;
	private Double salary;
	private Date moment;

	public CargoEntity() {

	}

	public CargoEntity(Integer id, AnalistLevel analistLevel, Double salary, Date moment) {
		super();
		this.id = id;
		this.analistLevel = analistLevel;
		this.salary = salary;
		this.moment = moment;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AnalistLevel getAnalistLevel() {
		return analistLevel;
	}

	public void setAnalistLevel(AnalistLevel analistLevel) {
		this.analistLevel = analistLevel;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "CargoEntity [id=" + id + ", analistLevel=" + analistLevel + ", salary=" + salary + ", moment=" + moment
				+ "]";
	}
	
	

}
