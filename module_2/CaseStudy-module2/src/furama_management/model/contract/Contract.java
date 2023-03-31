package furama_management.model.contract;

public class Contract {
    private String contractNumber;
    private String bookingCode;
    private long deposit;
    private long totalPrice;
    private String customerID;

    public Contract() {
    }

    public Contract(String contractNumber, String bookingCode, long deposit, long totalPrice, String customerID) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.deposit = deposit;
        this.totalPrice = totalPrice;
        this.customerID = customerID;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", deposit=" + deposit +
                ", totalPrice=" + totalPrice +
                ", customerID='" + customerID + '\'' +
                '}';
    }
    public String toCsv(){
        return contractNumber+","+bookingCode+","+deposit+","+totalPrice+","+customerID;
    }
}
