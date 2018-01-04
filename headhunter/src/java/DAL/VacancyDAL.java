package DAL;

import java.util.List;
import model.Vacancy;
import org.apache.ibatis.session.SqlSession;

public class VacancyDAL extends BaseDAL {

    public VacancyDAL() {
        super();
    }

    public List<Vacancy> selectAll() {
        SqlSession session = sqlSessionFactory.openSession();
        List<Vacancy> vacancyes = session.selectList("vacancy.selectAll");
        session.close();
        return vacancyes;
    }

    public Vacancy selectById(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        Vacancy vacancy = session.selectOne("vacancy.selectById", id);
        session.close();
        return vacancy;
    }

    public int insert(Vacancy vacancy) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.insert("vacancy.insert", vacancy);
        session.commit();
        session.close();
        return count;
    }

    public int update(Vacancy vacancy) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.update("vacancy.update", vacancy);
        session.commit();
        session.close();
        return count;
    }

    public int delete(Vacancy vacancy) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.delete("vacancy.delete", vacancy);
        session.commit();
        session.close();
        return count;
    }
}
