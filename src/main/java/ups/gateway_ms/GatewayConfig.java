package ups.gateway_ms;

import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouterLocator customRouteLocator (RouterLocatorBuilder builder) {
        return builder.routes()
                .route("micro2", r -> r.path("/micro1/**").uri("http://localhost:8081"))
                .route("micro2", r -> r.path("/micro2/**").uri("http://localhost:8082"))
                .route("micro2", r -> r.path("/micro3/**").uri("http://localhost:8083"))
                .build();

    }
}
