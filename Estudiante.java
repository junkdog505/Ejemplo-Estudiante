import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Estudiante  {
	private String codigo;
	private String nombre;
	private Calendar fechaNac;
	private double cuota;
	
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public Estudiante() {
		this(null,null,null, 0);
	}
	public Estudiante(String codigo, String nombre, Calendar fecnac, double cuota ) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaNac = fecnac;
		this.cuota = cuota;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	@Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("Codigo: %s \tNombre: %20s \tFecha de Nacimiento: %s \tCuota: %.2f",
        		this.codigo,this.nombre,sdf.format(this.fechaNac.getTime()),this.cuota);
    }
	public int obtenerEdad() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String fecha = sdf.format(this.fechaNac.getTime());
		String anho = fecha.substring(6,10);
		return 2021 - Integer.parseInt(anho);
	}
	
}
