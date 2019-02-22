import com.google.api.client.auth.oauth2.BearerToken
import com.google.api.client.auth.oauth2.Credential
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.services.testing.Testing

fun main(args: Array<String>) {
    val credentials = Credential.Builder(BearerToken.authorizationHeaderAccessMethod()).build()
    val testing = Testing.Builder(GoogleNetHttpTransport.newTrustedTransport(), JacksonFactory(), credentials)
}