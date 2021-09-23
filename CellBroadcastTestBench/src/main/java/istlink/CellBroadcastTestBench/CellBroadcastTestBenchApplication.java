package istlink.CellBroadcastTestBench;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
public class CellBroadcastTestBenchApplication {

	public static void main(String[] args) {

		SpringApplication.run(CellBroadcastTestBenchApplication.class, args);
	}
	
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("istlink.CellBroadcastTestBench"))                                    
	          .build();                                           
	    }

}
