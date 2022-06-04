package university;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("university/data.properties")
public class Insurance {
	@Value( "${policyName}" )
	private String policyName;
	@Value( "1234.3" )
	private float preminum;
	@Override
	public String toString() {
		return "Insurance [policyName=" + policyName + ", preminum=" + preminum + "]";
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public float getPreminum() {
		return preminum;
	}
	public void setPreminum(float preminum) {
		this.preminum = preminum;
	}

}
