package application.backend.beans;

import application.backend.enums.Roles;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Doctor extends Users {
    @JsonProperty("doctor_id")
    private String doctorId;
    @JsonProperty("specialization")
    private String specialty;
    @JsonProperty("contact_info")
    private String contactInfo;

    public Doctor() {
        super();
        doctorId = null;
        specialty = null;
        contactInfo = null;
    }

    public Doctor(String userId, String name, String password, Roles role, String specialty, String contactInfo, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(userId, name, password, role, createdAt, updatedAt);
        this.doctorId = userId;
        this.specialty = specialty;
        this.contactInfo = contactInfo;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Doctor ID:" + doctorId +"\t\tName:"+getName()+"\t\tSpecialization:"+specialty+"\t\tContact Info:"+contactInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(doctorId, doctor.doctorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId);
    }
}
