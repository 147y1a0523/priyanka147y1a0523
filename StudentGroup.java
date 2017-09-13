import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
private ArrayList<Student> students;
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	
public StudentGroup(int length)
 {
	return students.size();
	this.students = new Student[length];
}

@Override
public Student[] getStudents() 
{
	return Arrays.copy(students,student.length);
	return null;
}

@Override
public void setStudents(Student[] students)
 {
	return Arrays.copy(students,student.length);
	return null;
}

@Override
public Student getStudent(int index) 
{
	return Arrays.copy(students,student.length);
	return getStudent().getstudent() +"" int index";
	return null;
}

@Override
public Student setStudent(int index) 
{
	for(int i=0;i<student.length;i++)
		{
			if(student==student[i])
			continue;
			if(student[i]==null)
			student[i]=student;
			return;
		}
}
public void add(Student student, int index) {
for(int i=0;i<student.length;i++)
{
	if(student==student[i])
	continue;
	if(student[i]==null)
	student[i]=student;
	return;
}
@Override
public void remove(int index)
 {
	arrlist.remove();
	 System.out.println("Now, Size of list: " + arrlist.size());
}

@Override
public void remove(Student student) 
{
	students.remove(student);
}
public void removeFromElement(Student student) 
{
students.removeelement(student);
}
 
public static String remove(String studentID) 
{
        for(Student s : studentList) 
{
            String ident = s.getStudentID();
        s.remove("3");                               
        s.remove("3");                                      
        if (!ident.equals(s))
            System.out.println(ident + " does not exist.");
        }
    }
}

	@Override
	public void removeToIndex(int index) 
	{
	students.remove(i);
	}

	@Override
	public void removeToElement(Student student) {
		students.removeelement(student);
	}

@Override
public void bubbleSort() 
{
	for (int i = 0; i < numbers.length; i++){
     System.out.println(numbers[i].toString());
}

	@Override
	public Student[] getByBirthDate(Date date) {
		this.birthDate = birthDate;
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		student date of birth in "yyyy-MM-dd"=this.return birthDate;
		return null;
	}

	

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		this.ByDate=indexOFStudent;		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		this.ByAge = Byage;
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark()
 {
		this.student=this.avgmarks
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		student s=new student;
		s.nextstudent();
		return null;
	}
}
