package com.maitrongnghia.restapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Classroom")
public class Classroom implements Serializable {
    private long id;
    private Timestamp startTime;
    private boolean status;
    private Course course;
    private User student;
    private User teacher;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "startTime", nullable = false)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @NotNull
    @Column(name = "status", nullable = false)
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return id == classroom.id &&
                status == classroom.status &&
                Objects.equals(startTime, classroom.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, status);
    }

    @OneToOne(fetch = FetchType.EAGER)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @OneToOne(fetch = FetchType.EAGER)
    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    @OneToOne(fetch = FetchType.EAGER)
    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", status=" + status +
                ", course=" + course +
                ", student=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
