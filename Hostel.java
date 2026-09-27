package geo2102_group3_hostel_assignment1;

public class Hostel { // Hostel information   
    private String hostelId;
    private String hostelName;
    private String accommodationType;
    private double rentalPrice;
    private String occupancyStatus;
    private double latitude;
    private double longitude;

    // Constructor
    public Hostel(String hostelId, String hostelName,
                  String accommodationType, double rentalPrice,
                  String occupancyStatus, double latitude,
                  double longitude) {

        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.accommodationType = accommodationType;
        this.rentalPrice = rentalPrice;
        this.occupancyStatus = occupancyStatus;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters
    public String getHostelId() {
        return hostelId;
    }

    public String getHostelName() {
        return hostelName;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public String getOccupancyStatus() {
        return occupancyStatus;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    
}