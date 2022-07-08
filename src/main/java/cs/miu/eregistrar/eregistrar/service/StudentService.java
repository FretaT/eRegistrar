package cs.miu.eregistrar.eregistrar.service;

import cs.miu.eregistrar.eregistrar.model.Student;

import java.util.List;

public interface StudentService {
    public abstract List<Student> getAllStudents();
    public abstract Student addNewStudent(Student student);
    public abstract Student updateStudent(Student updateStudent);
    public abstract void deleteStudentById(Long studentId);
    public abstract Student getStudentById(Long studentId);
}
