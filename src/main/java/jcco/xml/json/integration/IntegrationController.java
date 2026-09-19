/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jcco.xml.json.integration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author JCCO
 */

@RestController
@RequestMapping("/api/bridge")
public class IntegrationController {
	// JSON -> XML
    @PostMapping(
        value = "/send-to-legacy",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_XML_VALUE
    )
	
    public Client jsonToXml(@RequestBody Client client) {
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
    public Client xmlToJson(@RequestBody Client client) {
		// Adding an extra text just to test it works
        client.setName(client.getName() + " (Processed to JSON)");
        return client; 
    }
}
