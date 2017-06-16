package Com.JAXBApplication.App;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import Com.JAXBApplication.JAXB.Address;
import Com.JAXBApplication.JAXB.Marks;
import Com.JAXBApplication.JAXB.Student;

public class StudentMarshaller {

	public static void main(String[] args) throws DatatypeConfigurationException {
		try {

			// File file = new File("C:\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// StringWriter stringWriter = new StringWriter();
			// jaxbMarshaller.marshal(getEmployee(), stringWriter);
			jaxbMarshaller.marshal(getStudent(), System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	private static Student getStudent() {
		
		Student student = new Student();
		Address address = new Address();
		Marks marks = new Marks();
		
		student.setStudentId(1001);
		student.setFirstName("Gauthaman");
		student.setLastName("Deenadayalan");
		student.setAge("24");
		
		address.setAddressType("HOME");
		address.setStreet("1026 San Jacinto");
		address.setCity("Irving");
		address.setCity("TX");
		address.setZipCode(76013);
		
		marks.setSubject("Computer Science");
		marks.setMaxMarks(100);
		marks.setMarks(95);
		
		student.getAddress().add(address);
		student.getMarks().add(marks);
		
		
		return student;
	}
}
