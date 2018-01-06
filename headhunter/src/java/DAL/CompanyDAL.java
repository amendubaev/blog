package DAL;

import java.util.List;
import model.Company;
import model.Vacancy;
import org.apache.ibatis.session.SqlSession;

public class CompanyDAL extends BaseDAL {

    public CompanyDAL() {
        super();
    }

    public List<Vacancy> selectVacancyForCompany(){
        SqlSession session = sqlSessionFactory.openSession();
        List<Vacancy> vacancys = session.selectList("company.selectVacancyForCompany");
        session.close();
        return vacancys;
    }
    
    public List<Company> selectAll() {
        SqlSession session = sqlSessionFactory.openSession();
        List<Company> companyes = session.selectList("company.selectAll");
        session.close();
        return companyes;
    }

    public Company selectById(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        Company company = session.selectOne("company.selectById", id);
        session.close();
        return company;
    }

    public int insert(Company company) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.insert("company.insert", company);
        session.commit();
        session.close();
        return count;
    }

    public int update(Company company) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.update("company.update", company);
        session.commit();
        session.close();
        return count;
    }

    public int delete(Company company) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.delete("company.delete", company);
        session.commit();
        session.close();
        return count;
    }
}
