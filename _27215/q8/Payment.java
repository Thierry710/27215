package _27215.q8;

public class Payment extends Library {
    private String sectionName;
    private String sectionCode;
    private String title;
    private String author;
    private String isbn;
    private String memberName;
    private int memberId;
    private String contactNumber;
    private String borrowDate;
    private String returnDate;
    private double fineAmount;
    private int daysLate;
    private String paymentDate;
    private String paymentMode;

    public Payment(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode,
                   String title, String author, String isbn,
                   String memberName, int memberId, String contactNumber,
                   String borrowDate, String returnDate,
                   double fineAmount, int daysLate,
                   String paymentDate, String paymentMode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        setSectionName(sectionName);
        setSectionCode(sectionCode);
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setMemberName(memberName);
        setMemberId(memberId);
        setContactNumber(contactNumber);
        setBorrowDate(borrowDate);
        setReturnDate(returnDate);
        setFineAmount(fineAmount);
        setDaysLate(daysLate);
        setPaymentDate(paymentDate);
        setPaymentMode(paymentMode);
    }

    public String getSectionName() { return sectionName; }
    public void setSectionName(String sectionName) throws LibraryDataException {
        if (sectionName == null || sectionName.trim().isEmpty()) {
            throw new LibraryDataException("Section name cannot be null or empty");
        }
        this.sectionName = sectionName;
    }

    public String getSectionCode() { return sectionCode; }
    public void setSectionCode(String sectionCode) throws LibraryDataException {
        if (sectionCode == null || sectionCode.trim().isEmpty()) {
            throw new LibraryDataException("Section code cannot be null or empty");
        }
        if (sectionCode.length() < 3) {
            throw new LibraryDataException("Section code must be at least 3 characters");
        }
        this.sectionCode = sectionCode.toUpperCase();
    }

    public String getTitle() { return title; }
    public void setTitle(String title) throws LibraryDataException {
        if (title == null || title.trim().isEmpty()) {
            throw new LibraryDataException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) throws LibraryDataException {
        if (author == null || author.trim().isEmpty()) {
            throw new LibraryDataException("Author cannot be null or empty");
        }
        this.author = author;
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) throws LibraryDataException {
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new LibraryDataException("ISBN cannot be null or empty");
        }
        String cleaned = isbn.replaceAll("\\s+", "");
        if (cleaned.length() < 7) {
            throw new LibraryDataException("ISBN must be at least 7 characters");
        }
        this.isbn = isbn;
    }

    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) throws LibraryDataException {
        if (memberName == null || memberName.trim().isEmpty()) {
            throw new LibraryDataException("Member name cannot be null or empty");
        }
        this.memberName = memberName;
    }

    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) throws LibraryDataException {
        if (memberId <= 0) {
            throw new LibraryDataException("Member ID must be greater than 0");
        }
        this.memberId = memberId;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws LibraryDataException {
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new LibraryDataException("Contact number cannot be null or empty");
        }
        this.contactNumber = contactNumber;
    }

    public String getBorrowDate() { return borrowDate; }
    public void setBorrowDate(String borrowDate) throws LibraryDataException {
        if (borrowDate == null || borrowDate.trim().isEmpty()) {
            throw new LibraryDataException("Borrow date cannot be null or empty");
        }
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) throws LibraryDataException {
        if (returnDate == null || returnDate.trim().isEmpty()) {
            throw new LibraryDataException("Return date cannot be null or empty");
        }
        this.returnDate = returnDate;
    }

    public double getFineAmount() { return fineAmount; }
    public void setFineAmount(double fineAmount) throws LibraryDataException {
        if (fineAmount < 0) {
            throw new LibraryDataException("Fine amount cannot be negative");
        }
        this.fineAmount = fineAmount;
    }

    public int getDaysLate() { return daysLate; }
    public void setDaysLate(int daysLate) throws LibraryDataException {
        if (daysLate < 0) {
            throw new LibraryDataException("Days late cannot be negative");
        }
        this.daysLate = daysLate;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws LibraryDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            throw new LibraryDataException("Payment date cannot be null or empty");
        }
        this.paymentDate = paymentDate;
    }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) throws LibraryDataException {
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new LibraryDataException("Payment mode cannot be null or empty");
        }
        this.paymentMode = paymentMode;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSection: " + sectionName + " (" + sectionCode + ")"
                + "\nTitle: " + title + " by " + author + "\nISBN: " + isbn
                + "\nMember: " + memberName + " (" + memberId + ")";
    }
}

