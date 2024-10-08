package application.backend.beans;

import application.backend.enums.AppointmentStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class Appointments {

    private String appointmentId;
    private String patientId;
    private String doctorId;
    private LocalDateTime appointmentDate;
    private AppointmentStatus appointmentStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Appointments() {
        appointmentId=null;
        patientId=null;
        doctorId=null;
        appointmentDate=null;
        appointmentStatus=null;
        createdAt=null;
        updatedAt=null;
    }

    public Appointments(String appointmentId, String patientId, String doctorId, LocalDateTime appointmentDate, AppointmentStatus appointmentStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public AppointmentStatus getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Appointment ID:" + appointmentId + "\t\tPatient ID:" + patientId + "\t\tDoctor ID:" + doctorId + "\t\tAppointment Date:" + appointmentDate + "\t\tStatus:" + appointmentStatus;
    }

}
