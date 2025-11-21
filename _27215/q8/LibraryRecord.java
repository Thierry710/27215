package _27215.q8;

public class LibraryRecord extends Payment {
    private double totalFine;

    public LibraryRecord(int id, String createdDate, String updatedDate,
                         String libraryName, String location, String phoneNumber,
                         String sectionName, String sectionCode,
                         String title, String author, String isbn,
                         String memberName, int memberId, String contactNumber,
                         String borrowDate, String returnDate,
                         double fineAmount, int daysLate,
                         String paymentDate, String paymentMode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
              sectionName, sectionCode, title, author, isbn,
              memberName, memberId, contactNumber,
              borrowDate, returnDate, fineAmount, daysLate,
              paymentDate, paymentMode);
        this.totalFine = 0.0;
    }

    public void calculateFine() {
        this.totalFine = getFineAmount() * getDaysLate();
    }

    public double getTotalFine() {
        return totalFine;
    }

    public void displayRecord() {
        System.out.println(this.toString());
        System.out.println("Fine per day: " + getFineAmount() + ", Days late: " + getDaysLate());
        System.out.println("Total Fine: " + String.format("%.2f", totalFine));
    }
}

