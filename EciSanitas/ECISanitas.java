import java.time.LocalDate;
import java.util.TreeMap;

// Invariante = Un doctor no puede agendar dos citas en la misma franja horaria el mismo dia.

public class ECISanitas {
    private TreeMap<String, Patient> patients;
    private TreeMap<String, Hospital> hospitals;
    private TreeMap<String,Illness> ilnesses;

    /**
     * Obtiene el paciente por patientId
     * @param patientId Id del paciente
     * @return Patient, paciente
     */
    private Patient getPatient(String patientId) {
        return patients.get(patientId);
    }

    /**
     * Obtiene el hosopital por nombre
     * @param hospitalName Nombre del hospital
     * @return Hospital, hospital
     */
    private Hospital getHospital(String hospitalName) {
        return hospitals.get(hospitalName);

    }

    /**
     * Programa una cita para un paciente en un hospital teniendo cn cuneta especialidad del doctor , fecha y hora.
     * @param patientId Id del paciente
     * @param hospitalName Nombre del paciente
     * @param requestedSpeciality Especialidad requerida
     * @param date Fecha de la cita
     * @param timeSlot Hora de la cita
     */
    public void scheduleAppointment(String patientId, String hospitalName, String requestedSpeciality, LocalDate date, int timeSlot) {
        Patient p = getPatient(patientId);
        Hospital h = getHospital(hospitalName);

        if (!p.equals(null) && !h.equals(null)) {
            h.createAppoinment(p, requestedSpeciality, date, timeSlot);
        }

    }
}

