package DAL;

import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDAL {

    protected static String config = "mybatis/config.xml";
    protected SqlSessionFactory sqlSessionFactory;

    public BaseDAL() {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(config);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            System.out.println("create sqlSessionFactory  +");
        } catch (IOException ex) {
            Logger.getLogger(BaseDAL.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(BaseDAL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
