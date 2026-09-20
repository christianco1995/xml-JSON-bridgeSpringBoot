/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jcco.xml.json.bridge;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JCCO
 */

@RestController
@RequestMapping("/api/bridge")
public class IntegrationController {
	
	private static final Logger log = LoggerFactory.getLogger(IntegrationController.class);
	
	// JSON -> XML
    @PostMapping(
        value = "/send-to-legacy",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_XML_VALUE
    )
	
    public Client jsonToXml(@Valid @RequestBody Client client) {
        log.info("Petition for JSON -> XML transformation recieved for client ID: {}", client.getId());
		// Adding an extra text just to test it works
        client.setName(client.getName() + " (Processed to XML)");
        return client; 
    }

    // XML -> JSON
    @PostMapping(
        value = "/recieve-from-legacy",
        consumes = MediaType.APPLICATION_XML_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
	
    public Client xmlToJson(@Valid @RequestBody Client client) {
		log.info("Petition for XML -> JSON transformation recieved for client ID: {}", client.getId());
		// Adding an extra text just to test it works
        client.setName(client.getName() + " (Processed to JSON)");
        return client; 
    }
}
