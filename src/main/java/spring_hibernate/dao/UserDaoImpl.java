package spring_hibernate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring_hibernate.model.User;

import javax.persistence.EntityManagerFactory;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
   @Autowired
    private EntityManagerFactory factory;

    @Override
    public void addUser(User user) {
        var entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<User> getAllUsers() {
        var manager = factory.createEntityManager();
        var users = manager.createQuery("from User", User.class).getResultList();
        return users;

    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
