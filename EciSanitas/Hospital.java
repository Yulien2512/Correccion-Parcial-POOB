import java.time.LocalDate;
import java.util.ArrayList;

public class Hospital {
	private String name;
	private String address;
	private ArrayList<Office> offices;
	private ArrayList<Doctor> doctors;
	private Location location;
	private ArrayList<Treatment> treatments;

	/**
	 * Crea una cita en el hospital especifico teniendo en cuenta la especialidad requerida y la disponibilidad
	 * @param p Paciente
	 * @param requestedSpeciality Especialidad requerida
	 * @param date Fecha
	 * @param timeSlot Hora
	 */
	public void createAppoinment(Patient p, String requestedSpeciality, LocalDate date, int timeSlot) {
		for (Doctor d: doctors) {
			String ds = d.getSpecialty();
			boolean ia = d.isAvailable(date, timeSlot);

			if (ds.equals(requestedSpeciality) && ia) {
				generateAppointment(p, d, date, timeSlot);
			}

		}


	}

	/**
	 * Genera una cita dado un doctor y paciente en especifico.
	 * @param p Paciente
	 * @param d Doctor
	 * @param date Fecha de la cita
	 * @param timeSlot Hora de la cita
	 */
	public void generateAppointment(Patient p, Doctor d, LocalDate date, int timeSlot) {
		Office o = d.getOffice();
		Appointment a = new Appointment(d, o, date, timeSlot);
		p.addAppointment(a);

	}
}
