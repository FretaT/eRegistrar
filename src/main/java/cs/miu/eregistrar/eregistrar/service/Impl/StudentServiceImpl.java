package cs.miu.eregistrar.eregistrar.service.Impl;

import cs.miu.eregistrar.eregistrar.model.Student;
import cs.miu.eregistrar.eregistrar.repository.StudentRepository;
import cs.miu.eregistrar.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        var allstudents = studentRepository.findAll();
        return allstudents;
    }

    @Override
    public Student addNewStudent(Student student) {
        var addStudent = studentRepository.save(student);
        return addStudent;
    }

    @Override
    public Student updateStudent(Student student) {
        var updatestudent = studentRepository.save(student);
        return updatestudent;
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student getStudentById(Long studentId) {
        var getStudent = studentRepository.findById(studentId).orElse(null);
        return getStudent;
    }
}
