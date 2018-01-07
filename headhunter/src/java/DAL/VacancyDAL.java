package DAL;

import java.util.List;
import model.BusyMode;
import model.Category;
import model.Company;
import model.Vacancy;
import org.apache.ibatis.session.SqlSession;

public class VacancyDAL extends BaseDAL {

    public VacancyDAL() {
        super();
    }

    public List<Company> selectVacancyForCompany(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        List<Company> companyes = session.selectList("vacancy.selectVacancyForCompany", id);
        session.close();
        return companyes;
    }
    
    public List<Category> selectVacancyForCategory(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        List<Category> categories = session.selectList("vacancy.selectVacancyForCategory", id);
        session.close();
        return categories;
    }
    
    public List<BusyMode> selectVacancyForBM(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        List<BusyMode> busymodes = session.selectList("vacancy.selectVacancyForBM", id);
        session.close();
        return busymodes;
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
