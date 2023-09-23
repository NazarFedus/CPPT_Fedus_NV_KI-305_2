package KI305.Fedus.Lab2;

/**
 * The Company class represents a company or manufacturer.
 */
public class Company {
    private String name;
    private String address;
    private String phoneNumber;

    /**
     * Default constructor for a Company.
     * Initializes the company's name, address, and phone number to "Unknown."
     */
    public Company() {
        name = "Unknown";
        address = "Unknown";
        phoneNumber = "Unknown";
    }

    /**
     * Parameterized constructor for a Company.
     *
     * @param name        The name of the company.
     * @param address     The address of the company.
     * @param phoneNumber The phone number of the company.
     */
    public Company(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Get the name of the company.
     *
     * @return The name of the company.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the company.
     *
     * @param name The name of the company.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the address of the company.
     *
     * @return The address of the company.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address of the company.
     *
     * @param address The address of the company.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the phone number of the company.
     *
     * @return The phone number of the company.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the phone number of the company.
     *
     * @param phoneNumber The phone number of the company.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}