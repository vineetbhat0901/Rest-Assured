package resources.requestbody.contacts;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddContactPayload {
    private String firstName;
    private String lastName;
    private String birthdate;
    private String email;
    private String phoneNumber;
    private String street1;
    private String street2;
    private String city;
    private String stateProvince;
    private String postalCode;
    private String country;
}
