package cys.gnanu.SumUp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;

@RestController
@RequestMapping("/auth")
public class FirebaseAuthController {

	 @PostMapping("/firebase")
	    public Map<String, Object> verifyToken(@RequestBody Map<String, String> payload) throws Exception {
	        String token = payload.get("token");
	        FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(token);

	        String email = decodedToken.getEmail(); // Extract Gmail address securely
	        String name = decodedToken.getName(); // Optional: Extract user's name
	        // You can store this in session if you need to
	        // request.getSession().setAttribute("userEmail", email);
	        System.out.println("User email: " + email+"-->"+name);
	        // Respond with success or redirect info
	        Map<String, Object> response = new HashMap<>();
	        response.put("status", "success");
	        response.put("email", email);
	        response.put("redirect", "/home");  // tell frontend where to go
	        return response;
	    }
	}