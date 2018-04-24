package com.utsi.springweb;


import com.utsi.springweb.model.User;
import com.utsi.springweb.model.UserProfile;
import com.utsi.springweb.repository.UserProfileRepository;
import com.utsi.springweb.repository.UserRepository;
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Application implements CommandLineRunner {
 
 @Autowired
 UserRepository userRepository;
 @Autowired
 UserProfileRepository userProfileRepository;
 

 public static void main(String[] args) {
 SpringApplication.run(Application.class, args);
 }

    @Override
    public void run(String... args) throws Exception {
       // userProfileRepository.
        //userRepository.deleteAllInBatch();
        
        // Create a User instance
        User user = new User("Rajeev", "Singh", "rajeev@callicoder.com",
                "MY_SUPER_SECRET_PASSWORD");

        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1992, 7, 21);

        // Create a UserProfile instance
        UserProfile userProfile = new UserProfile(1,dateOfBirth.getTime(),
                "gongabu","kathmandu", "nepal", "9849115892");


        // Set child reference(userProfile) in parent entity(user)
        user.setUserProfile(userProfile);

        // Set parent reference(user) in child entity(userProfile)
        userProfile.setUser(user);

        // Save Parent Reference (which will save the child as well)
        userRepository.save(user);

        
    }

}
