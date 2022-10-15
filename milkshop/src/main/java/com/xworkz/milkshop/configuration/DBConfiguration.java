package com.xworkz.milkshop.configuration;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguration {
	public DBConfiguration() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean managerFactoryBean(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean managerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		managerFactoryBean.setPackagesToScan("com.xworkz");
		managerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		System.out.println("getting data source from spring ");
		managerFactoryBean.setDataSource(dataSource);

		Map<String, Object> jpaProperties = new HashMap<String, Object>();
		jpaProperties.put("hibernate.show_sql", true);

		managerFactoryBean.setJpaPropertyMap(jpaProperties);
		return managerFactoryBean;

	}

	@Bean
	public DataSource dataSource() {
		System.out.println("created datasource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/XWORKZ");
		dataSource.setPassword("7411523837");
		dataSource.setUsername("root");

		return dataSource;

	}
}
