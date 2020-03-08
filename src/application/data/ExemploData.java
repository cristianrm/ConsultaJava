package application.data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ExemploData {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		
		Date y1 = sdf.parse("06/03/2020");
		Date y2 = sdf2.parse("25/06/2020 15:42:07");
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println("---------------------------------------------------");
		System.out.println("Exemplo: "+sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		Date date = new Date();
		System.out.println(date);
		System.out.println("---------------------------------------------------");
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		
		//exemplo Calendar
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(y2);
		cal.add(Calendar.HOUR_OF_DAY, 4);//Adicionando 4 horas a mais.
		y2 = cal.getTime();
		System.out.println("Exemplo2: "+sdf2.format(y2));
		
		System.out.println("---------------------------------------------------");
		
		//recupera o Minuto
		int minutes = cal.get(Calendar.MINUTE);
		//recupera hora
		int horas = cal.get(Calendar.HOUR);
		
		int mes = cal.get(Calendar.MONTH)+1;//começa do zero
		
		
		System.out.println(cal.getTime());
		
		System.out.println(minutes);
		System.out.println(horas);
		System.out.println(mes);
		

	}

}

