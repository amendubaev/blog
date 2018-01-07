package DAL;

import java.util.List;
import model.Category;
import model.Vacancy;
import org.apache.ibatis.session.SqlSession;

public class CategoryDAL extends BaseDAL {

    public CategoryDAL() {
        super();
    }
    
    public List<Vacancy> selectVacancyForCategory(int id){
        SqlSession session = sqlSessionFactory.openSession();
        List<Vacancy> vacancys = session.selectList("busymode.selectVacancyForCategory", id);
        session.close();
        return vacancys;
    }

    public List<Category> selectAll() {
        SqlSession session = sqlSessionFactory.openSession();
        List<Category> categoryes = session.selectList("category.selectAll");
        session.close();
        return categoryes;
    }

    public Category selectById(int id) {
        SqlSession session = sqlSessionFactory.openSession();
        Category category = session.selectOne("category.selectById", id);
        session.close();
        return category;
    }

    public int insert(Category category) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.insert("category.insert", category);
        session.commit();
        session.close();
        return count;
    }

    public int update(Category category) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.update("category.update", category);
        session.commit();
        session.close();
        return count;
    }

    public int delete(Category category) {
        SqlSession session = sqlSessionFactory.openSession();
        int count = session.delete("category.delete", category);
        session.commit();
        session.close();
        return count;
    }
}
