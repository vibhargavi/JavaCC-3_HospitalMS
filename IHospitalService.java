package dao;

import entity.appointment;

import java.util.ArrayList;
import java.util.List;

public interface IHospitalService {
    appointment getAppointmentById(int appointmentID);
    ArrayList<appointment> getAppointmentsForPatient(int patientID);
    ArrayList<appointment> getAppointmentsForDoctor(int doctorID);
    boolean scheduleAppointment(appointment appointment);
    boolean updateAppointment(appointment appointment);
    boolean cancelAppointment(int appointmentID);
}