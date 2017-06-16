package Com.JAXBApplication.App;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Com.JAXBApplication.JAXB.Student;



public class StudentUnMarshaller {

	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Student student = (Student) jaxbUnmarshaller.unmarshal(new File("D:/student.xml"));
			System.out.println(student.getStudentId());
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName());
			System.out.println(student.getAge());
			
		  } catch (JAXBException e) {
			e.printStackTrace();
		  }
	}

}
