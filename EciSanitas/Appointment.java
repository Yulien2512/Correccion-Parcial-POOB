import java.time.LocalDate;
import java.util.ArrayList;

public class Appointment {
	private String id;
	private LocalDate fecha;
	private int time;
	private String reason;
	private Doctor doctor;
	private Office office;
	private ArrayList<Treatment> patientTreatments;
	private ArrayList<PatientIllness> patientIllnesses;


	/**
	 * Constructor clase appointmente
	 * @param d Doctor asignado
	 * @param o Oficina o consultorio asignado
	 * @param date Fecha que se desea agendar
	 * @param timeSlot Franja horaria
	 */
	public Appointment(Doctor d, Office o, LocalDate date, int timeSlot) {
		this.doctor = d;
		this.office = o;
		this.fecha = date;
		this.time = timeSlot;
		this.patientTreatments = new ArrayList<>();
		this.patientIllnesses = new ArrayList<>();
	}
}
