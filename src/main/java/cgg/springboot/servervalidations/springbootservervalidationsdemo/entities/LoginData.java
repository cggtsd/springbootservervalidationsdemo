package cgg.springboot.servervalidations.springbootservervalidationsdemo.entities;

import cgg.springboot.servervalidations.springbootservervalidationsdemo.validations.ImageNameValid;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData 
{
    @NotBlank(message = "User Name Cannot be empty !!" )
    @Size(min=3,max=12,message="User Name must be between 3-12 characters")
    private String userName;
   
    @Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="Invalid Email !!")
    private String email;
   
    @AssertTrue(message = "Must agree terms and conditions")
    private boolean agreed; 
    
    @ImageNameValid
    private String imageName;

    public LoginData(){
    }

    public LoginData(
            @NotBlank(message = "User Name Cannot be empty !!") @Size(min = 3, max = 12, message = "User Name must be between 3-12 characters") String userName,
            @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email !!") String email,
            @AssertTrue(message = "Must agree terms and conditions") boolean agreed) {
       
        this.userName = userName;
        this.email = email;
        this.agreed = agreed;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "LoginData [userName=" + userName + ", email=" + email + ", agreed=" + agreed + "]";
    }
     
 }

