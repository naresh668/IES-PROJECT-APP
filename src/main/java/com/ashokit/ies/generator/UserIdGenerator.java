package com.ashokit.ies.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;


@Component
public class UserIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		String prefix = "AR1";
		String suffix = "";

		try {
			Connection con = session.connection();
			Statement st = con.createStatement();
			String query = "select AR_NUM.nextval from dual";
			ResultSet rs = st.executeQuery(query);
			if (rs.next()) {

				int seqval = rs.getInt(1);
				suffix = String.valueOf(seqval);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return prefix + suffix;
	}
	}


