package geo2102_group3_hostel_assignment1;

/**
 * Main application for processing Group 3 hostel data.
 *
 * Group 3 is assigned hostel records H11 to H15.
 */
public class GEO2102_Group3_Hostel_Assignment1 {

    public static void main(String[] args) {

        
        // GROUP 3 HOSTEL DATA
        // Hostel records assigned to Group 3: H11 - H15
       

        Hostel[] hostels = {

            new Hostel(
                "H11",
                "Lugoba Hostel",
                "Not self-contained (Single)",
                400000,
                "Partially Occupied",
                0.60381995,
                32.477415
            ),

            new Hostel(
                "H12",
                "Blue Sheets Hostel",
                "Self-contained (Single)",
                700000,
                "Occupied",
                0.60435603,
                32.477067
            ),

            new Hostel(
                "H13",
                "Sofi Hostel",
                "Self-contained (Single)",
                1200000,
                "Partially Occupied",
                0.60272802,
                32.47707
            ),

            new Hostel(
                "H14",
                "Bwino Hostel",
                "Not self-contained (Single)",
                400000,
                "Occupied",
                0.60202834,
                32.477371
            ),

            new Hostel(
                "H15",
                "Elpa 2 Hostel",
                "Self-contained",
                900000,
                "Partially Occupied",
                0.60055991,
                32.477305
            )
        };

        
        // VARIABLES USED FOR PROCESSING
        

        double totalRentalPrice = 0;

        int fullyOccupied = 0;

        int notFullyOccupied = 0;

        
        // DISPLAY HEADING
        

        System.out.println("----------------------------------------------");
        System.out.println("       GEO2102 - GROUP 3 HOSTEL DATA");
        System.out.println("----------------------------------------------");
        System.out.println();

        
        // PROCESS ALL HOSTELS USING A LOOP
        

        for (Hostel hostel : hostels) {

            System.out.println("----------------------------------------------");

            System.out.println("Hostel ID: "
                    + hostel.getHostelId());

            System.out.println("Hostel Name: "
                    + hostel.getHostelName());

            System.out.println("Accommodation Type: "
                    + hostel.getAccommodationType());

            System.out.println("Rental Price: UGX "
                    + hostel.getRentalPrice());

            System.out.println("Occupancy Status: "
                    + hostel.getOccupancyStatus());

            System.out.println("Latitude: "
                    + hostel.getLatitude());

            System.out.println("Longitude: "
                    + hostel.getLongitude());

            
            // CREATE THE REQUIRED isOccupied BOOLEAN
            

            boolean isOccupied =
                    hostel.getOccupancyStatus()
                            .equalsIgnoreCase("Occupied");

            
            // SELECTION STATEMENT
            // Determine whether hostel is fully occupied
            

            if (isOccupied) {

                System.out.println("Fully Occupied: Yes");

                fullyOccupied++;

            } else {

                System.out.println("Fully Occupied: No");

                notFullyOccupied++;
            }

            // Add this hostel's rental price to the total
            totalRentalPrice += hostel.getRentalPrice();

            System.out.println();
        }

       
        // CALCULATE AVERAGE RENTAL PRICE
        

        double averageRentalPrice =
                totalRentalPrice / hostels.length;

   
        // DISPLAY SUMMARY
        

        System.out.println("----------------------------------------------");
        System.out.println("             GROUP 3 SUMMARY");
        System.out.println("----------------------------------------------");

        System.out.println("Number of Hostels: "
                + hostels.length);

        System.out.println("Average Rental Price: UGX "
                + averageRentalPrice);

        System.out.println("Number of Fully Occupied Hostels: "
                + fullyOccupied);

        System.out.println("Number of Not Fully Occupied Hostels: "
                + notFullyOccupied);

        System.out.println("----------------------------------------------");
    }
}
