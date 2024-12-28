package in.shubs.generator;


import java.util.UUID;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class orderidgenerator implements IdentifierGenerator{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String prefix = "OD";
	
		return prefix+UUID.randomUUID().toString();
	}

}
