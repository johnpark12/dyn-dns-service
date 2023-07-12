package in.johnpark.dnsupdater.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // return http
        //     .authorizeHttpRequests(authCustomizer -> authCustomizer
        //         .requestMatchers(HttpMethod.POST, "/add").permitAll()
        //         .anyRequest().authenticated() // This line means all other requests need to be authenticated
        //     )
        //     .build();

        // TODO: Set for each known path in the future.
        return http
            .authorizeHttpRequests(authCustomizer -> authCustomizer
                .anyRequest().authenticated())
            .httpBasic(withDefaults())
            .csrf(csrf -> csrf
            .disable())
            .build();
    }
}
