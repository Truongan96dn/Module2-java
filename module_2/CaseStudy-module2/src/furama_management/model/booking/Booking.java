package furama_management.model.booking;

public class Booking {
    private String bookingCode;
    private String startDate;
    private String endDate;
    private String customerCode;
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String bookingCode, String startDate, String endDate, String customerCode, String serviceName, String typeOfService) {
        this.bookingCode = bookingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", ServiceName='" + serviceName + '\'' +
                ", TypeOfService='" + typeOfService + '\'' +
                '}';
    }
    public String toCsv(){
        return bookingCode+","+startDate+","+endDate+","+customerCode+","+serviceName+","+typeOfService;
    }
}
