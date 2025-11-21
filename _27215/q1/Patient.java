package _27215.q1;


public class Patient extends Entity {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;
    
    
    public Patient(int id, String createdDate, String updatedDate,
                  String patientName, int age, String gender, String contactNumber) 
                  throws HospitalDataException {
        super(id, createdDate, updatedDate);
        setPatientName(patientName);
        setAge(age);
        setGender(gender);
        setContactNumber(contactNumber);
    }
    
    
    public String getPatientName() {
        return patientName;
    }
    
    public void setPatientName(String patientName) throws HospitalDataException {
        if (patientName == null || patientName.trim().isEmpty()) {
            throw new HospitalDataException("Patient name cannot be null or empty");
        }
        this.patientName = patientName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) throws HospitalDataException {
        if (age <= 0) {
            throw new HospitalDataException("Age must be greater than 0");
        }
        this.age = age;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) throws HospitalDataException {
        if (gender == null || gender.trim().isEmpty()) {
            throw new HospitalDataException("Gender cannot be null or empty");
        }
        
        if (!gender.equalsIgnoreCase("Male") && 
            !gender.equalsIgnoreCase("Female") && 
            !gender.equalsIgnoreCase("Other")) {
            throw new HospitalDataException("Gender must be 'Male', 'Female', or 'Other'");
        }
        this.gender = gender;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(String contactNumber) throws HospitalDataException {
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new HospitalDataException("Contact number cannot be null or empty");
        }
        this.contactNumber = contactNumber;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nPatient Name: " + patientName + 
               ", Age: " + age + ", Gender: " + gender + ", Contact: " + contactNumber;
    }
}


