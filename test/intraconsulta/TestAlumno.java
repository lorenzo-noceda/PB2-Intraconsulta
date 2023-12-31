package intraconsulta;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestAlumno {

	@Test
	public void queSePuedaCrearUnAlumno() {
		String nombre = "Lorenzo", apellido = "Noceda";
		Integer dni = 43469499;
		LocalDate fechaDeNacimiento = LocalDate.of(2001, 11, 19);
		LocalDate fechaDeIngreso = LocalDate.of(2022, 3, 10);
		
		Alumno alumno = new Alumno(nombre, apellido, dni, fechaDeNacimiento, fechaDeIngreso);
		
		assertNotNull(alumno);
	}
	
	@Test
	public void queDosAlumnosConMismoDNISeanConsideradosObjetosIguales() {
		String nombre = "Lorenzo", apellido = "Noceda";
		Integer dni = 43469499;
		LocalDate fechaDeNacimiento = LocalDate.of(2001, 11, 19);
		LocalDate fechaDeIngreso = LocalDate.of(2022, 3, 10);
		
		Alumno alumno = new Alumno(nombre, apellido, dni, fechaDeNacimiento, fechaDeIngreso);
		Alumno alumnoConMismoDni = new Alumno("Juan", "Perez", dni, fechaDeNacimiento, fechaDeIngreso);
		
		assertEquals(alumno, alumnoConMismoDni);
	}

}
