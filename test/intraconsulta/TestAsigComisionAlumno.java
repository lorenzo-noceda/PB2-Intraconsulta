package intraconsulta;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import enums.DiaDeCursada;
import enums.Turno;

public class TestAsigComisionAlumno {

	@Test
	public void queSePuedaInscribirUnAlumnoAUnaComision() {
		Materia materia = new Materia("pb2", 2300);
		Aula aula = new Aula(15, 90);
		LocalDate inicioInscripcion = LocalDate.of(2023, 3, 3);
		LocalDate finInscripcion = LocalDate.of(2023, 3, 13);
		LocalDate inicioCicloLec = LocalDate.of(2023, 3, 27);
		LocalDate finCicloLec = LocalDate.of(2023, 7, 27);
		CicloLectivo cicloLectivo = new CicloLectivo(1, inicioInscripcion, finInscripcion, inicioCicloLec, finCicloLec);
		Integer codigoComision = 3454;
		Comision comision = new Comision(codigoComision, aula, materia, cicloLectivo, Turno.MAÑANA, DiaDeCursada.JUEVES);
		LocalDate fechaDeNacimiento = LocalDate.of(2001, 11, 19);
		LocalDate fechaDeIngreso = LocalDate.of(2022, 3, 10);
		Alumno alumno = new Alumno("Lorenzo", "Noceda", 43469499, fechaDeNacimiento, fechaDeIngreso);
		Integer idAsignacion = 1;
		
		AsigComisionAlumno cursada = new AsigComisionAlumno(idAsignacion, comision, alumno);
		
		assertNotNull(cursada);
	}
	
	@Test
	public void queDosAsignacionesConMismoIdSeanConsideradasObjetosIguales() {
		Materia materia = new Materia("pb2", 2300);
		Aula aula = new Aula(15, 90);
		LocalDate inicioInscripcion = LocalDate.of(2023, 3, 3);
		LocalDate finInscripcion = LocalDate.of(2023, 3, 13);
		LocalDate inicioCicloLec = LocalDate.of(2023, 3, 27);
		LocalDate finCicloLec = LocalDate.of(2023, 7, 27);
		CicloLectivo cicloLectivo = new CicloLectivo(1, inicioInscripcion, finInscripcion, inicioCicloLec, finCicloLec);
		Integer codigoComision = 3454;
		Comision comision = new Comision(codigoComision, aula, materia, cicloLectivo, Turno.MAÑANA, DiaDeCursada.JUEVES);
		LocalDate fechaDeNacimiento = LocalDate.of(2001, 11, 19);
		LocalDate fechaDeIngreso = LocalDate.of(2022, 3, 10);
		Alumno alumno = new Alumno("Lorenzo", "Noceda", 43469499, fechaDeNacimiento, fechaDeIngreso);
		Integer idAsignacion = 1;
		
		AsigComisionAlumno asignacion = new AsigComisionAlumno(idAsignacion, comision, alumno);
		AsigComisionAlumno asignacion2 = new AsigComisionAlumno(idAsignacion, comision, alumno);
		
		assertEquals(asignacion, asignacion2);
	}

}
