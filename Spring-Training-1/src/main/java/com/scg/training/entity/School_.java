package com.scg.training.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(School.class)
public abstract class School_ {

	public static volatile SingularAttribute<School, Contact> contact;
	public static volatile SingularAttribute<School, String> schoolName;
	public static volatile SingularAttribute<School, String> city;
	public static final String Contact = "contact";
	public static final String Name = "schoolName";
	public static final String City = "city";

}
