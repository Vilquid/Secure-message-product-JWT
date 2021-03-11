package ku.message.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JwtResponse
{
	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("expires_in")
	private int expiresIn;

	@JsonProperty("token_type")
	private String tokenType;

	public String getAccessToken()
	{}

	// . . . generate all getters / setters . . .
}
