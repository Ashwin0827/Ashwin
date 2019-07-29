package model;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
@Data
public class dongle {
    @Size(min = 2,message = "Atleast 2 characters")
    private String firstname;


    @Size(min = 2,message = "Atleast 2 characters")
    private String lastname;



    @Size(min = 30,message = "Atleast 30 characters")
    private String address;


    @Size(min = 5,message = "Atleast 5 characters")
    private String city;

    @Size(min = 5,message = "Atleast 5 characters")
    private String state;

    @Digits(integer=6, fraction=0, message="Enter mode of payment")
    private String zip;

    @Digits(integer=12, fraction=0, message="Invalid aadhar number")
    private String aadhar;

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String cvv;

    @Size(min = 3,message = "Invalid email")
    private String email;
}
