package application.enums;

import java.util.Date;

public class ExemploEnum {

	public static void main(String[] args) {
	
		CargoEntity cargoEntity = new CargoEntity(1000, AnalistLevel.SENHOR, 10.000, new Date());
		 System.out.println(cargoEntity);

		 AnalistLevel analistLevel = AnalistLevel.SENHOR;
		 
		 AnalistLevel analistLevel2 = AnalistLevel.valueOf("SENHOR");
		 
		 System.out.println(analistLevel2);
	}

}
