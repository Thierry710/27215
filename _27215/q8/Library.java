package _27215.q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        setLibraryName(libraryName);
        setLocation(location);
        setPhoneNumber(phoneNumber);
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) throws LibraryDataException {
        if (libraryName == null || libraryName.trim().isEmpty()) {
            throw new LibraryDataException("Library name cannot be null or empty");
        }
        this.libraryName = libraryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) throws LibraryDataException {
        if (location == null || location.trim().isEmpty()) {
            throw new LibraryDataException("Location cannot be null or empty");
        }
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws LibraryDataException {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new LibraryDataException("Phone number cannot be null or empty");
        }
        String digits = phoneNumber.replaceAll("\\D", "");
        if (digits.length() != 10) {
            throw new LibraryDataException("Phone number must contain exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Library: " + libraryName + " (" + location + ")\nContact: " + phoneNumber;
    }
}

