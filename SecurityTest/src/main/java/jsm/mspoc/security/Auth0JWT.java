/**
 * 
 */
package jsm.mspoc.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;

/**
 * @author Empleado
 *
 */
public class Auth0JWT
{

	/**
	 * 
	 */
	private static final String HMAC_SECRET = "secret debe ser conocido por cliente y servidor";
	private static final String ISSUER = "JSM";
	private static final String CUR_DATE_CLAIM = "fecha_creacion";
	private static final String CUR_DATE = "20171002";

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Generando JWT...");
		String jwt = generate_HMAC_SECRET_JWT();
		System.out.println("JWT [" + jwt + "]");

		System.out.println("Validando JWT...");
		Boolean isValid = validate_HMAC_SECRET_JWT(jwt);
		System.out.println("Is valid [" + isValid + "]");
	}

	/**
	 * @return
	 */
	private static String generate_HMAC_SECRET_JWT()
	{
		String jwt = null;
		try
		{
			Algorithm algorithmHS = Algorithm.HMAC256(HMAC_SECRET);
			jwt = JWT.create().withIssuer(ISSUER).withClaim(CUR_DATE_CLAIM, CUR_DATE).sign(algorithmHS);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return jwt;
	}

	/**
	 * @return
	 */
	private static boolean validate_HMAC_SECRET_JWT(String jwt)
	{
		Boolean isValid = null;
		try
		{
			Algorithm algorithmHS = Algorithm.HMAC256(HMAC_SECRET);
			JWTVerifier verifier = JWT.require(algorithmHS).withIssuer(ISSUER).withClaim(CUR_DATE_CLAIM, CUR_DATE).build();
			verifier.verify(jwt);
			isValid = true;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			isValid = false;
		}
		return isValid;
	}

}
