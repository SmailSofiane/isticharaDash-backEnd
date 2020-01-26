package dz.miclat.isticharaDash.dashBoard.datasource;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;





/*
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "dz.miclat.isticharaDash.dashBoard.repository",
entityManagerFactoryRef = "dashEntityManagerFactory", 
transactionManagerRef = "dashTransactionManager")*/
public class DashdataConfig {
	/*@Primary
	@Bean(name = "second-datasource")
	@ConfigurationProperties(prefix = "spring.second-datasource")
	public DataSource datasource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "dashEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("second-datasource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("dz.miclat.isticharaDash.dashBoard.model")
				.persistenceUnit("IsticharaUsers").build();
	}

	@Primary
	@Bean(name = "dashTransactionManager")
	public PlatformTransactionManager barTransactionManager(
			@Qualifier("dashTransactionManager") EntityManagerFactory barEntityManagerFactory) {
		return new JpaTransactionManager(barEntityManagerFactory);
	}
*/
}
