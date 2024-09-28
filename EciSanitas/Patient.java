import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {
	private String idCard;
	private String name;
	private String address;
	private LocalDate birthDate;
	private LocalDate registrationDate;
	private ArrayList<Appointment> appointments;
	private MedicalHistory medicalHistory;

	/**
	 * Añade una cita a un paciente
	 * @param appointment, cita del paciente
	 */
	public void addAppointment(Appointment a) {
		this.appointments.add(a);
	}

}
