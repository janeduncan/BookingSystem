package com.example.codeclan.bookingsystem.repositories.booking.customerRepository;
import com.example.codeclan.bookingsystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getAllCustomersForCourse(Long courseId) {
        List<Customer> foundCustomers = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.course.id", courseId));
            foundCustomers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return foundCustomers;
    }

    @Transactional
    public List<Customer> getCustomerTownCourse(String town, Long courseId) {
        List<Customer> foundCustomers = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("course.town", town).ignoreCase());
            cr.add(Restrictions.eq("booking.course.id", courseId));
            foundCustomers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return foundCustomers;
    }

    @Transactional
    public List<Customer> getAgeCustomerTownCourse(int age, String town, Long courseId) {
        List<Customer> foundCustomers = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "booking");
            cr.createAlias("booking.course", "course");
            cr.add(Restrictions.eq("course.town", town).ignoreCase());
            cr.add(Restrictions.eq("booking.course.id", courseId));
            cr.add(Restrictions.gt("age", age));
            foundCustomers = cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return foundCustomers;
    }

}
