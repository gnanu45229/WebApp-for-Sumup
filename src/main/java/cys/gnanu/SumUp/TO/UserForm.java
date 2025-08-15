package cys.gnanu.SumUp.TO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {
	
	private String fname;
	private String lname;
	private String password;
	private String mobile;
	private String email;
	
	private String alias;

}
