package pe.com.banbif.correo.eletronico.service.config;

import org.mongeez.Mongeez;
import org.mongeez.MongoAuth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.mongodb.Mongo;

@Configuration
public class MongeezConfig {
	
	
	@Value("${spring.data.mongodb.username:#{null}}")
	private String username;
	
	@Value("${spring.data.mongodb.password:#{null}}")
	private String password;
	
	@Value("${spring.data.mongodb.host:localhost}")
	private String host;
	
	@Value("${spring.data.mongodb.port:27017}")
	private String port;
	
	@Value("${spring.data.mongodb.database:email-service}")
	private String dbName;
	
	
	@Bean
	public Mongeez process() {
        Mongeez mongeez = new Mongeez();
        mongeez.setFile(new ClassPathResource("db/mongeez.xml"));
        mongeez.setMongo(buildMongo());
        if(username != null) {
        	mongeez.setAuth(buildAuth());
        }
        mongeez.setDbName(dbName);
        mongeez.process();
        
        return mongeez;
	}


	@SuppressWarnings("deprecation")
	private Mongo buildMongo() {
		return new Mongo(host, Integer.valueOf(port));
	}


	private MongoAuth buildAuth() {
		return new MongoAuth(username, password, dbName);
	}
}
