package com.hiper;


import com.hiper.interfaces.InterfaceSupplements;
import com.hiper.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author LORENA NAVAS
 */

@Component
@SpringBootApplication

public class HipercaloricoApplication {

    @Autowired
    private InterfaceSupplements interfaceSupplements;
    @Autowired
    private InterfaceUser interfaceUser;
    
	public static void main(String[] args) {
		SpringApplication.run(HipercaloricoApplication.class, args);
	}
        
    public void run(String... args) throws Exception {
        interfaceSupplements.deleteAll();
        interfaceUser.deleteAll();
    }
        

}
