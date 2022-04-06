import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Principal {

	public static void main(String[] args)throws ParseException {
		 Curso pooGr2 = new Curso();
	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	        Calendar fechaNacimiento2 = Calendar.getInstance();
	        fechaNacimiento2.setTime(sdf.parse("01-01-2001"));
	        pooGr2.matriculaEstudiante(new Estudiante("1234","Alvaro Alvarez",fechaNacimiento2,22.2));
	        Calendar fechaNacimiento3 = Calendar.getInstance();
	        fechaNacimiento3.setTime(sdf.parse("04-04-2004"));
	        pooGr2.matriculaEstudiante(new Estudiante("2345","Golzalo Golsalez",fechaNacimiento3, 25.3));
	        Calendar fechaNacimiento4 = Calendar.getInstance();
	        fechaNacimiento4.setTime(sdf.parse("07-07-1997"));
	        pooGr2.matriculaEstudiante(new Estudiante("3456","Toribio Tozcano",fechaNacimiento4,32.4));
	        Calendar fechaNacimiento5 = Calendar.getInstance();
	        fechaNacimiento5.setTime(sdf.parse("12-12-1990"));
	        pooGr2.matriculaEstudiante(new Estudiante("4567","Peter Parker",fechaNacimiento5,12.5));
	        Calendar fechaNacimiento6 = Calendar.getInstance();
	        fechaNacimiento6.setTime(sdf.parse("31-08-2014"));
	        pooGr2.matriculaEstudiante(new Estudiante("6789","Mikey Mouse",fechaNacimiento6,11.6));
	        Calendar fechaNacimiento7 = Calendar.getInstance();
	        fechaNacimiento7.setTime(sdf.parse("13-08-2014"));
	        pooGr2.matriculaEstudiante(new Estudiante("9876","Toribio Zabala",fechaNacimiento7,18.7));
	        
	        System.out.println("~~~~~~~~~~~~~~~~Lista de Estudiantes~~~~~~~~~~~~~~~~");
	        pooGr2.listaCurso();
	}
}
