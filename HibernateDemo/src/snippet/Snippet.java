package snippet;

public class Snippet {
	<?xml version="1.0" encoding="UTF-8"?>
	
	<!DOCTYPE hibernate-configuration SYSTEM "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd" PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN">
	
	-<hibernate-configuration>
	
	
	-<session-factory>
	
	<!-- Database connection settings -->
	
	
	<property name="connection.driver_class">com.mysql.jdbc.Driver</property>
	
	<property name="connection.url">jdbc:mysql://localhost:3306/demo</property>
	
	<property name="connection.username">root</property>
	
	<property name="connection.password">root</property>
	
	<!-- SQL dialect -->
	
	
	<property name="dialect">org.hibernate.dialect.MySQL5Dialect</property>
	
	<!-- Echo all executed SQL to stdout -->
	
	
	<property name="show_sql">false</property>
	
	<!-- Create table if doesn't exist else Update the table -->
	
	
	<property name="hbm2ddl.auto">update</property>
	
	<mapping class=""/>
	
	</session-factory>
	
	</hibernate-configuration>
}

