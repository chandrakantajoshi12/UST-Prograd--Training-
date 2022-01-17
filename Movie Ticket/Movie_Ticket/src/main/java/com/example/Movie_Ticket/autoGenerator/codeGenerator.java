package com.example.Movie_Ticket.autoGenerator;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;




import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

    public class codeGenerator implements IdentifierGenerator {
        public int generateCustomId() {
            Random random = new Random();
            return random.nextInt(100);
        }

        @Override
        public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
            String prefix = "M1";
            return prefix + generateCustomId();
        }
    }
    
