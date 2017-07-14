package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-14T09:18:45.553Z")

public class NotFoundException extends ApiException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int code;

	public NotFoundException(int code, String msg)
	{
		super(code, msg);
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public int getCode()
	{
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(int code)
	{
		this.code = code;
	}

}
